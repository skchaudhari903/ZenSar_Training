import java.util.*;

public class Calculator{
	
	public int add(int num1, int num2){
		return num1+num2;
	}
	
	public int sub(int num1, int num2){
		return num1-num2;
	}
	
	public int mul(int num1, int num2){
		return num1*num2;
	}
	
	
	public int div(int num1, int num2){
		return num1/num2;
	}
	
	
		public static void main(String[] args){
			int choice;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("Enter Your Choice :");
			choice = sc.nextInt();
			
			int result;
			Calculator obj = new Calculator();
		
			
			switch(choice){
				case 1:
				result =obj.add(12,10);
				System.out.println("Addition is : "+result);

				break;
				
				case 2:
				result =obj.sub(12,10);
				System.out.println("Substraction is : "+result);

				break;
				
				case 3:
				result =obj.mul(12,10);
				System.out.println("Multiplication is : "+result);

				break;
				
				case 4:
				result =obj.div(12,10);
				System.out.println("Division is : "+result);

				break;
				
				default:
				System.out.println("Invalid Choice");

					
			//result = sub(12,10);
			//result = mul(12,10);
			
			
			//result = obj.sub(2, 4);
			//System.out.println("Substraction is : "+result);
			
			
			}
		}
}
