package Threads;
/*slepp() a stage handled by OS
 * wait()handled by jvm notify() notifyAll()
 * 1-MIN_PRIO
 * 5-NORMAL_PRIO
 * 10 HIGHES PRIO
 * yield method priority is not chnaged 
 * in linux threads give other thread achance only when i/o operation is there
 * Thread intercating with user is normally kept at higher priority 7-10
 * thread doing normally processing is kept at the priority 4-6
 * printing/backup kept wih lower riority
 * very heavy duty operations large printing highest priority
 * the sleep() forces thread to go into sleep mode for given number of milliseconds
 * the join() in following code the main thread get joined to thread1 so that the execution of main thread
 * mutual exclusive lock when t1 operates on object t2/t3 cannot when t1 completes its opratiion then only t3 will be allowed to operate an object
 * when t3 completes its operation then only t2 operate on object,SYNCHRONISATION,THREAD SAFE
 * 
 * */

//premptive when higher priority comes in hold execution of all lower priority threads
//time sharing gve s athread a run time environment for the period of time slolice 
import java.util.Date;

public class TaskSleep implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
System.out.println("Start"+new Date().getTime());
String nm=Thread.currentThread().getName();
System.out.println(Thread.currentThread().getName());
for(int i=0;i<30;i++)System.out.println(nm+":"+i+",");

try {
	Thread.currentThread().sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("End:"+new Date().getTime());
	}
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	TaskSleep tsk1=new TaskSleep();
	Thread t1=new Thread(tsk1,"Process1");//worker thread
t1.setPriority(Thread.MAX_PRIORITY);
	t1.start();
}
}
