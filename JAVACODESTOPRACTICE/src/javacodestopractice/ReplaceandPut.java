package javacodestopractice;

import java.util.Scanner;

public class ReplaceandPut {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	boolean flag=false;
	char arr[]=a.toCharArray();
	System.out.println("enetr character to replace");
	char c = sc.nextLine().charAt(0);   

	System.out.println("Enter the new character to add");
	char d = sc.nextLine().charAt(0);   
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==c)
		{
			arr[i]=d;
			flag=true;
			break;
		}
	}
	if(flag==false)
	{
		System.out.println("character not found");
	}
	else
	{
		System.out.println(String.valueOf(arr));
	}
	}
}
