package com.thread;

public class Test_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start->Test_Thread...");
		
		Thread curThread = Thread.currentThread();
		System.out.println(curThread.getName());
		curThread.setName("SITRC");
		System.out.println(curThread.getName());
		
		ExtendThread extendThread = new ExtendThread();
		extendThread.setName("ExtendThread");
		extendThread.start();
		
//		Thread runnableThread = new Thread(new RunnableThread());
//		runnableThread.setName("RunnableThread");
//		runnableThread.start();
		
		for(int index = 0; index <= 10; index++) {
			System.out.println(curThread.getName()+":->"+index);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("End->Test_Thread");		
	}
}

class ExtendThread extends Thread{
	@Override				//call back method
	public void run() {
		for(int index = 0; index <= 10; index++) {
			System.out.println("\t\t"+Thread.currentThread().getName()+":->"+index);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}