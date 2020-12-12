package com.questionnaire.repositories;

import com.questionnaire.domain.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryDefinition(domainClass = Teacher.class, idClass = String.class)
public interface TeacherRepository extends MongoRepository<Teacher, String> {
    Teacher findByUsername(String username);
    boolean existsByClassIDIsIn(String classID);
    boolean existsByUsernameIsIn(String username);
    void deleteByUsernameAndPassword(String username, String password);
}
