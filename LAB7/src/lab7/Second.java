package lab7;
import java.util.*;
public class Second {
public static void main(String[] args) {
	int n;
	String val;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	List<String>l=new ArrayList<>();
	for(int i=0;i<n;i++)
	{
		val=sc.next();
		l.add(val);
	}
	Collections.sort(l);
	for(String lq:l)
	{
		System.out.println(lq);
	}
}
}
