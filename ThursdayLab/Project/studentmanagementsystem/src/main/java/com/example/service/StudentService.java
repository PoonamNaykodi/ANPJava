package com.example.service;

import java.util.List;

import com.example.model.Student;

//User Service interface
public interface StudentService {
	
	//inserting Student details in table
	Student saveUser(Student Student);
	
	//fetching all Student details from table
	List<Student>getAllStudent();
	
	//fetching Student details from table
	Student getStudentById(int id);
	
	//modifying Student details from table based on Student id
	Student updateStudentById(Student Student, int id);
	
	//remove Student details from table based on Student id
	void deleteStudentrById(int id);

	void deleteStudentById(int id);

	Student updateUserById(Student student, int id);

	Student saveStudent(Student student);

}

