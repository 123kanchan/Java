import java.util.Scanner;
import java.util.regex.*;
public class qs5 {

	interface authenticate{
		boolean fun();
			 }
		 
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 String username=sc.nextLine();
	 String password=sc.nextLine();
	authenticate var=()->{
		Pattern p=Pattern.compile("^[a-zA-Z]+$");
		if(p.matcher(username).matches())return true;
		
		return false;
	};
		 
	 authenticate var1=()->{
			Pattern p=Pattern.compile("^[a-zA-Z]+[0-9]{3}[@ % & *]*$");
			if(p.matcher(password).matches())return true;
			
			return false;
		};
	System.out.println(	var.fun());
	System.out.println(var1.fun());
	}
		

}
