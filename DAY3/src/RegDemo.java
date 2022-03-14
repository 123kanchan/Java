/*
 * [5:35 pm, 07/03/2022] kanchanrawat: write a code to check whether the two accepted strings are each others reversed strings or not ?
[5:36 pm, 07/03/2022] kanchanrawat: accept a string and check whether it starts with a capital letter and end witha ! mark
[5:36 pm, 07/03/2022] kanchanrawat: accept a string and check it starts with a capital letter and ends witha  question mark
[5:38 pm, 07/03/2022] kanchanrawat: accept a string ,find how many digits , upper case and lower cases are there in that string
*/
import java.util.Scanner;
import java.util.regex.*;
public class RegDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	check(str);
	String str2=sc.next();
	String str3="";
	char arr[]=str.toCharArray();
for(int i=arr.length-1;i>=0;i--)
{	
	str3+=arr[i];
}
if(str3.equals(str2))
{
	System.out.println("reverse of each other");
}
else
	System.out.println("not reverse");
}
public static void check(String str)
{
	Pattern p=Pattern.compile("")
}
}
