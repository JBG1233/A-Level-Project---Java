package com.questionnaire.repositories;

import com.questionnaire.domain.Score;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryDefinition(domainClass = Score.class, idClass = String.class)
public interface ScoresRepository extends MongoRepository<Score, String> {
    Score findByAccessToken(String accessToken);
    void deleteByAccessToken(String accessToken);
}

