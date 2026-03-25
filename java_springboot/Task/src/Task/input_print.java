package Task;
import java.util.Scanner;
public class input_print {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int [] arr=new int[5];
		
		for(int i=0;i<5-1;i++) {
			System.out.println("enter "+i+" element:");
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<5-1;j++) {
			System.out.print(arr[j]);
			sc.close();
		}
	}

}
