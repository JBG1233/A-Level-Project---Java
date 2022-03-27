package com.questionnaire.service.LoginAndRegister;
import com.questionnaire.domain.Student;
import com.questionnaire.repositories.ScoresRepository;
import com.questionnaire.repositories.StudentRepository;
import com.questionnaire.service.Exceptions.BadRequestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StudentLogin {

    @Autowired
    public StudentRepository studentRepository;

    @Autowired
    public ScoresRepository scoresRepository;

    public Student login(Student edUser) throws BadRequestException {
        return checkForUsername(edUser);
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
