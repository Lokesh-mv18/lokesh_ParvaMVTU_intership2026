package com.problemns_loops_functions;
import java.util.Scanner;
public class sumOf_even_numbers {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();//5
		int i=1;
		int res=0;
		while(i<=num) {//1<=5
			if(i%2==0)
			res=res+i;//1
			i++;
		}
		System.out.println("result is:"+res);
		sc.close();
		
		
	}

}
