/*
0- Sun
1- Mon
*/

public class SwitchString{
	public static void main(String[] args){
		
		String day=args[0];						//java statement
		
		switch(day){
			
			case "Sunday":
 			System.out.println(0);
			break;
			
			case "Monday":
 			System.out.println(1);
			break;
			
			case "Tuesday":
 			System.out.println(2);
			break;
			
			case "Wednesday":
 			System.out.println(3);
			break;
			
			case "Thursday":
 			System.out.println(4);
			break;
			
			case "Friday":
 			System.out.println(5);
			break;
			
			case "Saturday":
 			System.out.println(6);
			break;
			
			default:
 			System.out.println("Invalid Day");
		}
		
	}
}