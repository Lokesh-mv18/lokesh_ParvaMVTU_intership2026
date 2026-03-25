package com.class_object;
import java.util.Scanner;

public class Student_input {
	String std_name;
	int std_age;
	int std_id;
	String std_email;
	
	public String isworking() {
		return "Yes he is student";
	}
	public static void main(String[] args) {

		Student std=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student detiles:");
		System.out.println("enter student name:");
		std.std_name=sc.nextLine();
		
		System.out.println("enter student id:");
		std.std_id=sc.nextInt();
		std.std_id=78;
		
		System.out.println("enter student email:");
		std.std_email=sc.nextLine();
		std.std_email="loki@parvam.com";
		
		System.out.println("enter student age:");
		std.std_age=sc.nextInt();
		std.std_age=22;
	
		String res=std.isworking();
		System.out.println("std_name:"+std.std_name);
		System.out.println("std_id:"+std.std_id);
		System.out.println("std_email:"+std.std_email);
		System.out.println("std_age:"+std.std_age);
		System.out.println(res);
		sc.close();
		
		
	
}
}