package Threads;

public class TestInner  {
public static void main(String[] args) {
	
Account obj=new Account(1010,"kanchan",5000);
Runnable taskDeposit=new Runnable() {//anonymous inner class
	public void run() {
		// TODO Auto-generated method stub
		String nm=Thread.currentThread().getName();
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<30;i++)System.out.println(nm+":"+i+",");
	
	}
};
Thread w1=new Thread(taskDeposit);
w1.start();
}}
//
//single abstract method interface (sam functional interfaces)(lambda expression)
//zero abstract method interface (zam)marker interface-serializable ,cloneable,runnable,remote
