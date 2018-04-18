package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentSController {
	
	
	
	

	@RequestMapping("/student-form")
	public String studentForm(Model model) {
		
		Student student = new Student();
		
		model.addAttribute("student", student);
		
		return "student-form";
	}
	
	
	@RequestMapping("/processStudent")
	public String processStudent(@ModelAttribute("student") Student student) {
		
		System.out.printf("The newly applied student is: %s %s, %d", student.getLastName(), student.getFirstName(), student.getAge());
		
		return "student-confirmation";
	}
	
}
