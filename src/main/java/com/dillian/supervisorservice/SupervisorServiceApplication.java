package com.dillian.supervisorservice;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class SupervisorServiceApplication implements CommandLineRunner {

    private final SupervisorGenerator generator;

    public static void main(String[] args) {
        SpringApplication.run(SupervisorServiceApplication.class, args);
    }

    @Override
    public void run(String... args) {
        generator.create();
    }
}
