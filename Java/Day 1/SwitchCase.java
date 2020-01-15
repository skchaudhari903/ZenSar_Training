/*
0- Sun
1- Mon
*/

public class SwitchCase{
	public static void main(String[] args){
		
		int day=1;						//java statement
		
		switch(day){
			
			case 0:
 			System.out.println("Sunday");
			break;
			
			case 1:
 			System.out.println("Monday");
			break;
			
			case 2:
 			System.out.println("Tueday");
			break;
			
			default:
 			System.out.println("Invalid Day");
		}
		
	}
}