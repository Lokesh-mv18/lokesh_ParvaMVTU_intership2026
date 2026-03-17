package com.problemns_loops_functions;
import java.util.Scanner;

public class N_1_reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		
		
		int num=sc.nextInt();
		for(int i=num;i>=1;i--){
			System.out.println(i);
			sc.close();
			}
			
	}

}
