package com.questionnaire.repositories;

import com.questionnaire.domain.QuizGroup;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@RepositoryDefinition(domainClass = QuizGroup.class, idClass = String.class)
public interface QuizGroupRepository extends MongoRepository<QuizGroup, String> {
}
