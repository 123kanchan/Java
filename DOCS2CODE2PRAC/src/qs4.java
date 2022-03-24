import java.util.Scanner;

public class qs4 {

	interface foo{
		public String fun();
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	foo x=()->{return 
	a.replace("", " ").trim();
	
	};
	String str=x.fun();
	System.out.println(str);
 
}
}
