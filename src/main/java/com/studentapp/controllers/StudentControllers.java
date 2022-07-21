package com.studentapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.studentapp.dto.StudentData;
import com.studentapp.entities.Student;
import com.studentapp.services.StudentService;

@Controller
public class StudentControllers {

	@Autowired
	private StudentService studService;
	
	@RequestMapping("/loadPage")
	public String LoadStudentPage() {
		return "student_registration_form";
		
	}
	@RequestMapping("/saveStudent")
	public String saveOneStudent(@ModelAttribute("object") Student stud) {
		studService.saveOneStudent(stud);
		return "student_registration_form";
		}
	@RequestMapping("/listStudent")
	public String listAllStudent(ModelMap model) {
		List<Student> studs=studService.findAllStudent();
		model.addAttribute("studs", studs);
		return "view_student";
	}
	
	@RequestMapping("/deleteStud")
	public String deleteOneStudent(@RequestParam("id") long id,ModelMap model) {
		studService.deleteOneStudentById(id);
		
		
		List<Student> studs=studService.findAllStudent();
		model.addAttribute("studs", studs);
		return "view_student";
	}
	
	@RequestMapping("/updateStud")
	public String viewStudentUpdatePage(@RequestParam("id") long id,ModelMap model) {
		Student stud=studService.findOneStudent(id);
		model.addAttribute("stud", stud);
		if(stud!=null) {
		return "update_student";
		}else
			return "student_error";
	} 
	
	@RequestMapping("/updateStudent")
	public String updateOneStudent(@ModelAttribute("xyz") StudentData data,ModelMap model) {
		Student stud=new Student();
		stud.setId(data.getId());
		stud.setName(data.getName());
		stud.setEmail(data.getEmail());
		stud.setMobile(data.getMobile());;
		stud.setFee(data.getFee());
		
		studService.saveOneStudent(stud);
		
		List<Student> studs=studService.findAllStudent();
		model.addAttribute("studs", studs);
		return "view_student";
	}
}
