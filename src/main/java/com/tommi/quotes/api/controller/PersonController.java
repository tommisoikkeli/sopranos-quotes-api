package com.tommi.quotes.api.controller;

import com.tommi.quotes.api.model.Person;
import com.tommi.quotes.api.repository.PersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/people")
    public List<Person> findAll() {
        return (List<Person>)personRepository.findAll();
    }

    @GetMapping("/people/{id}")
    public Person findPersonById(@PathVariable("id") Long id) {
        return personRepository.findById(id)
                .orElse(null);
    }

}
