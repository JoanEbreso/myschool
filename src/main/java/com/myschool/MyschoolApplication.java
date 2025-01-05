package com.myschool;

import com.myschool.entity.Student;
import com.myschool.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class MyschoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyschoolApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(StudentRepository repository) {
//        return (args) -> {
//            // save a few customers
//            repository.save(new Student());
//
//            // fetch all customers
//            log.info("Fetching students");
//            log.info("-------------------------------");
//            repository.findAll().forEach(student -> {
//                log.info(student.toString());
//            });
//
//        };
//    }

}
