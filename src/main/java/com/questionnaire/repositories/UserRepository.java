package com.questionnaire.repositories;

import com.questionnaire.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryDefinition(domainClass = User.class, idClass = String.class)
public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
    User findByUsernameAndPassword(String username, String password);
    boolean existsByUsernameIsIn(String username);
    boolean existsByPasswordIsIn(String password);

}
