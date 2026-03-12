package Task;
import java.util.Scanner;
public class type_casting {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	      
	        System.out.print("Enter integer number: ");
	        int number = sc.nextInt();

	        
	        double d = number;

	   
	        int n = (int) d;

	      
	        System.out.println("Original Integer Value: " + number);
	        System.out.println("After Implicit Casting (int to double): " + d);
	        System.out.println("After Explicit Casting (double to int): " + n);

	        sc.close();
	}
	

}
