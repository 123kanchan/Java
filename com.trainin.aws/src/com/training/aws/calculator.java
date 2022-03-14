package com.training.aws;

public class calculator {
	
public static void main(String[]args)
{
	System.out.println(add(2,3));
	System.out.println(sub(2,3));
	System.out.println(multiply(2,3));
	System.out.println(divide(2,3));
}
 static int add(int x,int y)
{
	return x+y;
}
 static int sub(int x,int y)
{
	return x-y;
}
 static int multiply(int x,int y)
{
	return x*y;
}
 static int divide(int x,int y)
{
	return x/y;
}
}
