package qs12;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	
	static HashMap<Integer,String> hm1=new HashMap<>();
	static HashMap<Integer,Integer> hm2=new HashMap<>();
	static HashMap<Integer,Integer> hm3=new HashMap<>();
	
	public static void increaseSalaries(HashMap<Integer,String> hm1,HashMap<Integer,Integer> hm2){
		
		if(hm1.containsValue("manager")) {
			for(Entry<Integer, String> entry: hm1.entrySet()) {
				if(entry.getValue().equals( "manager")) {
			        hm3.put(entry.getKey(), hm2.get(entry.getKey())+5000);
			     }
			}
		}		
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int i=0;
		while(i<n) {
			int id=sc.nextInt();
			String des=sc.next();
			int sal=sc.nextInt();
			hm1.put(id,des);
			hm2.put(id,sal);
			i+=1;
		}
		
		increaseSalaries(hm1,hm2);
		for(Entry<Integer, Integer> entry: hm3.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
