package com.tommi.quotes.api.controller;

import com.tommi.quotes.api.model.Person;
import com.tommi.quotes.api.repository.PersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class PersonController {

    private final PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/people")
    public List<Person> getAllPeople() {
        return (List<Person>)personRepository.findAll();
    }

    @GetMapping("/people/{id}")
    public Person getPersonById(@PathVariable("id") Long id) {
        return personRepository.findById(id)
                .orElse(null);
    }

}
