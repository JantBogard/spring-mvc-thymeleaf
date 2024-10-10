package com.luv2code.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.luv2code.springboot.thymeleafdemo.model.Student;

@Controller
public class StudentController {
	@GetMapping("/showStudentForm")
	public String showForm(Model theModel) {
		// Create the new student object
		Student theStudent = new Student();

		// Add student object to the model
		theModel.addAttribute("student", theStudent);

		return "student-form";
	}

	@PostMapping("/proccessStudentForm")
	public String proccessForm(@ModelAttribute("student") Student theStudent) {
		// log the input data
		System.out.println("The student: " + theStudent.getFirstName() + " " + theStudent.getLastName());

		return "student-confirmation";
	}
}
