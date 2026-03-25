package Task;

public class Minmax_array {
	  public static void main(String[] args) {
	        int[] arr = {10, 25, 5, 60, 2, 90};

	        int min = arr[0];
	        int max = arr[0];

	      
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];   
	            }
	            if (arr[i] > max) {
	                max = arr[i];   
	            }
	        }

	        System.out.println("Minimum element: " + min);
	        System.out.println("Maximum element: " + max);
	    }

}
