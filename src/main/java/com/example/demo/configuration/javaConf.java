package com.example.demo.configuration;

import com.example.demo.controller.MyController;
import com.example.demo.model.repository.MyRepository;
import jakarta.persistence.EntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConf {
    @Bean
    public MyRepository myRepository(EntityManager em) {
        return new MyRepository(em);

    }

    @Bean
    public MyController myController(MyRepository myRepository) {
        return new MyController(myRepository);
    }

}
