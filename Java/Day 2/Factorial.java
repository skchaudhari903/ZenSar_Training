//Factorial

import java.util.*;

public class Factorial{
	public static void main(String[] args){
		
		int input;
		int fact=1;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number for Factorial :");
		input = in.nextInt();
		
		for(int i = input; i > 0; i--){
			
			fact = fact*input;
			input = input-1;
		}
		
		System.out.println("Factorial is :-"+fact);

	}
}	