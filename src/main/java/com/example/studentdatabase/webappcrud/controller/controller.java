package com.example.studentdatabase.webappcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentdatabase.webappcrud.entity.Student;
import com.example.studentdatabase.webappcrud.service.StudentService;

@RestController
public class controller {
     @Autowired
	private StudentService studentservice;
    @PostMapping("/addstudent") 
     public Student addstudent(@RequestBody Student student) {
    	//student.roll_id=102;
        //student.name="hrushi";
        //student.marks=56;
    	 return studentservice.savestudent(student);
     }
    
    @PostMapping("/addstudents") 
    public List<Student> addstudents(@RequestBody List<Student> student) {
   	 return studentservice.savestudents(student);
   	 
    }
    @GetMapping("/students")
    public List<Student> findallstudents(){
    	return studentservice.getstudents();
    }
    @GetMapping("/students/{roll_id}")
    public Student findbyid(@PathVariable int roll_id) {
    	return studentservice.getstudentById(roll_id);
    }
    @DeleteMapping("/delete/{roll_id}")
    public String deletestudent(@PathVariable int roll_id) {
    	return studentservice.deleteStudent(roll_id);
    }

}
