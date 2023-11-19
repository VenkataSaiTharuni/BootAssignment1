package com.cts.eschool.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import com.cts.eschool.Student;
@Service
public class StudentService implements InitializingBean, DisposableBean
{
	
	private List<Student> studentList;
	
	public StudentService() {
		studentList = new ArrayList<Student>();
	}
	
	@Override
	public void destroy() throws Exception{
		System.out.println(">> The StudentService is being destroyed  \n");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception{
		System.out.println(">> The StudentService is being initialised  \n");
	}
	
	public void addNewStudentDetails(int ID, String Name, double score) {
		Student s = new Student(ID, Name, score);
		studentList.add(s);
	}
	
	public void getAllStudentDetails() {
		System.out.println(">>> Student Details...");
		for(Student s: studentList) {
			System.out.println("\nName:"+s.getName()+
			"\t Id:"+s.getID()+
			"\t Score:"+s.getScore());
			updateScoreLog(s.getScore());
		
		}
	}
	
	public void getStudentDetailsById(int ID) {
		for(Student s: studentList){
			if(s.getID()==ID) {
				System.out.println("\n\n>>The details of Student with ID: "+s.getID()+" are \nName:"+s.getName()+
				"\t Id:"+s.getID()+
				"\t Score:"+s.getScore());
				updateScoreLog(s.getScore());
			}
		}
	}
	
	public void updateStudentScore(int ID, double newScore)
		{
		for(Student s: studentList)
		{
			if(s.getID()==ID)
			{
				s.setScore(newScore);
				System.out.println("\n\n>>Update score for Student with Name :"+s.getName());
				System.out.println("Updated Score: "+s.getScore());
				updateScoreLog(s.getScore());
			}
		}
	}
	
	public void deleteStudentDetailsByID(int ID)
	{
		for(Student s: studentList)
		{
			if(s.getID()==ID)
			{
				System.out.println("\n\n>> Details of student with Id "+s.getID()+" has been removed from the records");
				studentList.remove(s);
			}
		}
		
	}
	
	private void updateScoreLog(double Score)
	{
		if(Score>=0 && Score<=100)
		{
			if(Score<50)
			{
			System.out.println(">>Below Average");
			}
			else if(Score<=75)
			{
			System.out.println(">>Average");
			}
			else {
			System.out.println(">> Above Average");
			}
		}
	}

}
