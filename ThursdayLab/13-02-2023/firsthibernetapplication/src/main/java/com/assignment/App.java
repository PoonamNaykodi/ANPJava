package com.assignment;

import com.assignment.dao.StudentDao;
import com.assignment.model.Student;

public class App
{
    public static void main( String[] args )
    {
    	StudentDao studentDao = new StudentDao();

        // insert values
        Student student = new Student("Amit", "Varma", "amit45@gmail.com");
        Student student1 = new Student("Pawan", "Patel", "patelpawan45@gmail.com");
        Student student2 = new Student("Shubham", "Gautam", "ShubhamG45@gmail.com");

        //save values
        studentDao.saveStudent(student);
        studentDao.saveStudent(student1);
        studentDao.saveStudent(student2);


        studentDao.getStudent(1);
        studentDao.loadStudent(2);
        studentDao.getStudentById(3);
    }
 }

