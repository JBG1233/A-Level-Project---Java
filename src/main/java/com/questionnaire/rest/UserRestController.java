package com.questionnaire.rest;

import com.questionnaire.domain.Contact;
import com.questionnaire.domain.User;
import com.questionnaire.repositories.UserRepository;
import com.questionnaire.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@Slf4j
@RestController
@RequestMapping("/rest")
@CrossOrigin(origins = "*")

public class UserRestController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ContactMe contactMe;

    @Autowired
    LoginAndRegister loginAndRegister;

    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public void register(@RequestBody User user) throws ConflictException, BadRequestException {
        loginAndRegister.register(user);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public User login(@RequestBody User user) throws BadRequestException {
        return loginAndRegister.login(user);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/contact")
    public void contact(@RequestBody Contact newContact, HttpServletRequest request) throws BadRequestException, ForbiddenException {
        String username = request.getHeader("Authorization");
        contactMe.illegalContact(newContact, username);
    }

}


