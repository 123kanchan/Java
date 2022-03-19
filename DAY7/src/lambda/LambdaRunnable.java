package lambda;

public class LambdaRunnable {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());//showing name of main thread
		/*Runnable t1=new Runnable() {
	public void run()
	{System.out.println(Thread.currentThread().getName());
		System.out.println("helo");
	}
	};
Thread t=new Thread(t1);
t.start();*/
		//creating thread using lambda expression
		
Runnable r=()->{
	System.out.println(Thread.currentThread().getName());
	System.out.println("helo");
};
Thread t=new Thread(r);
t.start();	
}}
//common between runnnable and cmparator
//needed on left atleast and atmost 1 comparator (sam)single abstract method
//also called as functional interface
//sam interface with run()