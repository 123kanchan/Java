package javacodestopractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Globalinfo {

public static void main(String[] args) {
	String id;
	Scanner sc=new Scanner(System.in);
	id=sc.nextLine();
Pattern p=Pattern.compile("^GBL/[0-9]{3}/[0-9]{4}$");
Matcher m=p.matcher(id);
if(m.matches()==true)
{
	System.out.println("valid login");
}
else System.out.println("invalid login");
	
}



}
