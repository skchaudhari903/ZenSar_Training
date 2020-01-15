/*
0- Sun
1- Mon
*/

public class IfElse_CommandArgument{
	
	public static void main(String[] args){
			
		System.out.println(args);
		
		int day=Integer.parseInt(args[0]);    //java statement
		
		System.out.println("Day:-"+day);
		
		if(day==0){
				System.out.println("Sunday");
		}
		
		else if(day==1){
				System.out.println("Monday");
		}
		
		else{
				System.out.println("Invalid day");
		}
		
	}
}