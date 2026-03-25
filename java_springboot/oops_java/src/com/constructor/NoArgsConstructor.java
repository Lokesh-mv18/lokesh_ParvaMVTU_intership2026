package com.constructor;

class Employee{
	String name;
	int age;
	Employee(){
		System.out.println("Emp Constructor");
	}
}

public class NoArgsConstructor {
	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.name="loki";
		emp1.age=23;
		System.out.println("Name: "+emp1.name);
		System.out.println("Age:"+emp1.age);
	}

}
