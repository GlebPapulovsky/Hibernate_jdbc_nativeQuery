package com.example.demo.controller;

import com.example.demo.model.persons.Persons;
import com.example.demo.model.repository.MyRepository;
import com.example.demo.service.MyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {
    private final MyService myService;


    public MyController(MyRepository repository) {
        this.myService = new MyService(repository);

    }


    //localhost:8080/persons/by-city?city=Moscow
    @GetMapping("persons/by-city")
    public ResponseEntity<List<String>> getPersonsByCity(String city) {
        List<String> persons = myService.getPersonsByCity(city);
        if (persons.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(persons);
        }
    }

    @GetMapping("persons/by-age")
    public ResponseEntity<List<Persons>> getPersonsByAge(Integer age) {
        List<Persons> persons = myService.getPersonsByAge(age);
        if (persons.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(persons);
        }
    }

    @GetMapping("persons/by-name-and-surname")
    public ResponseEntity<Optional<Persons>> getPersonsByNameAndSurname(String name, String surname) {
        return new ResponseEntity<>(myService.getPersonsByNameAndSurname(name, surname), null, 200);
    }


}
