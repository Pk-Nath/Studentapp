package com.studentapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.entities.Student;
import com.studentapp.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studRepo;
	@Override
	public void saveOneStudent(Student stud) {
		studRepo.save(stud);
	}
	@Override
	public List<Student> findAllStudent() {
		List<Student> studs = studRepo.findAll();
		return studs;
	}
	@Override
	public void deleteOneStudentById(long id) {
    studRepo.deleteById(id);
	}
	@Override
	public Student findOneStudent(long id) {
		Optional<Student> findById = studRepo.findById(id);
		if(findById.isPresent()) {
			Student stud=findById.get();
			return stud;
		}else
		return null;
	}
	

}
