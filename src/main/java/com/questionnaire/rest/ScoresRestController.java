package com.questionnaire.rest;

import com.questionnaire.domain.Question;
import com.questionnaire.domain.Score;
import com.questionnaire.repositories.ScoresRepository;
import com.questionnaire.service.QuestionValidator;
import com.questionnaire.service.UpdateScores;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import java.util.ArrayList;

@Slf4j
@RestController
@RequestMapping("/rest")
@CrossOrigin(origins = "http://localhost:3000")

public class ScoresRestController {

    @Autowired
    private ScoresRepository scoresRepository;

    @Autowired
    QuestionValidator questionValidator = new QuestionValidator();

    @Autowired
    UpdateScores updateScores = new UpdateScores();

    @RequestMapping(method = RequestMethod.POST, value = "/validation")
    public Integer checkIfAnswersAreValid(@RequestBody ArrayList<Question> question, HttpServletRequest request) throws IOException {
        String accessToken = request.getHeader("Authorization");
        Integer score = questionValidator.validate(question, 0);
        updateScores.updateScore(accessToken, score);
        return score;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/leaderboard")
    public Score getLeaderboardStats(HttpServletRequest request) throws IOException {
        String accessToken = request.getHeader("Authorization");
        return scoresRepository.findByAccessToken(accessToken);
    }
}

