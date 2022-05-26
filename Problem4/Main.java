package com.Problem4;

import java.util.Scanner;

public class Main {
	
	static void objectMaker() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of Students you want to add ");
		
		int num = sc.nextInt();
		
		Student[] starr  = new Student[num];
		
		for(int a = 0; a<num ; a++) {
			
			System.out.println("Enter name of Student "+(a+1));
			String name = sc.next();
			
			System.out.println("Enter Roll no. of Student "+(a+1));
			int roll = sc.nextInt();
			
			System.out.println("Enter marks of Student "+(a+1));
			int marks = sc.nextInt();
			
			
			starr[a] = new Student(roll,name,marks);
			
			
		}
		
		System.out.println("Student details are  : ");
		System.out.println("===================================");
		
		
		for(Student a :starr) {
			
		System.out.println("student's name"+a.getStudentName());	
		System.out.println("student's roll no."+a.getRollNumber());
			
		System.out.println("student's marks"+a.getMarks());
			
			System.out.println("===================================");
			
		}
		
		
		
		
		
		
		
		
	}
	

	public static void main(String[] args) {
		
		objectMaker();

	}

}
