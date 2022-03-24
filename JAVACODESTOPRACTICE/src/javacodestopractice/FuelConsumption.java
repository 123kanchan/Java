package javacodestopractice;

import java.util.Scanner;
//import java.math.*;
public class FuelConsumption {

	private static float litre;
	private static float distance;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	litre=sc.nextFloat();
	if(litre<0)
	{
		System.out.println(litre+" is an invalid input");
		return;
	}
	distance=sc.nextFloat();
	
	if(distance<0) {
		System.out.println(distance+" is an invalid input");
		return;
	}
	float res1=(litre/distance)*100;
	System.out.format("%.2f",res1);
	System.out.println("\n");
	distance=distance*0.6214f;
	litre=litre*0.2642f;
	float res2=(distance/litre);
	System.out.format("%.2f",res2);
}

}
