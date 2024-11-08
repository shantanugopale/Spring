package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;
import com.service.StudentService;;

@Controller
public class HomeController {

	@Autowired
	private StudentService service;

	@RequestMapping("/")
	public String landingPage() {
		return "index";
	}

	@RequestMapping("/register")
	public String registrationPage() {
		return "register";
	}

	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}

	@RequestMapping("/logincheck")
	public String logincheck(@RequestParam String username, @RequestParam String password, Model model) {
		List<Student> sList = service.loginCheck(username, password);

		System.out.println(sList);

		if (!sList.isEmpty()) {
			model.addAttribute("data", sList);
			return "success";
		} else {
			return "login";
		}
	}

	@RequestMapping("/savestudent")
	public String savestudent(@ModelAttribute Student stu) {
		System.out.println("Student Contructor Called : " + stu);
		System.out.println(stu);
		service.saveStudent(stu);
		return "register";
	}

	@RequestMapping("/deleteStudent")
	public String deleteStudent(@RequestParam int rno, Model model) {
		System.out.println("Delete Method Called..!" + rno);
		List<Student> sList = service.deleteById(rno);

		if (!sList.isEmpty()) {
			model.addAttribute("data", sList);
			return "success";
		} else {
			return "success";
		}
	}

	@RequestMapping("/getStudentById")
	public String getStudentById(@RequestParam int rno, Model model) {
		System.out.println("Update Method Called..!" + rno);
		Student stu = service.getStudentById(rno);
		model.addAttribute("data", stu);
		return "update";
	}
	
	@RequestMapping("/updatestudent")
	public String updateStudent(@ModelAttribute Student stu, Model model)
	{
		List<Student> sList = service.updateStudent(stu);
		if (!sList.isEmpty()) {
			model.addAttribute("data", sList);
			return "success";
		} else {
			return "success";
		}
	}
}
