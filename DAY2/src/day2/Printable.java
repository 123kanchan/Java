package day2;

public interface Printable {
public void print();
}
interface Distributable{
	public void distribute();
}
interface ColorPrintable extends Printable,Distributable{
	public void colorPrint();
}
class A implements Distributable,Printable{
	
		Animal obj = new lion();
		@Override
		public void distribute() {
			
			System.out.println("distributing");
			obj.eat();
		}

		@Override
		public void print() {
		System.out.println("printing "+obj);
			
		}
		
		
		
	}

class B implements Printable{
	//instance variable of class B is x of int type 
		
		private int x ;
		
		B(int x){
			
			this.x  =x;
		}
		@Override
		public void print() {
		
			System.out.println("x value is "+x);
		}
		
		
		
	}

	class C implements ColorPrintable{
	  //instance variable 
		private book b1;
		
		
		
		public C(book b1) {
		super();
		this.b1 = b1;
	}

		public C() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void print() {
			
			System.out.println("printing book "+b1.getTitle()+b1.getPrice());
		}

		@Override
		public void distribute() {
			System.out.println("distribution of books");
		}

		@Override
		public void colorPrint() {
			System.out.println("color printing of books");
			
		}
	}