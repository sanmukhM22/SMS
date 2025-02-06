package com.jsp.View;

import java.util.Scanner;

import com.jsp.Controller.StudentController;
import com.jsp.Model.Student;

public class StudentView {
	
	private static Scanner sc = new Scanner(System.in);	//Scanner class object
	
	private static Student  getStudentObject()
	{
		//create the student type of object
		
		Student s = new Student();
		System.out.println("Enter ID");
		int id = sc.nextInt();
		sc.nextLine(); 			//Dummy Instruction	
		System.out.println("Enter Name");
		String name= sc.nextLine();
		System.out.println("Enter Email");
		String email=sc.nextLine();
		System.out.println("Enter Password");
		String pass=sc.nextLine();
		System.out.println("Enter DOB");
		String dob=sc.nextLine();
		System.out.println("Enter Gender");
		String gender = sc.nextLine();
		System.out.println("Enter Relationship Status");
		String relationshipStatus= sc.nextLine();
		System.out.println("Enter Mobile No.");
		long mob=sc.nextLong();
		
		
		
		//set into Student Object
		
		s.setId(id);
		s.setName(name);
		s.setEmail(email);
		s.setPassword(pass);
		s.setDob(dob);
		s.setGender(gender);
		s.setRelationshipStatus(relationshipStatus);
		s.setMob(mob);
		
		return s;
			
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("****WELCOME TO STUDENT MANAGEMENT SYSTEM PROJECT****\n\n\n\n");
		
		StudentController controller=new StudentController();
		
		while(true) 
		{
			
		System.out.println("1. Create Student");
		System.out.println("2. Find Student by ID");
		System.out.println("3. Update Student by Id");
		System.out.println("4. Delete Student by ID");
		System.out.println("5. Find All Student");
		System.out.println("6. EXIT\n\n");
		
	
		
		System.out.println("Enter Your Choice");
		
		int choice=sc.nextInt();	//used to take INT data
		
		
			switch(choice)
			{
			case 1:
				//logic to create the student type of object
				Student s= getStudentObject();   //Student Object
				controller.saveStudent(s);
				
				System.out.println("Student Saved");
				
				//saveStudentMethod() to store object in ArrayList
				
				break;
				
			case 2:
				System.out.println("2. Enter Id");
				
				int id=sc.nextInt();
				
				//find by id
				controller.findbyId(id);
				break;

				
			case 3:
				
				//update details
				System.out.println("Enter Student ID to be updated");
				id=sc.nextInt();
				
				controller.updateStudent(id, null);
				
				break;

				
			case 4:
				
				//delete details

					id=sc.nextInt();
					controller.removeStudent(id);
					
					break;

				
			case 5:
				//findAll()
				
				controller.findAll();
				break;
				
			case 6:
				
				System.out.println("****THANK YOU****");
				return;
				
			default:
				System.out.println("Invalid Choice");
				break;

			}
		}
		
		
	}

}
