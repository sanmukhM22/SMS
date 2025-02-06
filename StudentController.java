package com.jsp.Controller;

import java.util.ArrayList;
import java.util.Iterator;

import com.jsp.Model.Student;

public class StudentController {
	
	//Business Logic
	
	
	
	private ArrayList<Student> al=new ArrayList();
	
	
	//save student in ArrayList
	
	public void saveStudent(Student student)  //student<--- s
	{
		al.add(student);
	}
	
	public void findbyId(int id)  //id<---id
	{
		for(Student s:al)
		{
			if(s.getId()==id)
			{
				System.out.println(s);
				return;
				
			}
		}
		
		System.out.println(id+ "ID not found");
		
	}
	
	public void findAll()
	{
		for(Student s:al)
		{
			System.out.println(s);  //toString
		}
	}
	
	public void updateStudent(int id, String newname)
	{
		for(Student s:al)
		{
			if(s.getId()==id)
			{
				s.setName(newname);
				
				return;
			}
		}
		
		System.out.println(id + "ID not found");
	}
	
	
	public void removeStudent(int id)
	{
		Iterator<Student> i=al.iterator();
		while(i.hasNext());
		Student s=i.next();
		if(s.getId()==id)
		{
			i.remove();
			return;
		}
		
	}
	
}
