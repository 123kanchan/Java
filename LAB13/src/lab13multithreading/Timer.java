package lab13multithreading;

import java.util.Date;

public class Timer implements Runnable {



	@Override
	public void run() {
		int flag=1;
		while(flag<=10) {
			
		System.out.println("date is "+new Date()+" seconds"+new Date().getSeconds());
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		flag++;
		}
		
		
	}
	public static void main(String[] args) {
		Timer obj=new Timer();
		Thread t1=new Thread(obj);
		t1.setName("timer");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
