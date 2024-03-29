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

    public List<QuizGroup> getSearchResults(String userInput) {
        List<QuizGroup> quizGroups = new ArrayList<>(quizGroupRepository.findAll());
        List<QuizGroup> searchedGroups = new ArrayList<>();
        for (int groupIndex = 0; groupIndex <= (quizGroups.size()-1); groupIndex++) {
            if (FuzzySearch.ratio(quizGroups.get(groupIndex).searchTerm, userInput) >= 75) {
                searchedGroups.add(quizGroups.get(groupIndex));
            }
        } return searchedGroups;
    }

    public List<QuizGroup> getViewResults(String groupId) {
        List<QuizGroup> quizGroups = new ArrayList<>(quizGroupRepository.findAll());
        List<QuizGroup> searchedGroups = new ArrayList<>();
        for (int groupIndex = 0; groupIndex <= (quizGroups.size()-1); groupIndex++) {
            if (quizGroups.get(groupIndex).groupId.equals(groupId)) {
                searchedGroups.add(quizGroups.get(groupIndex));
            }
        } return searchedGroups;
    }
}

