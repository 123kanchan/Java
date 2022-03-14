package lab3;
import java.util.*;
public class First {
public static void main(String[]args)
{
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	
	
	switch(n) {
	case  1:
		String str=sc.next();
		addStringItself(str);
		break;
	case 2:
		String str1=sc.next();
		replaceoddpos(str1);
		break;
	case 3:
		String str2=sc.next();
		removeduplicate(str2);
		break;
	case 4:
		String str3=sc.next();
		uppercase(str3);
		break;
	default:
		System.out.println("enter te wrong input");
	}
}
public static void addStringItself(String str) {
	str+=str;
	System.out.println(str);
}
public static void replaceoddpos(String str)
{
	for(int i=0;i<=str.length();i++)
	{
		if(i%2!=0)
		str=str.substring(0,i-1)+"#"+str.substring(i,str.length());
	}
	System.out.println(str);
}
public static void removeduplicate(String str)
{
	char arr[]=str.toCharArray();
	Arrays.sort(arr);
	String res="";
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]==arr[i+1])
			{res+=arr[i+1];i++;}
		else
		res+=arr[i];
	}
	
	System.out.println(res);
}
public static void uppercase(String str)
{
	 StringBuffer strNew = new StringBuffer();
	 for (int i = 0; i < str.length(); i++) {
         if (i % 2 == 0) {
        	 strNew.append(str.charAt(i));
         }
         else
        	 strNew.append(Character.toUpperCase(str.charAt(i)));
         }
	 System.out.println(strNew);
}
}
