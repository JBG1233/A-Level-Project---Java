package com.questionnaire.service;

import com.questionnaire.domain.Question;
import com.questionnaire.repositories.QuestionsRepository;
import lombok.extern.slf4j.Slf4j;
import me.xdrop.fuzzywuzzy.FuzzySearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service

public class QuestionValidator {

    @Autowired
    private QuestionsRepository questionsRepository;

    private Integer score = 0;

    public Integer validate(String QuestionAnswer, Integer QuestionNumber, String QuestionCode) {
        for (int i = 0; i <= 6; i++) {
            String realAnswer = (questionsRepository.findByQuestionNumberAndQuestionCode(QuestionNumber, QuestionCode)).get(0).questionAnswer;
            score = validateAnswers(QuestionAnswer, realAnswer);
        }
        log.info("You scored {}", score);
        return score;
    }

    private Integer validateAnswers(String questionAnswer, String realAnswer) {
        return calculateScore(FuzzySearch.ratio(realAnswer, questionAnswer));
    }

    public Integer calculateScore(Integer validatedScore) {
        if (validatedScore >= 80) {
            score = score + 1;
        }
        return score;
    }
}

