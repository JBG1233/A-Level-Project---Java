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

@Slf4j
@RestController
@RequestMapping("/rest")
@CrossOrigin(origins = "http://localhost:3000")

public class UserRestController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoresRepository scoresRepository;


    @RequestMapping(method = RequestMethod.POST, value = "/Register")
    public User register(@RequestBody User user) throws ConflictException {
        if (userRepository.findByUsernameIn(user.getUsername()) == null) {
            String accessToken = AccessToken.getAlphaNumericString(15);
            scoresRepository.save(new Score(0, 0,0,0, accessToken));
            return userRepository.save(new User(user.getUsername(), user.getPassword(), accessToken));
        } else {
            throw new ConflictException("User already exists");
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/Login")
    public User login(@RequestBody User user) throws BadRequestException {
        if (userRepository.findByUsernameIn(user.getUsername()) == null) {
            throw new BadRequestException("Username or password not found");
        } else {
            if (userRepository.findByPasswordIn(user.getPassword()) == null) {
                throw new BadRequestException("Username or password not found");
            } else {
                return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
            }
        }
    }
}


