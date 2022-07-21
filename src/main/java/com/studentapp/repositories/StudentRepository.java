package com.studentapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentapp.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
