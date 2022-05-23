
package com.problem1;

public class StringMethods {

	/*
	1. strings are immutable because we can not change them or modify them.
	
	2.Strings are immutable to space asthey can point to same location when created using literal method.
	
	
	========= Difference==========
	
	Strings area immutable whereas stingbuilder are mutable and can be changed .
	 */
	
	
	public static void main(String[] args) {
		
		String s1 = new String("0123456");
		//method 1 length 
		
		int length = s1.length();
		System.out.println(length);
		
		// 2. replace
		
		 String S2 = s1.replace("123", "jkl");
		System.out.println(S2);
		
		// 3. touppercase

		 String S3 = S2.toUpperCase();
		 System.out.println(S3);
		 
		// 4. tolowercase

				 String S4 = S3.toLowerCase();
				 System.out.println(S4);
				 
				 // 5 . substring

				 String S5 =S4.substring(3);
				 System.out.println(S5);
	}

}