import java.util.Scanner;

public class Test_Assertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age :");
		
		int value =sc.nextInt();
		assert value>=18:"Not Valid";
		
		System.out.println("Value is :"+value);
		sc.close();
	}

}
//perform this program in notepad and command prompt
//execute following commands there
//javac Test_Assertion.java
//java -ea Test_Assertion