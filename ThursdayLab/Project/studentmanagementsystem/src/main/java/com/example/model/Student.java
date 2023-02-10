package com.example.model;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
	@Table(name = "studentdetails")
	public class Student {

		@Id
		private int id;
		
		@Column(length = 30 , nullable = false)
		@NotBlank(message="Please Enter Your StudentName!!!")
		private String uName;

		@Column(length = 30 , nullable = false, unique = true)
		@NotBlank(message="Please Enter Your StudentName!!!")
		@Email
		private String StudentEmail;
		
		@Column(length = 10 , nullable = false, unique = true)
		private long phnNumber;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getuName() {
			return uName;
		}

		public void setuName(String uName) {
			this.uName = uName;
		}

		public String getStudentEmail() {
			return StudentEmail;
		}

		public void setStudentEmail(String StudentEmail) {
			this.StudentEmail = StudentEmail;
		}

		public long getPhnNumber() {
			return phnNumber;
		}

		public void setPhnNumber(long phnNumber) {
			this.phnNumber = phnNumber;
		}
		
		
	}