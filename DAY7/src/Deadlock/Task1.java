package Deadlock;

public class Task1 implements Runnable {
	private Employee emp;
	private IncomeTax it;

	@Override
	public void run() {
		//synchronize 
		try {
			System.out.println(Thread.currentThread().getName());
			synchronized(emp) {
				System.out.println("task1");
				Thread.sleep(100);
				synchronized(it) {
					System.out.println("In task1");
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Task1(Employee emp, IncomeTax it) {
		super();
		this.emp = emp;
		this.it = it;
	}

}
