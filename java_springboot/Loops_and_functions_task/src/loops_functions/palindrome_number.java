package loops_functions;
import java.util.Scanner;

public class palindrome_number {
	 public static boolean isPalindrome(int num) {
	        int original = num;
	        int reverse = 0;

	        while (num != 0) {
	            int digit = num % 10;
	            reverse = reverse * 10 + digit;
	            num = num / 10;
	        }

	        return original == reverse;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        if (isPalindrome(num)) {
	            System.out.println(num + " is a Palindrome");
	        } else {
	            System.out.println(num + " is Not a Palindrome");
	        }

	        sc.close();
	    }

}
