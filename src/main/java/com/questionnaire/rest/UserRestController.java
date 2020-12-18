package com.questionnaire.rest;

import com.questionnaire.domain.User;
import com.questionnaire.service.Exceptions.BadRequestException;
import com.questionnaire.service.Exceptions.ConflictException;
import com.questionnaire.service.LoginAndRegister.UserLogin;
import com.questionnaire.service.LoginAndRegister.UserRegister;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/rest")
@CrossOrigin(origins = "*")

public class UserRestController {

    @Autowired
    UserLogin userLogin;

    @Autowired
    UserRegister userRegister;

    @RequestMapping(method = RequestMethod.POST, value = "/user/register")
    public void register(@RequestBody User user) throws ConflictException, BadRequestException {
        userRegister.register(user);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user/login")
    public User login(@RequestBody User user) throws BadRequestException {
        return userLogin.login(user);
    }

}


