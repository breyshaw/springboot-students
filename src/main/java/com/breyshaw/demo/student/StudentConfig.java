package com.breyshaw.demo.student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
  @Bean // have to annotate this with Bean so that it runs
  CommandLineRunner commandLineRunner(StudentRepository repository) {
    return args -> {
      Student mariam = new Student(
        1L,"Mariam","mariam.jamal@gmail.com", LocalDate.of(2000, Month.JANUARY, 5),21
      );
      Student alex = new Student(
        "Alex","alex@gmail.com", LocalDate.of(2004, Month.JANUARY, 5),21
      );
//This is how we save to the database, invoke the repository, use the saveAll method and that takes a list(passing the students)
      repository.saveAll(
        List.of(mariam,alex)
      );
    };
  }
}
