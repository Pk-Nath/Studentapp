package com.studentapp.services;

import java.util.List;

import com.studentapp.entities.Student;

public interface StudentService {

	public void saveOneStudent(Student stud);

	public List<Student> findAllStudent();

	public void deleteOneStudentById(long id);

	public Student findOneStudent(long id);


}
