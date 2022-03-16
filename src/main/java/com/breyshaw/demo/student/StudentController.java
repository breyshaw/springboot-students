package com.breyshaw.demo.student;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.time.Month;

@RestController
//The following creates the url path. When the endpoint is accessed, the Student Controller is executed

@RequestMapping(path = "api/v1/student")
public class StudentController {

@GetMapping
public List<Student> getStudents() {
		return List.of(
				new Student(
						1L,
						"Mariam",
						"mariam.jamal@gmail.com",
						LocalDate.of(2000, Month.JANUARY, 5),
						21));
	}
}
