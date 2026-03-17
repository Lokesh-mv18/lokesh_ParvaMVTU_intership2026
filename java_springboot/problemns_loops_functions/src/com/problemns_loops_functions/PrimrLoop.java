package com.problemns_loops_functions;
import java.util.Scanner;
public class PrimrLoop {
	
	

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=false;
			}
		}
		if(flag)
			System.out.println("prime number");
		else
			System.out.println("not a prime number");
		sc.close();
	}
	}




	

	
	


