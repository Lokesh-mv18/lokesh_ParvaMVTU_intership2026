package Task;
import java.util.Scanner;
public class counteven_odd {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter size:");
	        int n = sc.nextInt();

	        int even = 0;
	        int odd = 0;

	        System.out.println("Enter numbers:");

	        for(int i = 0; i < n; i++) {
	            int num = sc.nextInt();

	            if(num % 2 == 0) {
	                even++;   // increase even count
	            } else {
	                odd++;    // increase odd count
	            }
	        }

	        System.out.println("Even numbers: " + even);
	        System.out.println("Odd numbers: " + odd);
	        sc.close();
	    }
}
