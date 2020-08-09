package com.questionnaire.rest;


import com.questionnaire.domain.Question;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/rest/questions")


public class QuestionRestController {

    @RequestMapping(method = RequestMethod.GET, value = "/UK")
    public List<Question> loadUKQuiz () {
            Question question = new Question();
            question.setQuestionText("Test Q 1");
            question.setQuestionNumber(1);
        List<Question> loadUKQuiz = new ArrayList();
            loadUKQuiz.add(question);
        return loadUKQuiz;
    }

}
