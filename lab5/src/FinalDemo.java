
class A
{
	
public final void method1() {
	System.out.println("hello");
}

public String method2() {
	System.out.println("hi from method2");
	return "hello";
}
}

final class B extends A{
	
	
	@Override
	public String method2() {
	   return super.method2() + "hi from class B method2";
		
	}
	
	
}


public class FinalDemo {
	
	static final double DISCOUNT = .20;
	
public static void main(String[] args) {
	System.out.println("Calls from A");
	A a1=new A();
	a1.method1();
	System.out.println(a1.method2());
	System.out.println("calls from B");
	B b1 = new B();
	b1.method1();
	System.out.println(b1.method2());
	
	
	
	
}



}
