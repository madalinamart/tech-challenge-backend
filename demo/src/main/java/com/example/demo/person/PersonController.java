package com.example.demo.person;

import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {


    @Autowired
    private PersonService personService;

    @GetMapping(path = "/persons")
    public List<Person> getPersons()
    {
        return personService.getPersons();
    }
}
