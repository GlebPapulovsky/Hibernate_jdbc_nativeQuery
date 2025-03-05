package com.example.demo.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MyRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private MyRepositoryInterface myRepository;


    public List<String> getPersonByCity(String city) {
        List<String> result = myRepository.getPersonByCity(city);
        if (result.isEmpty()) {
            return List.of("No person found");
        } else {
            return result;
        }
    }


}
