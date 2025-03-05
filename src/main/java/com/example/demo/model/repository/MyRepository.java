package com.example.demo.model.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
//repository
@Repository
public class MyRepository {
    @PersistenceContext
    private final EntityManager entityManager;


    public MyRepository(EntityManager entityManager) {
        this.entityManager = entityManager;

    }


    public List<String> getPersonByCity(String city) {
        String hql = "select p.name from Persons p where p.cityOfLiving = :city_of_living";
        TypedQuery<String> query = entityManager.createQuery(hql, String.class);
        query.setParameter("city_of_living", city);
        return query.getResultList();
    }


}
