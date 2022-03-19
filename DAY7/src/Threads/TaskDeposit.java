package Threads;

public class TaskDeposit implements Runnable {
private Account acc;
private float amtDeposit;
public TaskDeposit(Account acc,float amtDeposit)
{
	this.acc=acc;
	this.amtDeposit=amtDeposit;
}

	@Override
	public void run() {
		try {
			synchronized(acc){
			System.out.println("balance before deposit:"+acc.getAccBal());
			Thread.currentThread().sleep(10000);

			acc.deposit(amtDeposit);
			Thread.currentThread().sleep(10000);

System.out.println("balance after deposit:"+acc.getAccBal());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
