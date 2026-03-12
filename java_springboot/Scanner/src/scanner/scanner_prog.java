package scanner;


import java.util.Scanner;

public class scanner_prog {
	public static void main(String[] args) {
		
		
		
		 Scanner sc = new Scanner(System.in) ;
			System.out.println("Enter your age: ");
			byte age = sc.nextByte();
			System.out.println("Your age is: "+age);
			
			System.out.println("Enter marks:");
			float marks=sc.nextFloat();
			System.out.println("your marks is: "+marks);
			
			System.out.println("enter gender:");
			char gender=sc.next().charAt(0);
			System.out.println("gender is: "+gender);
			sc.nextLine();
			
			System.out.println("enter name:");
			String name=sc.nextLine();
			System.out.println("name is: "+name);
			
			
		
			sc.close();
			}
		
	}

			
		


