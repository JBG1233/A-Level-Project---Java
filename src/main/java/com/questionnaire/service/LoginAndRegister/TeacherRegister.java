package com.questionnaire.service.LoginAndRegister;

import com.questionnaire.domain.Score;
import com.questionnaire.domain.Teacher;
import com.questionnaire.repositories.SchoolRepository;
import com.questionnaire.repositories.ScoresRepository;
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
public class TeacherRegister {
    @Autowired
    public TeacherRepository TeacherRepository;

    @Autowired
    public ScoresRepository scoresRepository;

    @Autowired
    public SchoolRepository schoolRepository;

    @Autowired
    AccessToken accessToken = new AccessToken();

    public void register(Teacher teacher) throws ConflictException, BadRequestException, InternalServerErrorException {
        newTeacher(teacher);
    }

    public void newTeacher(Teacher teacher) throws ConflictException, BadRequestException, InternalServerErrorException {
        if (schoolRepository.existsBySchoolIDIsIn(teacher.getSchoolID())) {
            if (!TeacherRepository.existsByUsernameIsIn(teacher.getUsername())) {
                String accessToken = AccessToken.getAccessToken(15);
                if (checkForIllegalChars(teacher.getFirstName())) {
                    if (checkForIllegalChars(teacher.getLastName())) {
                        if (checkForIllegalChars(teacher.getUsername())) {
                            createNewTeacher(teacher, accessToken);
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

    public void createNewTeacher(Teacher teacher, String accessToken) {
        String hashedPassword = BCrypt.hashpw(teacher.getPassword(), BCrypt.gensalt());
        Teacher newTeacher = new Teacher()  ;
        newTeacher.setLastName(teacher.getLastName());
        newTeacher.setFirstName(teacher.getFirstName());
        newTeacher.setUsername(teacher.getUsername());
        newTeacher.setPassword(hashedPassword);
        newTeacher.setRole("teacher");
        newTeacher.setClassID(AccessToken.getAccessToken(5));
        newTeacher.setSchoolID(teacher.getSchoolID());
        newTeacher.setAccessToken(accessToken);
        newTeacher.setTime(0);
        TeacherRepository.save(newTeacher);
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

