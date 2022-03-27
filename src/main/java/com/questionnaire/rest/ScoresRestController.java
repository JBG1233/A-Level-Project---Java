package com.questionnaire.rest;

import com.questionnaire.domain.Question; 
import com.questionnaire.domain.Score;
import com.questionnaire.repositories.ScoresRepository;
import com.questionnaire.service.Exceptions.BadRequestException;
import com.questionnaire.service.Questions.QuestionValidator;
import com.questionnaire.service.Questions.UpdateScores;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

import java.util.ArrayList;

@Slf4j
@RestController
@RequestMapping("/rest")
@CrossOrigin(origins = "*")

public class ScoresRestController {

    @Autowired
    ScoresRepository scoresRepository;

    @Autowired
    QuestionValidator questionValidator;

    @Autowired
    UpdateScores updateScores;

    @RequestMapping(method = RequestMethod.POST, value = "/validation")
    public Integer checkIfAnswersAreValid(@RequestBody ArrayList<Question> question, HttpServletRequest request) throws BadRequestException {
        String userId = request.getHeader("Authorization");
        Integer score = questionValidator.validate(question, 0, userId, "");
        return score;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/leaderboard")
    public Score getLeaderboardStats(HttpServletRequest request) {
        String userId = request.getHeader("Authorization");
        return scoresRepository.findByUserId(userId);
    }
}

