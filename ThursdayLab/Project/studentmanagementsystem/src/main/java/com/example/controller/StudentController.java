package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;
//import com.example.model.User;
//import com.example.service.UserService;

@RestController
public class StudentController {

	@Autowired
	   private StudentService us;
	   //saving Student details using rest api post mapping
	   @PostMapping("/save")
	   public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		   return new ResponseEntity<Student>(us.saveStudent(student),HttpStatus.CREATED);  
	}
	   // get Student details using rest api get Mapping
	   @GetMapping("/getstudent")
	   public List<Student> getAllStudent(){
		   return us.getAllStudent();
	   }
	   
	   // get Student details from table using rest api GET mapping with id attribute
	   @GetMapping("/getstudentbyid/{id}")
	   public ResponseEntity<Student> getStudentById(@PathVariable("id")int id){
		   return new ResponseEntity<Student>(us.getStudentById(id),HttpStatus.OK);
		  
	   }
	   
	   //updating Student details from table using rest api PUT mapping with id attribute
	   @PutMapping("/updatebyid/{id}")
	   public ResponseEntity<Student> updateStudentById(@PathVariable("id") int id, @RequestBody Student student){
		   return new ResponseEntity<Student> (us.updateStudentById(student,id),HttpStatus.OK);
	   }
	   
	   
	   //delete Student details from table using rest api delete mapping using id attribute
	   @DeleteMapping("/deletestudent/{id}")
	   public ResponseEntity<String> deleteStudentById(@PathVariable("id") int id){
		   us.deleteStudentById(id);
		   return new ResponseEntity<String>("Student deleted Successfully",HttpStatus.OK);
	   }
}