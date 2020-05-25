class MessageBox{
	private String message;
	private boolean hasMessage;
	
	//producer
	public synchronized void putMessage(String message) {
		while(hasMessage) {
			//no room for new message
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		//acquire the lock and continue
		hasMessage = true;
		this.message = message +"Put@"+System.nanoTime();
		notify();
	}
	
	//consumer
	public synchronized String getMessage() {
		while(!hasMessage) {
			//no new message
			try {
				wait(); //release the lock of the object
			}catch(InterruptedException e) {}
			
		}
		//acquire the lock and contiue
		hasMessage = false;
		notify();
		return message+"Get@"+System.nanoTime();
	}
}

public class ProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final MessageBox box = new MessageBox();
		
		Thread producerThread = new Thread() {
			@Override
			public void run() {
				System.out.println("producer thread started..");
				for(int i = 0;i<=6;i++)
				{
					box.putMessage("message"+i);
					System.out.println("put message"+i);
				}
			}
		};
		
		Thread consumerThread1 = new Thread() {
			
			public void run() {
				System.out.println("producer thread 1 started..");
				for(int i = 0;i<=3;i++)
				{
					
					System.out.println("Consumer thread 1 Get"+box.getMessage());
				}
			}
			
		};
		
	}

}
