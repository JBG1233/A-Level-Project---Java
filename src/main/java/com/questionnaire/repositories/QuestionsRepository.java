package com.questionnaire.repositories;

import com.questionnaire.domain.Question;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.Set;

@RepositoryDefinition(domainClass = Question.class, idClass = String.class)
public interface QuestionsRepository extends MongoRepository<Question, String> {
    Question findBy_id(ObjectId _id);
    Set<Question> findByQuestionNumberInAndQuestionCode(Set<Integer> questionNumber, String questionCode );
    boolean findByQuestionCodeIsIn(String questionCode );


}
