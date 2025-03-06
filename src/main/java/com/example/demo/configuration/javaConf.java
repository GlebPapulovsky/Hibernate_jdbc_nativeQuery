package com.example.demo.configuration;

import com.example.demo.controller.MyController;
import com.example.demo.model.repository.JpaRepositoryInterface;
import com.example.demo.model.repository.MyRepository;
import com.example.demo.service.MyService;
import jakarta.persistence.EntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConf {
    @Bean
    public MyRepository myRepository(EntityManager em, JpaRepositoryInterface jpaRepositoryInterface) {
        return new MyRepository(em, jpaRepositoryInterface);

    }
    @Bean
    public MyController myController(MyRepository myRepository) {
        return new MyController(myRepository);
    }

    @Bean
    public MyService myService(MyRepository myRepository) {
        return new MyService(myRepository);
    }


}
