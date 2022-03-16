package com.breyshaw.demo.student;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
//The following creates the url path. When the endpoint is accessed, the Student Controller is executed

@RequestMapping(path = "api/v1/student")
public class StudentController {

  //refernce to student service
  private final StudentService studentService;
  //passing StudentService inside the controller
  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

@GetMapping
//Now when the endpoint is hit, the following is executed by the studentService.
public List<Student> getStudents() {
  return studentService.getStudents();
	}
}
