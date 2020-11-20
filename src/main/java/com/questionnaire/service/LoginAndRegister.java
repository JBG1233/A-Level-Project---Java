package com.questionnaire.service;

import com.questionnaire.domain.Score;
import com.questionnaire.domain.User;
import com.questionnaire.repositories.ScoresRepository;
import com.questionnaire.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Slf4j
@Service
public class LoginAndRegister {

    @Autowired
    public UserRepository userRepository;

    @Autowired
    public ScoresRepository scoresRepository;

    @Autowired
    AccessToken accessToken = new AccessToken();

    public User login(User user) throws BadRequestException {
        return checkForUsername(user);
    }

    public User checkForUsername(User user) throws BadRequestException {
        if (userRepository.existsByUsernameIsIn(user.getUsername())) {
            return checkForPassword(user);
        } else {
            throw new BadRequestException("Username not found!");
        }
    }

    public User checkForPassword(User user) throws BadRequestException {
        if (BCrypt.checkpw(user.getPassword(), userRepository.findByUsername(user.getUsername()).password)) {
            return userRepository.findByUsername(user.getUsername());
        } else {
            throw new BadRequestException("Password not found!");
        }
    }

    public void register(User user) throws ConflictException, BadRequestException {
        newUser(user);
    }

    public void newUser(User user) throws ConflictException, BadRequestException {
        if (!userRepository.existsByUsernameIsIn(user.getUsername())) {
            String accessToken = AccessToken.getAccessToken(15);
            if (!checkForIllegalChars(user.getUsername())) {
                throw new BadRequestException("Invalid characters");
            } else {
                if (checkForIllegalSpaces(user.getPassword())) {
                    log.info("{}", checkForIllegalSpaces(user.getPassword()));
                    throw new BadRequestException("Invalid spaces");
                } else {
                    createNewUser(user, accessToken);
                    createNewScore(accessToken);
                }
            }
        } else {
            throw new ConflictException("User already exists");
       }
    }

    public boolean checkForIllegalChars(String toExamine) {
        Pattern pattern = Pattern.compile("^[@a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(toExamine);
        return matcher.find();
    }

    public boolean checkForIllegalSpaces(String toExamine) {
        Pattern pattern = Pattern.compile("^[_ ]*$");
        Matcher matcher = pattern.matcher(toExamine);
        return matcher.find();
    }

    public void createNewUser(User user, String accessToken) {
        String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        User user1 = new User();
        user1.setUsername(user.getUsername());
        user1.setPassword(hashedPassword);
        user1.setAccessToken(accessToken);
        user1.setTime(0);
        userRepository.save(user1);
    }

    public void createNewScore(String accessToken) {
        Score score = new Score();
        score.setAnsweredWrong(0);
        score.setAnsweredRight(0);
        score.setAnswered(0);
        score.setQuizzesTaken(0);
        score.setAccessToken(accessToken);
        score.setQWrongLast7(new ArrayList<>());
        score.setQRightLast7(new ArrayList<>());
        score.setPercentageLast7(new ArrayList<>());
        scoresRepository.save(score);
    }
}