package com.class_object;

class Car{
	//properties
	String name="BMW";
	long price=1000;
	
	
	//behaviour
	public void canDrive() {
		System.out.println("yes");
	}
}

public class Introduction {
	public static void main(String[] args) {
		
		Car c=new Car();
		System.out.println("Name:"+c.name);
		System.out.println("Price: "+ c.price);
		c.canDrive();
	}
	/*
	 * oops:object oriented prg system
	 * 
	 * topics:
	 * 
	 * 1.class ===
	 * it will represent the state and behaviour of an object
	 * 
	 */

}
