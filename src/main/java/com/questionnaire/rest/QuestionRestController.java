package com.questionnaire.rest;


import com.questionnaire.domain.Question;
import com.questionnaire.repositories.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/rest/questions")
@CrossOrigin(origins = "http://localhost:3000")

public class QuestionRestController {

    @Autowired
    private QuestionsRepository questionsRepository;


    @RequestMapping(method = RequestMethod.GET, value = "/UK")
    public List<Question> loadUKQuiz () {
            //Question question = new Question();
            //question.setQuestionCode("CAD");
            //question.setQuestionText("What leaf is on the Canadian flag??");
            //question.setQuestionNumber(1);
            //questionsRepository.save(question);
        //List<Question> loadUKQuiz = new ArrayList();
           ///loadUKQuiz.add(question);
        return questionsRepository.findByQuestionNumberEqualsOrRandNum();
    }

}
