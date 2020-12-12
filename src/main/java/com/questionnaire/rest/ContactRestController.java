package com.questionnaire.rest;

import com.questionnaire.service.Contact.ContactMe;
import com.questionnaire.service.Exceptions.BadRequestException;
import com.questionnaire.service.Exceptions.ForbiddenException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

public class ContactRestController {

    @Autowired
    ContactMe contactMe;

    @RequestMapping(method = RequestMethod.POST, value = "/contact")
    public void contact(@RequestBody com.questionnaire.domain.Contact newContact, HttpServletRequest request) throws BadRequestException, ForbiddenException {
        String username = request.getHeader("Authorization");
        contactMe.illegalContact(newContact, username);
    }
}
