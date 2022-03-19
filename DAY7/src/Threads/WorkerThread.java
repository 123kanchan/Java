package Threads;
/**
 * In  this approach of creating athread a custom class is 
 * extended from thread class and it will override a run
 * The run( method defines a behaviour of a thread
 *1.Instantiate thread as an object
 *2.register it with satrt()
 *3.start stage
 *when thread in process queue it is in running staate
 *when it completes exceution its in dead state because can't reuse
 thread having a single life
 after thread is dead when you disect the dead thread and bring out the value:postmortom
the run method does not take any parameter and does not return a value also does not throw a exception
 */

public class WorkerThread extends Thread {
private int x;
	@Override
	public void run() {
		//System.out.println(this.getName());
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<1000;i++)System.out.print(i+",");
	x=15;
	}
	public int getX()//call after run method is completel executed
	{
		return x;
	}
public WorkerThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	//main method exceutes also inside some thread
	System.out.println(Thread.currentThread().getName());//o/p main
	//thread1 created
	//WorkerThread t1=new WorkerThread();
	WorkerThread t1=new WorkerThread("Process1");
	//if wat to give names explicitly
	
	//thread2 created
	//WorkerThread t2=new WorkerThread();
	WorkerThread t2=new WorkerThread("Process2");
//	t1.run();//not creating a thread
//	t2.run();//not creating a thread
	//for thredaing call statrt method
	t1.start();//it registers the worker object as  athread and now jvm treats it as a thread
	t2.start();//if extended from thread
	
	
	try {
		t1.join();//until both threads complete  exceution it will not allow to main method to complete its execution 
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//t1.start();//this line throw exception because its dead thread is dead
	System.out.println("\n");
	System.out.println(t1.getX());
	System.out.println("\nEnd of main method");
	//operating thread every thread given a unique name
}
}
