package com.questionnaire.rest;

import com.questionnaire.domain.Question;
import com.questionnaire.domain.QuizGroup;
import com.questionnaire.repositories.QuestionsRepository;
import com.questionnaire.repositories.QuizGroupRepository;
import com.questionnaire.service.Populate.QuizCreation;
import com.questionnaire.service.Questions.LoadQuestions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
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
    QuizCreation quizCreation;

    @Autowired
    QuestionsRepository questionsRepository;

    @Autowired
    QuizGroupRepository quizGroupRepository;

    @RequestMapping(method = RequestMethod.POST, value = "/create/questions")
    public void createQuestions (@RequestBody ArrayList<Question> question) {
        quizCreation.createQuestions(question);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create/quizGroup")
    public void createQuizGroup (@RequestBody QuizGroup quizGroup) {
        quizCreation.createGroup(quizGroup);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/questions/main/{groupId}")
    public Set<Question> loadQuiz (@PathVariable ("groupId") String groupId) {
        return questionsRepository.findByGroupIdIn(groupId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/questions/search/{userInput}")
    public List<QuizGroup> loadSearchQuiz(@PathVariable("userInput") String userInput) {
        return loadQuestions.getSearchResults(userInput);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/questions/view/{groupId}")
    public List<QuizGroup> loadViewQuiz(@PathVariable("groupId") String groupId) {
        return loadQuestions.getViewResults(groupId);
    }


 }
