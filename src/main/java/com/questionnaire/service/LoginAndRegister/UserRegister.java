package com.questionnaire.service.LoginAndRegister;

import com.questionnaire.domain.Score;
import com.questionnaire.domain.User;
import com.questionnaire.repositories.ScoresRepository;
import com.questionnaire.repositories.UserRepository;
import com.questionnaire.service.Generation.UserId;
import com.questionnaire.service.Exceptions.BadRequestException;
import com.questionnaire.service.Exceptions.ConflictException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UserRegister {

    @Autowired
    public UserRepository userRepository;

    @Autowired
    public ScoresRepository scoresRepository;

    @Autowired
    UserId userId = new UserId();

    public void register(User user) throws ConflictException, BadRequestException {
        newUser(user);
    }

    public void newUser(User user) throws ConflictException, BadRequestException {
        if (!userRepository.existsByUsernameIsIn(user.getUsername())) {
            String userId = UserId.getUserId(15);
            if (checkForIllegalChars(user.getUsername())) {
                createNewUser(user, userId);
                createNewScore(userId);
            } else {
                throw new BadRequestException("400");
            }
        } else {
            throw new ConflictException("User already exists");
        }
    }

    public boolean checkForIllegalChars(String toExamine) {
        Pattern pattern = Pattern.compile("^[@a-zA-Z]");
        Matcher matcher = pattern.matcher(toExamine);
        return matcher.find();
    }

    public void createNewUser(User user, String userId) {
        String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(hashedPassword);
        newUser.setUserId(userId);
        userRepository.save(newUser);
    }

    public void createNewScore(String userId) {
        Score newScore = new Score();
        newScore.setAnsweredWrong(0);
        newScore.setAnsweredRight(0);
        newScore.setAnswered(0);
        newScore.setQuizzesTaken(0);
        newScore.setUserId(userId);
        newScore.setQWrongLast7(new ArrayList<>());
        newScore.setQRightLast7(new ArrayList<>());
        newScore.setPercentageLast7(new ArrayList<>());
        scoresRepository.save(newScore);
    }
}
