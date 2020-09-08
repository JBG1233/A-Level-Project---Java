package com.questionnaire.rest;

import com.questionnaire.domain.User;
import com.questionnaire.repositories.UserRepository;
import com.questionnaire.service.Access_Token;
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


    @RequestMapping(method = RequestMethod.POST, value = "/Register")
    public User register(@RequestBody User user) throws ConflictException {
        if (userRepository.findByUsernameIn(user.getUsername()) == null) {
            String access_Token = Access_Token.getAlphaNumericString(15);
            return userRepository.save(new User(user.getUsername(), user.getPassword(), access_Token));
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


