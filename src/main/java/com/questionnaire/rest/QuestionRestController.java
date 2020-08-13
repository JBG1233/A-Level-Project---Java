package com.questionnaire.rest;


import com.questionnaire.domain.Question;
import com.questionnaire.repositories.QuestionsRepository;
import com.questionnaire.service.RandomNumberGenerator;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.common.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@Slf4j
@RestController
@RequestMapping("/rest/questions")
@CrossOrigin(origins = "http://localhost:3000")

public class QuestionRestController {

    @Autowired
    private QuestionsRepository questionsRepository;

    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();


    @RequestMapping(method = RequestMethod.GET, value = "/UK")
    public Set<Question> loadUKQuiz () {
        Question question = new Question();
        Set<Integer> randomNumbers = randomNumberGenerator.generate(20);
        return questionsRepository.findByQuestionNumberInAndQuestionCode(randomNumbers, "GBP");
    }
}
