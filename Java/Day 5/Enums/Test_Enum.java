enum DAY
{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY	
}

enum MONTH
{
	JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC	
}

public class Test_Enum {

	public static void main(String[] args) {
		
		DAY day =DAY.MONDAY;
		MONTH mon =MONTH.MAY;
		
		switch (day) {
		
		case MONDAY:
				System.out.println("MONDAY");
				break;

		case TUESDAY:
				System.out.println(" TUESDAY");
				break;

		case WEDNESDAY:
				System.out.println("WEDNESDAY");
				break;

		case THURSDAY:
				System.out.println("THURSDAY");
				break;

		case FRIDAY:
				System.out.println(" FRIDAY");
				break;

		default:
				System.out.println("Its Week end");
				break;
		}
		
		switch (mon) {
		
		case JAN:
				System.out.println("January");
				break;

		case FEB:
				System.out.println("February");
				break;
				
		default:
				System.out.println("Its other month");
				break;
				
				
				
		}
		for(MONTH mymon:mon.values())
		{
			System.out.println("--"+mymon);
		}
		
	}

}
