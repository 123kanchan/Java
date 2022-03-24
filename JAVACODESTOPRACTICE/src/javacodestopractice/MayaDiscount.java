package javacodestopractice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MayaDiscount {
private static int n;
private static int maxdiscount=1000000;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	String arr[]=new String[n];
	Map<String,Integer>mp=new HashMap<>();
	List<String>lst=new LinkedList<>();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
			System.out.println("\n");
		}
		
		for(int i=0;i<n;i++)
		{
			String[]linevector=arr[i].split(",");
			String a=linevector[0];//item
			int b=Integer.parseInt(linevector[1]);//price
			int c=Integer.parseInt(linevector[2]);//discount
			int discount=(c*b)/100;
			
			mp.put(a,discount);
			
		}
		
	
		
		for(Map.Entry<String,Integer>entry:mp.entrySet())
		{
			
			if(entry.getValue()<=maxdiscount)//for getting min discount
			{
			
				maxdiscount=entry.getValue();
			}
			
		}
		
		for(Map.Entry<String,Integer>entry:mp.entrySet()) {
			if(entry.getValue()==maxdiscount)
			{
				lst.add(entry.getKey());
			}
		}
		for(String l:lst)
			System.out.println(l);
	}
}
