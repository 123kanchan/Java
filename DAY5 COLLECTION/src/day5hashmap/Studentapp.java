package day5hashmap;
import java.util.*;
public class Studentapp {
public static void main(String[] args) {
	Batch obj=new Batch();
for(int i=0;i<3;i++) {
	Scanner sc=new Scanner(System.in);
	
	
System.out.println("enter name");
String name=sc.next();
	System.out.println("enter total score");
	int totalscore=sc.nextInt();
	System.out.println("enter id ");
	long id=sc.nextLong();
	Student obj2=new Student(id,name,totalscore);
	
	try {
	obj.addStudent(obj2);
	/*obj.displaykeys();
	obj.displayvalues();
	obj.displayentry();*/
	
	}
	catch(Nameexception e)
	{
		System.out.println(e);
	}
	catch(Scoreexception s)
	{
		System.out.println(s);
	}
}
obj.displaykeys();
obj.displayvalues();
obj.displayentry();
}
}
