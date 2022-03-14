package day2;
import java.util.Scanner;
public class app2 {
public static void main(String[]args)
{

Animal obj=null;
System.out.println("1.Deer");
System.out.println("2.Lion");
System.out.println("3.Elephant");
System.out.println("Enter your choice");
Scanner sc=  new Scanner(System.in);
int ch =  sc.nextInt();
switch(ch) {
case 1: obj=new deer();break;
case 2:obj=new lion();break;
case 3:obj=new elephant();break;
default:System.out.println("invalid choice");
System.exit(0);
}
meetmyfriend(obj);

}
private static void meetmyfriend(Animal obj)
{
obj.eat();
	obj.sleep();
	obj.play();
	if(obj instanceof deer)
	{
		((deer) obj).runs();
		System.out.println(obj);
	}
	else if(obj instanceof lion)
	{
	((lion)obj).hunt();
	System.out.println(obj);
	}
	else if(obj instanceof elephant)
	{
		((elephant)obj).goingtoriver();
		System.out.println(obj);
	}
	else
	{
		System.out.println("invalid animal");
	}
}
}
