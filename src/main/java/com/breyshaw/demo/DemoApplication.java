package com.breyshaw.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@SpringBootApplication
@RestController //This annotation makes the GetMapping class serve Restful endpoints
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//In order for this method to be served as a restful endpoint, we will have to annotate it with GetMapping
// @GetMapping
// 	public String hello() {
// 		return "Hello World";
// 	}

//Refactoring this so that it gives us a JSON Object straight out of the box!
@GetMapping
	public List<String> hello() {
		return List.of("Hello", "World");
	}

}
