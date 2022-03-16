package com.breyshaw.demo.student;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Adding the "service layer" here. The service layer is mainly responsible for business logic. 

@Service 
public class StudentService {

  private final StudentRepository studentRepository;

  @Autowired
  public StudentService(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  @Autowired
  
  public List<Student> getStudents() {
    return studentRepository.findAll(); //Look at all those methods!
    //Currently brings back an empty array because there are no students
	}
}
