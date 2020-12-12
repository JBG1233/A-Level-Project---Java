package com.questionnaire.repositories;

import com.questionnaire.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryDefinition(domainClass = Student.class, idClass = String.class)
public interface StudentRepository extends MongoRepository<Student, String> {
    Student findByUsername(String username);
    boolean existsByUsernameIsIn(String username);
    void deleteByUsernameAndPassword(String username, String password);
}
