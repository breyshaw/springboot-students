package com.breyshaw.demo.student;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
// The following creates the url path. When the endpoint is accessed, the
// Student Controller is executed

@RequestMapping(path = "api/v1/student")
public class StudentController {

  // refernce to student service
  private final StudentService studentService;

  // passing StudentService inside the controller
  // Autowired allows StudentService to be instantiated. In order for it to be
  // instantiated though, it will need to be a bean
  @Autowired
  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping
  // Now when the endpoint is hit, the following is executed by the
  // studentService.
  public List<Student> getStudents() {
    return studentService.getStudents();
  }

  // Here we will impement the API that will take a payload and store it in our
  // system
  @PostMapping // POST - taking the request body and mapping it to a student
  public void registerNewStudent(@RequestBody Student student) {
    studentService.addNewStudent(student);
  }

  @DeleteMapping(path = "{studentId}")
  public void deleteStudent(@PathVariable("studentId") Long id) {
    studentService.deleteStudent(id);
  }
}
