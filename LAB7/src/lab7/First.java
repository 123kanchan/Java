package lab7;
import java.util.*;
public class First {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	String arr[]=new String[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.next();
		
	}
	Arrays.sort(arr);
	for(int i=0;i<n;i++)
	{
		System.out.println(arr[i]);
		
	}
}
}
