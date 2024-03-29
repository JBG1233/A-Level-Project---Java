package com.questionnaire.repositories;

import com.questionnaire.domain.Question;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
@RepositoryDefinition(domainClass = Question.class, idClass = String.class)
public interface QuestionsRepository extends MongoRepository<Question, String> {
    Question findBy_id(ObjectId _id);
    Set<Question> findByQuestionIdInAndGroupId(Set<Integer> questionId, String groupId);
    List<Question> findByQuestionIdAndGroupId(Integer questionId, String groupId );
    Set<Question> findByGroupIdIn(String groupId);
}
