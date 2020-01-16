//Recurrsive Factorial

import java.util.*;

public class Recurrsion{
	public static void main(String[] args){
		
		int input;
		int fact;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number for Factorial :");
		input = in.nextInt();
		
		fact = fact(input);
		
		System.out.println("Factorial is :-"+fact);

	}
	
	static int fact(int input){
		if(input == 0 || input == 1)
			return 1;
		else
			return fact(input-1)*input;
	}
}	