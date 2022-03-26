package com.demir.MyDemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student met=new Student(1L,"Metin", "m@gmail.com",LocalDate.of(2012, Month.APRIL,6));
            Student bet=new Student(2L,"bete", "bete@gmail.com",LocalDate.of(2006, Month.APRIL,4));
            studentRepository.saveAll(List.of(met,bet));

        };
    }
}
