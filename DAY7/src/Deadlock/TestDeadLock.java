package Deadlock;
/*avoiding deadlock using semaphore of concurrent framework
 * avoid using more than 1 object in 1 thread
 * */
public class TestDeadLock {
public static void main(String[] args) {
	Employee e=new Employee();
	IncomeTax t=new IncomeTax();
	Task1 t1=new Task1(e,t);
	Task2 t2=new Task2(e,t);
	Thread w1=new Thread(t1);
	Thread w2=new Thread(t2);
	w1.start();
	w2.start();
	System.out.println("main executed");
}
}
