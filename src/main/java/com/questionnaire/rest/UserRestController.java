package com.questionnaire.rest;

import com.questionnaire.domain.User;
import com.questionnaire.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/rest")
@CrossOrigin(origins = "*")

public class UserRestController {

    @Autowired
    LoginAndRegister loginAndRegister = new LoginAndRegister();

    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public void register(@RequestBody User user) throws ConflictException {
        loginAndRegister.register(user);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public User login(@RequestBody User user) throws BadRequestException {
        return loginAndRegister.login(user);
    }

}


