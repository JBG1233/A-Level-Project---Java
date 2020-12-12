package com.questionnaire.service.Questions;

import com.questionnaire.domain.Score;
import com.questionnaire.repositories.ScoresRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
@Slf4j
public class UpdateScores {

    @Autowired
    ScoresRepository scoresRepository;

    public void updateScore(String accessToken, Integer score) {
        Score scores = scoresRepository.findByAccessToken(accessToken);
        Integer qWrong = getQWrong(scores, score);
        Integer qRight = getQRight(scores, score);
        Integer answered = getAnswered(scores);
        Integer quizzesTaken = getQuizzesTaken(scores);
        ArrayList qWrongLast7 = getQWrongLast7(scores, score);
        ArrayList qRightLast7 = getQRightLast7(scores, score);
        ArrayList percentageLast7 = getPercentageLast7(scores, score);
        scoresRepository.deleteByAccessToken(accessToken);
        scoresRepository.save(new Score(qWrong, qRight,answered,quizzesTaken, accessToken, qWrongLast7, qRightLast7, percentageLast7));
    }

    public Integer getQWrong(Score scores, Integer score) {
        Integer qWrong = scores.getAnsweredWrong() + (7 - score);
        return qWrong;
    }

    public Integer getQRight(Score scores, Integer score) {
        Integer qRight = scores.getAnsweredRight() + score;
        return qRight;
    }

    public Integer getAnswered(Score scores) {
        Integer answered = scores.getAnswered() + 7;
        return answered;
    }

    public Integer getQuizzesTaken(Score scores) {
        Integer quizzesTaken = scores.getQuizzesTaken() + 1;
        return quizzesTaken;
    }

    public ArrayList getQWrongLast7(Score scores, Integer score ) {
        ArrayList qWrongLast7 = scores.getQWrongLast7();
        qWrongLast7.add(0, (7 - score));
        if (qWrongLast7.size() >= 7) {
            qWrongLast7.remove(6);
        }
        return qWrongLast7;
    }

    public ArrayList getQRightLast7(Score scores, Integer score) {
        ArrayList qRightLast7 = scores.getQRightLast7();
        qRightLast7.add(0, score);
        if (qRightLast7.size() >= 7) {
            qRightLast7.remove(6);
        }
        return qRightLast7;
    }

    public ArrayList getPercentageLast7(Score scores, Integer score) {
        ArrayList percentageLast7 = scores.getPercentageLast7();
        Float percentage = ((score / (float)7) * 100);
        percentageLast7.add(0, percentage);
        if (percentageLast7.size() >= 7) {
            percentageLast7.remove(6);
        }
        return percentageLast7;
    }

}
