package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.StudentNotFoundException;
import com.example.model.Student;
import com.example.repository.StudentRepository;
//import com.example.repository.StudentRepository;
//import com.example.service.StudentService;
import com.example.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository repo;
	
	@Override
	//Saving Student details by jpa repository save()
	public Student saveStudent(Student student) {
		return repo.save(student) ;
	}

	@Override
	//fetching all Student details by jpa repository findAll()
	public List<Student> getAllStudent() {
		return repo.findAll();
	}

	@Override
	//fetching Student details by jpa repository
	public Student getStudentById(int id) {
	//find by id , if not present then throw custom exception
		return repo.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found in table"));
	}

	@Override
	public Student updateUserById(Student student, int id) {
		//find by id , if not present then throw custom exception
		Student exituser = repo.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found in table"));
		//set new value
		exituser.setStudentEmail(student.getStudentEmail());
		exituser.setPhnNumber(student.getPhnNumber());
		repo.save(exituser);
		return null ;
	}

	@Override
	//fetching Student details using jpa repository findById and removing it using deleteById
	public void deleteStudentById(int id) {
	
		repo.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found in table"));
		repo.deleteById(id);
		
	}

	@Override
	public Student saveUser(Student Student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudentById(Student Student, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudentrById(int id) {
		// TODO Auto-generated method stub
		
	}
	

}
