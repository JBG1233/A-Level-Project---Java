package com.questionnaire.repositories;

import com.questionnaire.domain.School;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryDefinition(domainClass = School.class, idClass = String.class)
public interface SchoolRepository extends MongoRepository<School, String> {
    boolean existsBySchoolIDIsIn(String schoolID);
}
