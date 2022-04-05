package com.example.studentdatabase.webappcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentdatabase.webappcrud.entity.Student;
import com.example.studentdatabase.webappcrud.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repository;
	public Student savestudent(Student student) {
		return repository.save(student);
	}
	public List<Student> savestudents(List<Student> students){
		return repository.saveAll(students);
	}
	public List<Student> getstudents(){
		return repository.findAll();
	}
	public Student getstudentById(int roll_id){
		return  repository.findById(roll_id).orElse(null);
	}
	/*public Student getstudentByName(String name){
		return repository.findByName(name).orElse(null);
	}*/
	public String deleteStudent(int roll_id) {
		repository.deleteById(roll_id);
		return "student data removed";
		
	}
	
	

}
