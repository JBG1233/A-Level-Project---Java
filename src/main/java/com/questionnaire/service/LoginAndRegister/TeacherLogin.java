package com.questionnaire.service.LoginAndRegister;

import com.questionnaire.domain.Teacher;
import com.questionnaire.repositories.ScoresRepository;
import com.questionnaire.repositories.TeacherRepository;
import com.questionnaire.service.Generation.AccessToken;
import com.questionnaire.service.Exceptions.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class TeacherLogin {

    @Autowired
    public TeacherRepository teacherRepository;

    @Autowired
    public ScoresRepository scoresRepository;

    @Autowired
    AccessToken accessToken = new AccessToken();

    public Teacher login(Teacher teacher) throws BadRequestException {
        return checkForUsername(teacher);
    }

    public Teacher checkForUsername(Teacher teacher) throws BadRequestException {
        if (teacherRepository.existsByUsernameIsIn(teacher.getUsername())) {
            return checkForPassword(teacher);
        } else {
            throw new BadRequestException("Username not found!");
        }
    }

    public Teacher checkForPassword(Teacher teacher) throws BadRequestException {
        if (BCrypt.checkpw(teacher.getPassword(), teacherRepository.findByUsername(teacher.getUsername()).password)) {
            return teacherRepository.findByUsername(teacher.getUsername());
        } else {
            throw new BadRequestException("Password not found!");
        }
    }
}
