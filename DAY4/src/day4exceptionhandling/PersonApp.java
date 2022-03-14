package day4exceptionhandling;
import java.util.Scanner;
public class PersonApp {
public static void main(String[] args) {
	try {
		createperson();
	}
	catch(AgeException e)
	{
		System.out.println(e.getMessage());
	}
	catch(Nameexception f) {
	System.out.println(f.getMessage());
	}
}

public static  void createperson() throws AgeException,Nameexception
{
	int id;
	String name;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name");
	String a=sc.next();
	System.out.println("enter age");
	int age=sc.nextInt();
	Personvalidator obj=new Personvalidator(a,age);
	boolean res1=obj.validateName(a);

	boolean res2=obj.validateAge(age);
	
	
	if(res1&&res2)
	{
		System.out.println("enter id");
		id=sc.nextInt();
		obj.setId(id);
		/*System.out.println("enter name");
		name=sc.next();*/
		/*System.out.println("enter age");
		age=sc.nextInt();*/
		//Personvalidator obj2=new Personvalidator(id,age,name);
		System.out.println(obj);
	}
	
		
}
}
