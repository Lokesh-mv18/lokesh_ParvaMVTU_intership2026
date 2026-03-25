package Task;
import java.util.Scanner;
public class second_largest_num {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("enter the size of the array: ");
	        int n = sc.nextInt();

	        int arr[] = new int[n];

	        System.out.println("enter the numbers: ");
	        for(int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int max = arr[0];
	        int secondMax = Integer.MIN_VALUE;

	        for(int i = 1; i < n; i++) {
	            if(arr[i] > max) {
	                secondMax = max;
	                max = arr[i];
	            } 
	            else if(arr[i] < max && arr[i] > secondMax) {
	                secondMax = arr[i];
	            }
	        }

	        System.out.println("Second largest element is: " + secondMax);
	        sc.close();
	    }

}
