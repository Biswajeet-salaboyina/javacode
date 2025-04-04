package com.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/student")
@RestController
public class StudentProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentProjectApplication.class, args);
	}
	
	@GetMapping("/message")
	public String getMessage()
	{
		return "welcome to spring";
	}
	
	@GetMapping("/display")
	public String getdisplay()
	{
		return "Welcome to display";
	}

}
