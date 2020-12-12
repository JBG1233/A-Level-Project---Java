package com.questionnaire.service.LoginAndRegister;

import com.questionnaire.domain.Student;
import com.questionnaire.domain.Teacher;
import com.questionnaire.repositories.ScoresRepository;
import com.questionnaire.repositories.StudentRepository;
import com.questionnaire.service.Generation.AccessToken;
import com.questionnaire.service.Exceptions.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class StudentLogin {

    @Autowired
    public StudentRepository studentRepository;

    @Autowired
    public ScoresRepository scoresRepository;

    @Autowired
    AccessToken accessToken = new AccessToken();

    public Student login(Student student) throws BadRequestException {
        return checkForUsername(student);
    }

    public Student checkForUsername(Student student) throws BadRequestException {
        if (studentRepository.existsByUsernameIsIn(student.getUsername())) {
            return checkForPassword(student);
        } else {
            throw new BadRequestException("Username not found!");
        }
    }

    public Student checkForPassword(Student student) throws BadRequestException {
        if (BCrypt.checkpw(student.getPassword(), studentRepository.findByUsername(student.getUsername()).password)) {
            return studentRepository.findByUsername(student.getUsername());
        } else {
            throw new BadRequestException("Password not found!");
        }
    }
}
