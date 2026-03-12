package Operators_types;

public class ternary_operator {
	public static void main(String[] args) {
		int a = 10, b = 20;

		int max = (a > b) ? a : b;
		int min= (a<b)? a:b;
		System.out.println("Maximum number is: "+max);
		System.out.println("Minimun number is: "+min);
	}

}
