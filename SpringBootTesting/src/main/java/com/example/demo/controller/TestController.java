package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;


@RestController
public class TestController {
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	 public Student firstPage() {

		 Student student = new Student();

		 student.setStudentName("Sudhanshu");

		 student.setStudentId(101);
		 student.setLikesSport("Cricket");

		 return student;
}
}
