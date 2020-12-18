package com.questionnaire.rest;

import com.questionnaire.domain.Teacher;
import com.questionnaire.repositories.TeacherRepository;
import com.questionnaire.service.Exceptions.BadRequestException;
import com.questionnaire.service.Exceptions.ConflictException;
import com.questionnaire.service.Exceptions.InternalServerErrorException;
import com.questionnaire.service.LoginAndRegister.TeacherLogin;
import com.questionnaire.service.LoginAndRegister.TeacherRegister;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/rest")
@CrossOrigin(origins = "*")

public class TeacherRestController {

    @Autowired
    TeacherRegister teacherRegister;

    @Autowired
    TeacherLogin teacherLogin;

    @Autowired
    TeacherRepository teacherRepository;

    @RequestMapping(method = RequestMethod.POST, value = "/teacher/register")
    public void register(@RequestBody Teacher teacher) throws ConflictException, BadRequestException, InternalServerErrorException {
        teacherRegister.register(teacher);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/teacher/login")
    public Teacher login(@RequestBody Teacher teacher) throws BadRequestException {
        return teacherLogin.login(teacher);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/teacher/getClassId")
    public String getClassId(@RequestBody Teacher teacher) {
        return teacherRepository.findByUsername(teacher.getUsername()).classID;
    }
    
}


