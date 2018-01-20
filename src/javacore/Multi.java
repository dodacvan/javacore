package javacore;

public class Multi extends Thread{
	/**
	 * 
	 */
	public void run(){
		System.out.println("thread is running ...");
	}
	
	public static void main(String[] args) {
		Multi t1 = new Multi();
		t1.start();
		Multi3 m3 = new Multi3();
		Thread t11 = new Thread(m3);
		t11.start();
		
	}
}

class Multi3 implements Runnable {
	public void run() {
		System.out.println("thread is running.......");
	}
}
