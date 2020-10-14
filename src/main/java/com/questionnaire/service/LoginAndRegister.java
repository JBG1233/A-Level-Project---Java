package com.questionnaire.service;

import com.questionnaire.domain.Score;
import com.questionnaire.domain.User;
import com.questionnaire.repositories.ScoresRepository;
import com.questionnaire.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Slf4j
@Service

public class LoginAndRegister {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoresRepository scoresRepository;

    public User login(User user) throws BadRequestException {
        return checkForUsername(user);
    }

    User checkForUsername(User user) throws BadRequestException {
        if (userRepository.existsByUsernameIsIn(user.getUsername())) {
            return checkForPassword(user);
        } else {
            throw new BadRequestException("Username not found!");
        }
    }

    User checkForPassword(User user) throws BadRequestException {
        if (userRepository.existsByPasswordIsIn(user.getPassword())) {
            return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        } else {
            throw new BadRequestException("Password not found!");
        }
    }

    public void register(User user) throws ConflictException {
        newUser(user);
    }

    void newUser(User user) throws ConflictException {
        if ((userRepository.findByUsername(user.getUsername()).username) == null) {
            String accessToken = AccessToken.getAccessToken(15);
            createNewUser(user, accessToken);
            createNewScore(accessToken);
        } else {
            throw new ConflictException("User already exists");
        }
    }

    void createNewUser(User user, String accessToken) {
        User user1 = new User();
        user1.setUsername(user.getUsername());
        user1.setPassword(user.getPassword());
        user1.setAccessToken(accessToken);
        userRepository.save(user);
    }

    void createNewScore(String accessToken) {
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