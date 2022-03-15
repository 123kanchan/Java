package day7junit;

public class Calculator {

public int add(int val1,int val2) {
	return val1+val2;
}
public int subtract (int val1,int val2)
{
	return val1-val2;
}
public int mult (int val1,int val2)
{
	return val1*val2;
}
public int divide (int val1,int val2)
{
	if(val2==0) {
		throw new ArithmeticException();
	}
	return val1/val2;
}
}
