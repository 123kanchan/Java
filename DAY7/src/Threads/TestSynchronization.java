package Threads;

public class TestSynchronization {
	public static void main(String[] args) {
		Account obj=new Account(1,"kanchan",5000);
		TaskDeposit td=new TaskDeposit(obj,1000);
		TaskWithdraw tw=new TaskWithdraw(obj,1500);

		Thread w1=new Thread(td);
		Thread w2=new Thread(tw);
		w1.start();
		w2.start();
	}

}
