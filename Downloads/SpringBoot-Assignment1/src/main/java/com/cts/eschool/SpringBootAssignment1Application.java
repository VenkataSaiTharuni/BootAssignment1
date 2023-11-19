package com.cts.eschool;

import com.cts.eschool.Service.StudentService;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAssignment1Application {

	public static void main(String[] args) throws Exception {
		
		StudentService ss= new StudentService();
		ss.addNewStudentDetails(401, "Radha", 45);
		ss.addNewStudentDetails(402, "Varun", 77);
		ss.addNewStudentDetails(403, "Harika", 70);
		ss.addNewStudentDetails(404, "Teja", 35);


		ss.getAllStudentDetails();
		
		ss.getStudentDetailsById(402);
		
		ss.updateStudentScore(401 ,49);
		
		ss.deleteStudentDetailsByID(404);
		
		ss.getAllStudentDetails();
	}

	}

