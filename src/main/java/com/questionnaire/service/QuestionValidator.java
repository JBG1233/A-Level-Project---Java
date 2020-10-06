package com.questionnaire.service;

import com.questionnaire.domain.Question;
import com.questionnaire.repositories.QuestionsRepository;
import lombok.extern.slf4j.Slf4j;
import me.xdrop.fuzzywuzzy.FuzzySearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Slf4j
@Service

public class QuestionValidator {

    @Autowired
    private QuestionsRepository questionsRepository;


    public Integer validate(ArrayList<Question> question, Integer score) {
        for (int questionIndex = 0; questionIndex <= 6; questionIndex++) {
            String userQuestionAnswer = question.get(questionIndex).userQuestionAnswer;
            Integer questionNumber = question.get(questionIndex).questionNumber;
            String questionCode = question.get(questionIndex).questionCode;
            String realAnswer = (questionsRepository.findByQuestionNumberAndQuestionCode(questionNumber, questionCode)).get(0).questionAnswer;
            score = validateAnswers(userQuestionAnswer, realAnswer, score);
        }
        return score;
    }

    private Integer validateAnswers(String questionAnswer, String realAnswer, Integer score) {
        return calculateScore(FuzzySearch.ratio(realAnswer, questionAnswer), score);
    }

    private Integer calculateScore(Integer validatedScore, Integer score) {
        if (validatedScore >= 80) {
            score = score + 1;
        }
        return score;   
    }
}

