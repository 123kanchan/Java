package lab3;
import java.util.Scanner;
public class Second {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	boolean flag=false;
	for(int i=0;i<str.length()-1;i++)
	{
		if(str.charAt(i+1)-str.charAt(i)>=0)
		{
			continue;
		}
		else
		{
			flag=true;
			break;
		}
	}
	if(flag)
		System.out.println("not a positive string");
	else
		System.out.println("yeS a positive string");
}
}
