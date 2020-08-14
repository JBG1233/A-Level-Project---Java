package com.questionnaire.repositories;

import com.questionnaire.domain.Question;
import com.questionnaire.domain.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = User.class, idClass = String.class)
public interface UserRepository extends MongoRepository<User, String> {
    User set_id(ObjectId _id);
}
