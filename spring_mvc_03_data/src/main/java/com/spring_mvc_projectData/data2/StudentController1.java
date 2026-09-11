package com.spring_mvc_projectData.data2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController1 {
	@RequestMapping("/student/studentForm2")
	public String studentFormView2() {
		return "student/studentForm4";
	}
	
	@RequestMapping("/student/newStudent6")
	public String insertStudent6(Student1 student) {
		return "student/studentResult4";
	}
}
