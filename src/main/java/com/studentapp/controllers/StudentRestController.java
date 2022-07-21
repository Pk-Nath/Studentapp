package com.studentapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.studentapp.entities.Student;
import com.studentapp.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentRestController {

	@Autowired
	private StudentService studService;
	@GetMapping
	public List<Student> getAllStudent(){
		List<Student> studs=studService.findAllStudent();
		return studs;	
	}
	
	@PostMapping
	public void saveOneStudent(@RequestBody Student stud) {
		studService.saveOneStudent(stud);
	}
	
	@PutMapping
	public void updateOnestudent(@RequestBody Student stud) {
		studService.saveOneStudent(stud);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteOneStudent(@PathVariable("id") long id) {
		studService.deleteOneStudentById(id);
	}
	
	//microservice implemetation -1
	//following section impose data on searchstudent project
	@RequestMapping(value = "api/get/{id}", method = RequestMethod.GET)
	public Student getOnestudent(@PathVariable("id") long id) {
		Student stud=studService.findOneStudent(id);
		return stud;
	}
}
