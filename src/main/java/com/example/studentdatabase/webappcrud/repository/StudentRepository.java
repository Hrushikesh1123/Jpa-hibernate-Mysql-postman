package com.example.studentdatabase.webappcrud.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentdatabase.webappcrud.entity.Student;


public interface StudentRepository extends JpaRepository<Student,Integer> {
	

}
