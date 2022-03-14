package day2;

import java.util.Scanner;

public class Stringapi2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String re=sc.nextLine();
		int n=re.length();
		System.out.println(n);
		System.out.println(re.substring(7));
		System.out.println(re.toLowerCase());
		System.out.println((re.charAt(0)=='a'));
		System.out.println((re.charAt(re.length()-1)=='S'));
		String res="";
		for(int i=re.length()-1;i>=0;i--)
		{
			res+=re.charAt(i);
			
			
		}
		System.out.println(res);
	}
}
