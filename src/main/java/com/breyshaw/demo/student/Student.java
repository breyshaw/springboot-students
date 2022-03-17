package com.breyshaw.demo.student;
import javax.persistence.Table;
import javax.persistence.Transient;
//Best practice is to make sure to use javax.persistence, that way if we change from hibernate to another provider, things will still work
import java.time.LocalDate;
import java.time.Period;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //This annotation is for hibernate
@Table //This is for the table in my database

public class Student {
  @Id
  @SequenceGenerator (
    name = "student_sequence",
    sequenceName = "student_sequence",
    allocationSize = 1 //number of students in the Table increments by 1
  )

  @GeneratedValue (
    strategy = GenerationType.SEQUENCE,
    generator = "student_sequence"
  )
  private Long id;
  private String name;
  private String email;
  private LocalDate dob;
@Transient //This annotation lets the machine know that this Integer does not have to be in a column, allowing us to remove it from the constructor because I am going to use DOB to caluclate age
  private Integer age;

  public Student() {

  }

  public Student(String name, String email, LocalDate dob) {
    this.name = name;
    this.email = email;
    this.dob = dob;
  }

  public Student(Long id, String name, String email, LocalDate dob) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.dob = dob;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LocalDate getDob() {
    return this.dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public Integer getAge() {
    //This function caluclates the number of years between the users dob to the current date and returns that as an Integer
    return Period.between(dob, LocalDate.now()).getYears();
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
        " id='" + getId() + "'" +
        ", name='" + getName() + "'" +
        ", email='" + getEmail() + "'" +
        ", dob='" + getDob() + "'" +
        ", age='" + getAge() + "'" +
        "}";
  }

}
