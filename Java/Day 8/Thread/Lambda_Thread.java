public class Lambda_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Anonymous Thread
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread running...");
			}
		};
		new Thread(runnable).start();
		//2. 
		Runnable runnableLambda = () ->
			System.out.println("Thread running...");
		new Thread(runnableLambda).start();
		//3.
		new Thread(()->System.out.println("Thread running...")).start();
		//4.
		new Thread(
				()->{
					System.out.println("Starting a Thread...");
					System.out.println("Thread running...");
					
				})
		.start();
	}
}
