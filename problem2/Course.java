package com.problem2;


import java.util.Scanner;

public class Course {

	int courseId ;
	 String courseName ;
	int courseFee;
	
	 void displayCourseDetails(Course c) {
		
		 //print cousrse deatila
		 System.out.println(c.courseId);
		 System.out.println(c.courseName);
		 System.out.println(c.courseFee);
	 }
	
	 
	 static void authenticate(String username, String Password) {
		 
		 if(username == "Admin" && Password == "1234") {
			
			 Scanner sc = new Scanner(System.in);
			Course object = new Course();
			
			
			System.out.println("Enter courseId");
			
			int id = sc.nextInt();
			object.courseId =id;
			System.out.println();
			System.out.println("Enter courseName");
			
			String name = sc.nextLine();
			object.courseName =name;
			
			
			System.out.println("Enter coursefee");
			
			int fee = sc.nextInt();
			object.courseFee=fee;
//			System.out.println(object.courseFee+object.courseId+object.courseName);
			
			object.displayCourseDetails(object);
			
		 }
		 else {
			 System.out.println("Invalid Username or password");
		 }
		 
	 }
	
	public static void main(String[] args) {
	
		authenticate("Admin","1234");
		
		authenticate("Admin","456123");
		
	}

}