package com.questionnaire.repositories;

import com.questionnaire.domain.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryDefinition(domainClass = Contact.class, idClass = String.class)
public interface ContactRepository extends MongoRepository<Contact, String> {
}
