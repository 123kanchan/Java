//qs 2.2 command line argument demo
package pack;
import java.util.*;
public class checknumber {
public static void main(String[]args)
{
	int num=Integer.parseInt(args[0]);
	if(num<0)
	System.out.println("Negative number");
	else
		System.out.println("Positive number");
}
}
