package com.questionnaire.rest;

import com.questionnaire.domain.Score;
import com.questionnaire.domain.User;
import com.questionnaire.repositories.ScoresRepository;
import com.questionnaire.repositories.UserRepository;
import com.questionnaire.service.AccessToken;
import com.questionnaire.service.BadRequestException;
import com.questionnaire.service.ConflictException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@RestController
@RequestMapping("/rest")
@CrossOrigin(origins = "http://localhost:3000")

public class UserRestController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoresRepository scoresRepository;


    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public User register(@RequestBody User user) throws ConflictException {
        if ((userRepository.findByUsername(user.getUsername())) == null) {
            String accessToken = AccessToken.getAccessToken(15);
            ArrayList qWrongLast7 = new ArrayList<>();
            ArrayList qRightLast7 = new ArrayList<>();
            ArrayList qPercentageLast7 = new ArrayList<>();
            scoresRepository.save(new Score(0, 0,0,0, accessToken, qWrongLast7, qRightLast7, qPercentageLast7));
            return userRepository.save(new User(user.getUsername(), user.getPassword(), accessToken));
        } else {
            throw new ConflictException("User already exists");
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public String login(@RequestBody User user) throws BadRequestException {
        if ((userRepository.findByUsername(user.getUsername())).username == null) {
            throw new BadRequestException("Username or password not found");
        } else {
            if ((userRepository.findByPassword(user.getPassword())).password == null) {
                throw new BadRequestException("Username or password not found");
            } else {
                return (userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword())).accessToken;
            }
        }
    }
}


