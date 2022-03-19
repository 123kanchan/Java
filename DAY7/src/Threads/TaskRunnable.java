package Threads;
/*it is not  athread not extended from thread class ,it is ordinary class implementing an interface
 * implementing runnable interface has a single method run
 * the running thread can go in sleep /wait mode for a while
 * */
public class TaskRunnable implements Runnable {
	private int x;
	@Override

	public void run() {
		//System.out.println(this.getName());
		String nm=Thread.currentThread().getName();
				System.out.println(Thread.currentThread().getName());
				for(int i=0;i<30;i++)System.out.println(nm+":"+i+",");
			x=15;	

	}
	public int getX()
	{
		return x;
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		TaskRunnable tsk1=new TaskRunnable();
		Thread t1=new Thread(tsk1,"Process1");//worker thread
		Thread t2=new Thread(tsk1,"Process2");//worker thread
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(tsk1.getX());
		System.out.println("end of main method");
	}

}
