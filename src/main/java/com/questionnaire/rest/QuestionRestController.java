package com.questionnaire.rest;

import com.questionnaire.domain.Question;
import com.questionnaire.domain.QuizGroup;
import com.questionnaire.repositories.QuestionsRepository;
import com.questionnaire.service.Questions.LoadQuestions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@Slf4j
@RestController
@RequestMapping("/rest")
@CrossOrigin(origins = "*")


public class QuestionRestController {

    @Autowired
    LoadQuestions loadQuestions;

    @Autowired
    QuestionsRepository questionsRepository;

    @RequestMapping(method = RequestMethod.GET, value = "/questions/main/{quizId}")
    public Set<Question> loadQuiz (@PathVariable ("quizId") String quizId) {
        return loadQuestions.getQuestions(quizId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/questions/search/{userInput}")
    public List<QuizGroup> loadSearchQuiz(@PathVariable("userInput") String userInput) {
        return loadQuestions.getSearchResults(userInput);
    }
 }
