//Armstrong no
import java.util.*;

public class ArmstrongNumber{
	public static void main(String[] args){
		
		int input, sum=0, temp, r;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number to check Armstrong or Not :");
		input = in.nextInt();
		
		temp = input;
		
		while(temp != 0){
			r = temp%10;
			sum = sum + r*r*r;
			temp = temp/10;
		}
		
		if(input == sum)
			System.out.println("Entered Number is an Armstrong Number");
		else
			System.out.println("Entered Number is Not an Armstrong Number");	
	}
}	