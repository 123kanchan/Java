package practicelambda;

public class Threadlamba {
public static void main(String[] args) {
	Thread t=new Thread(new Runnable() {
		public void run() {
			System.out.println("hi");
		}
	});
	t.run();
	Thread mylambdathread =new Thread(()->System.out.println("hi"));
	mylambdathread.run();
}
	

}
//functional interface only one abstract method