package com.example.demo.controller;

import com.example.demo.model.repository.MyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    private final MyRepository repository;

    public MyController(MyRepository repository) {
        this.repository = repository;

    }

    @GetMapping("/persons/by-city")
    public ResponseEntity<List<String>> getPersonByCity(@RequestParam String city) {
        List<String> list = (repository.getPersonByCity(city));
        if (list.contains("No person was found")) {
            return ResponseEntity.status(HttpStatus.OK).body(list);
        } else {
            return ResponseEntity.ok(repository.getPersonByCity(city));
        }


    }

}
