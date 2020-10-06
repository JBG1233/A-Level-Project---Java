package com.questionnaire.service;

import com.questionnaire.domain.Score;
import com.questionnaire.repositories.ScoresRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UpdateScores {

    @Autowired
    ScoresRepository scoresRepository;

    public void updateScore(String accessToken, Integer score) {
        Score scores = scoresRepository.findByAccessToken(accessToken);
        Integer qRight = scores.getAnsweredRight();
        Integer qWrong = scores.getAnsweredWrong();
        Integer answered = scores.getAnswered();
        Integer quizzesTaken = scores.getQuizzesTaken();
        scoresRepository.deleteByAccessToken(accessToken);
        scoresRepository.save(new Score(qWrong + (7-score), qRight + score,answered + 7,quizzesTaken + 1, accessToken));
    }
}

