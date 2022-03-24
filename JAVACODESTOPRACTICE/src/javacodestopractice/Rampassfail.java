package javacodestopractice;

import java.util.Scanner;

public class Rampassfail {

	public static void main(String[] args) {
		int n,fail=0,pass=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n<=0) {
			System.out.println("iNvalid input");
			return;
		}
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]<50)
			{
				fail++;
			}
			else
				pass++;
		}
		System.out.println("Ram passed in "+ pass +" subjects and failed in"+ fail+ " subjects");
		
	}

}
