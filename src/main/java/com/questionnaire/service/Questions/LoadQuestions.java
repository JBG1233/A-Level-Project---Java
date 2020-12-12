package com.questionnaire.service.Questions;

import com.questionnaire.domain.Question;
import com.questionnaire.domain.QuizGroup;
import com.questionnaire.repositories.QuestionsRepository;
import com.questionnaire.repositories.QuizGroupRepository;
import com.questionnaire.service.Generation.RandomNumberGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import me.xdrop.fuzzywuzzy.FuzzySearch;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Slf4j
@Service
public class LoadQuestions {

    @Autowired
    public QuestionsRepository questionsRepository;

    @Autowired
    public QuizGroupRepository quizGroupRepository;

    @Autowired
    RandomNumberGenerator randomNumberGenerator;

    public Set<Question> getQuestions(String quizId) {
        Set<Question> quizIds = questionsRepository.findByQuizIdIn(quizId);
        List<Question> quizIdList = new ArrayList<>(quizIds);
        Integer startRange = (quizIdList.get(0)) .questionId;
        Integer endRange = (quizIdList.get(19)).questionId;
        Set<Integer> randomNumbers = randomNumberGenerator.generate(startRange, endRange);
        return questionsRepository.findByQuestionIdInAndQuizId(randomNumbers, quizId);
    }

    public List<QuizGroup> getSearchResults(String userInput) {
        List<QuizGroup> quizGroups = new ArrayList<>(quizGroupRepository.findAll());
        List<QuizGroup> searchedGroups = new ArrayList<>();
        for (int groupIndex = 0; groupIndex <= (quizGroups.size()-1); groupIndex++) {
            if (FuzzySearch.ratio(quizGroups.get(groupIndex).quizName, userInput) >= 75) {
                searchedGroups.add(quizGroups.get(groupIndex));
            }
        } return searchedGroups;
    }
}