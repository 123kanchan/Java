package Threads;

public class TaskWithdraw implements Runnable {
	private Account acc;
	private float amtWithdraw;
	public TaskWithdraw(Account acc, float amtWithdraw) {
		super();
		this.acc = acc;
		this.amtWithdraw = amtWithdraw;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			synchronized(acc) {
			System.out.println("balance before dwithdraw:"+acc.getAccBal());
			Thread.currentThread().sleep(10000);
			
			acc.withdraw(amtWithdraw);
			Thread.currentThread().sleep(10000);
System.out.println("balance after withdraw:"+acc.getAccBal());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
