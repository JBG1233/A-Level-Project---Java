package com.questionnaire.service.LoginAndRegister;

import com.questionnaire.domain.Score;
import com.questionnaire.domain.Student;
import com.questionnaire.repositories.SchoolRepository;
import com.questionnaire.repositories.ScoresRepository;
import com.questionnaire.repositories.StudentRepository;
import com.questionnaire.repositories.TeacherRepository;
import com.questionnaire.service.Exceptions.InternalServerErrorException;
import com.questionnaire.service.Generation.AccessToken;
import com.questionnaire.service.Exceptions.BadRequestException;
import com.questionnaire.service.Exceptions.ConflictException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class StudentRegister {
    @Autowired
    public StudentRepository StudentRepository;

    @Autowired
    public TeacherRepository teacherRepository;

    @Autowired
    public ScoresRepository scoresRepository;

    @Autowired
    public SchoolRepository schoolRepository;

    @Autowired
    AccessToken accessToken = new AccessToken();

    public void register(Student student) throws ConflictException, BadRequestException, InternalServerErrorException {
        newStudent(student);
    }

    public void newStudent(Student student) throws ConflictException, BadRequestException, InternalServerErrorException {
        if (teacherRepository.existsByClassIDIsIn(student.getClassID())) {
            if (!StudentRepository.existsByUsernameIsIn(student.getUsername())) {
                String accessToken = AccessToken.getAccessToken(15);
                if (checkForIllegalChars(student.getFirstName())) {
                    if (checkForIllegalChars(student.getLastName())) {
                        if (checkForIllegalChars(student.getUsername())) {
                            createNewStudent(student, accessToken);
                            createNewScore(accessToken);
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

    public void createNewStudent(Student student, String accessToken) {
        String hashedPassword = BCrypt.hashpw(student.getPassword(), BCrypt.gensalt());
        Student newStudent = new Student();
        newStudent.setFirstName(student.getFirstName());
        newStudent.setLastName(student.getLastName());
        newStudent.setUsername(student.getUsername());
        newStudent.setPassword(hashedPassword);
        newStudent.setRole("student");
        newStudent.setClassID(student.getClassID());
        newStudent.setAccessToken(accessToken);
        newStudent.setTime(0);
        StudentRepository.save(newStudent);
    }

    public void createNewScore(String accessToken) {
        Score newScore = new Score();
        newScore.setAnsweredWrong(0);
        newScore.setAnsweredRight(0);
        newScore.setAnswered(0);
        newScore.setQuizzesTaken(0);
        newScore.setAccessToken(accessToken);
        newScore.setQWrongLast7(new ArrayList<>());
        newScore.setQRightLast7(new ArrayList<>());
        newScore.setPercentageLast7(new ArrayList<>());
        scoresRepository.save(newScore);
    }
}

