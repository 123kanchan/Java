package lab6;
import java.util.*;
class PersonApp {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first name");
	String a,b;
	try {
		 a=sc.nextLine();
		check(a);
	 b=sc.nextLine();
		checks(b);
		
		Person e=new Person();
		e.setFname(a);
		e.setLname(b);
		System.out.println("First Name: "+e.getFname()+"\nLast Name: "+e.getLname());
		
	}
	catch(Nameblankexception e)
	{
		System.out.println(e.getMessage());
	}
	
	
}

public static void check(String fname)throws Nameblankexception
{
	if(fname.isEmpty())
	{
		throw new Nameblankexception("enetr first name first it is blank");
	}
	

}

public static void checks(String lname)throws Nameblankexception
{
	if(lname.isEmpty())
	{
		throw new Nameblankexception("enetr lastt name first it is blank");
	}
	
	
}
}
