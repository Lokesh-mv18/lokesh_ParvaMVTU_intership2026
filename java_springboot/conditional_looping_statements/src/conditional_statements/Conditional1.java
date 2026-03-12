package conditional_statements;

import java.util.Scanner;

public class Conditional1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		sc.close();
		}
	}

}
