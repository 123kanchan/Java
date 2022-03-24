package javacodestopractice;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		StudentNitIIt obj=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter studnet id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter studnet name");
		String name=sc.nextLine();
		System.out.println("enter studnet address");
		String addd=sc.nextLine();
		System.out.println("student from nit?");
		String a=sc.nextLine();
		int flag=0;
		while(flag==0) {
		if(a.equalsIgnoreCase("YES"))
		{
			flag=1;
			obj=new StudentNitIIt(id,name,addd);
			System.out.println(obj);
			
		}
		else if(a.equalsIgnoreCase("NO"))
		{
			flag=1;
			System.out.println("enter cllg name");
			String cllgname=sc.nextLine();
			obj=new StudentNitIIt(id,name,addd,cllgname);
			System.out.println(obj);
		}
		else
		{
			
			System.out.println("invalid input enter again");
			a=sc.nextLine();
			
			
		}}
	}
}
