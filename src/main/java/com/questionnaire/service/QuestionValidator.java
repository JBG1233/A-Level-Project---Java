package com.questionnaire.service;

import com.questionnaire.repositories.QuestionsRepository;
import lombok.extern.slf4j.Slf4j;
import me.xdrop.fuzzywuzzy.FuzzySearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

@Slf4j
@Service

public class QuestionValidator {

    private Errors errors;

    @Autowired
    QuestionsRepository questionsRepository;

    public Integer validate(String QuestionAnswer) {

        Integer index = 0;

        String questionAnswer = QuestionAnswer;

        while (index <= 6) {
            return FuzzySearch.ratio("hello", questionAnswer);
        }
    }
}

