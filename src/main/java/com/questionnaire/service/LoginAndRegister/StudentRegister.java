package com.questionnaire.service.LoginAndRegister;

import com.questionnaire.domain.Score;
import com.questionnaire.domain.Student;
import com.questionnaire.repositories.SchoolRepository;
import com.questionnaire.repositories.ScoresRepository;
import com.questionnaire.repositories.StudentRepository;
import com.questionnaire.service.Exceptions.InternalServerErrorException;
import com.questionnaire.service.Generation.UserId;
import com.questionnaire.service.Exceptions.BadRequestException;
import com.questionnaire.service.Exceptions.ConflictException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
@Service
public class StudentRegister {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    ScoresRepository scoresRepository;

    @Autowired
    SchoolRepository schoolRepository;

    @Autowired
    UserId userId = new UserId();

    public void register(Student student) throws ConflictException, BadRequestException, InternalServerErrorException {
        newStudent(student);
    }

    public void newStudent(Student student) throws ConflictException, BadRequestException, InternalServerErrorException {
        if (schoolRepository.existsBySchoolIDIsIn(student.getSchoolID())) {
            if (!studentRepository.existsByUsernameIsIn(student.getUsername())) {
                String userId = UserId.getUserId(15);
                if (checkForIllegalChars(student.getFirstName())) {
                    if (checkForIllegalChars(student.getLastName())) {
                        if (checkForIllegalChars(student.getUsername())) {
                            createNewStudent(student, userId);
                            createNewScore(userId);
                        } else {
                            throw new BadRequestException("400");
                        }
                    } else {
                        throw new BadRequestException("400");
                    }
                } else {
                    throw new BadRequestException("400");
                }
            } else {
                throw new ConflictException("409");
            }
        } else {
            throw new InternalServerErrorException("500");
        }
    }

    public boolean checkForIllegalChars(String toExamine) {
            Pattern pattern = Pattern.compile("^[@a-zA-Z]");
            Matcher matcher = pattern.matcher(toExamine);
            return matcher.find();
        }

    public void createNewStudent(Student edUser, String userId) {
        log.info("{}", edUser.getPassword() );
        String hashedPassword = BCrypt.hashpw(edUser.getPassword(), BCrypt.gensalt());
        Student newStudent = new Student()  ;
        newStudent.setLastName(edUser.getLastName());
        newStudent.setFirstName(edUser.getFirstName());
        newStudent.setUsername(edUser.getUsername());
        newStudent.setPassword(hashedPassword);
        newStudent.setSchoolID(edUser.getSchoolID());
        newStudent.setUserId(userId);
        studentRepository.save(newStudent);
    }

    public void createNewScore(String userId) {
        Score newScore = new Score();
        newScore.setAnsweredWrong(0);
        newScore.setAnsweredRight(0);
        newScore.setAnswered(0);
        newScore.setQuizzesTaken(0);
        newScore.setUserId(userId);
        newScore.setQWrongLast7(new ArrayList<>());
        newScore.setQRightLast7(new ArrayList<>());
        newScore.setPercentageLast7(new ArrayList<>());
        scoresRepository.save(newScore);
    }
}

