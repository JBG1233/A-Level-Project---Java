package com.questionnaire.rest;

import com.questionnaire.domain.Student;
import com.questionnaire.domain.User;
import com.questionnaire.repositories.StudentRepository;
import com.questionnaire.service.Exceptions.BadRequestException;
import com.questionnaire.service.Exceptions.ConflictException;
import com.questionnaire.service.Exceptions.InternalServerErrorException;
import com.questionnaire.service.LoginAndRegister.StudentLogin;
import com.questionnaire.service.LoginAndRegister.StudentRegister;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/rest")
@CrossOrigin(origins = "*")

public class StudentRestController {

    @Autowired
    StudentRegister studentRegister;

    @Autowired
    StudentLogin studentLogin;

    @RequestMapping(method = RequestMethod.POST, value = "/student/register")
    public void register(@RequestBody Student student) throws ConflictException, BadRequestException, InternalServerErrorException {
        studentRegister.register(student);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/student/login")
    public Student login(@RequestBody Student student) throws BadRequestException {
        return studentLogin.login(student);
    }

}


