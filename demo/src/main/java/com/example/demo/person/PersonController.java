package com.example.demo.person;

import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/persons")
public class PersonController {



    private PersonService personService;

    @GetMapping(value= "/all")
    public List<Person> getPersons()
    {
        return personService.getPersons();
    }
}
