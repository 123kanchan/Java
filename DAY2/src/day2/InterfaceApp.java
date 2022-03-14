package day2;
import java.time.LocalDate;
import java.util.Scanner;
public class InterfaceApp {
public static void main(String[]args)
{
	  Distributable d1 =null;
	   
	   Printable p1 = null;
	   
	   ColorPrintable  c1 = null ;
	   Scanner scanner =  new Scanner(System.in);
		
		int choice =  scanner.nextInt();
	   switch(choice) {
	   
		
		case 1 : d1=new A();
		System.out.println("a created as it is distributable");
		d1.distribute();
		((Printable) d1).print();
		d1=new C();
		d1.distribute();
		break;
		
		case 2: p1 = new B(100);
		p1.print();
		break;
		
		case 3: 
			book b1 =new book(1212,"rise of kali",LocalDate.of(2021, 3, 3),340);  
			c1 = new C(b1);
		c1.colorPrint();
		c1.distribute();
		c1.print();
		break;
		
		default:
			
		System.out.println("invalid choice");
		System.exit(0);
		
		}
	
}
}

