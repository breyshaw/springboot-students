package com.breyshaw.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import com.breyshaw.demo.student.Student;

@SpringBootApplication
@RestController // This annotation makes the GetMapping class serve Restful endpoints
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// In order for this method to be served as a restful endpoint, we will have to
	// annotate it with GetMapping
	// @GetMapping
	// public String hello() {
	// return "Hello World";
	// }

	// Refactoring this so that it gives us a JSON Object straight out of the box!
	@GetMapping
	public List<Student> hello() {
		return List.of(
				new Student(
						// Passing the info to create the student here
						1L,
						"Mariam",
						"mariam.jamal@gmail.com",
						LocalDate.of(2000, Month.JANUARY, 5),
						21));
	}

}
