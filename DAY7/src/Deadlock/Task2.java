package Deadlock;

public class Task2 implements Runnable {
private Employee emp;
private IncomeTax it;

	public Task2(Employee emp, IncomeTax it) {
	super();
	this.emp = emp;
	this.it = it;
}

	@Override
	public void run() {
		try {System.out.println(Thread.currentThread().getName());
			synchronized(it) {
				System.out.println("task2");
				Thread.sleep(100);
				synchronized(emp) {
					System.out.println("In task2");
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
