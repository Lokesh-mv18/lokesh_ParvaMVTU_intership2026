package com.class_object;

public class Student {
	String std_name;
	int std_age;
	int std_id;
	String std_email;
	
	public String isworking() {
		return "Yes he is student";
	}
	public static void main(String[] args) {
		Student std=new Student();
		std.std_name="loki";
		std.std_id=78;
		std.std_email="loki@parvam.com";
		std.std_age=22;
	
		String res=std.isworking();
		System.out.println("std_name:"+std.std_name);
		System.out.println("std_id:"+std.std_id);
		System.out.println("std_email:"+std.std_email);
		System.out.println("std_age:"+std.std_age);
		System.out.println(res);
		
		
		Student std1=new Student();
		std1.std_name="swaran";
		std1.std_id=164;
		std1.std_email="swaran@parvam.com";
		std1.std_age=22;
		String res1=std.isworking();
		System.out.println("std_name:"+std1.std_name);
		System.out.println("std_id:"+std1.std_id);
		System.out.println("std_email:"+std1.std_email);
		System.out.println("std_age:"+std1.std_age);
		System.out.println(res1);
		
}
}
