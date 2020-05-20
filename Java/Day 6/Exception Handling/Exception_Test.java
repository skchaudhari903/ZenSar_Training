public class Exception_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exception......");

		int no1, no2, result;

		try {
			no1 = Integer.parseInt(args[0]);
			no2 = Integer.parseInt(args[1]);

			result = divide(no1, no2);
			System.out.println("Division is " + result);
		}

		catch (ArithmeticException ex) {
			System.err.println(" " + ex.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			System.out.println("Finally");
		}

	}

	private static int divide(int no1, int no2) throws Exception {
		// TODO Auto-generated method stub
		
		return no1 / no2;
	}
}
