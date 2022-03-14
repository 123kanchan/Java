package lab4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Reg {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	 if (passwordmatcher(str)) {
		  System.out.println("valid");}
		  else
			 System.out.println("invalid password ");
	  }

public static boolean passwordmatcher(String password)
{
	 Pattern passwords =Pattern.compile("[A-Z a-z 0-9]+[!@#4567*]+");
	 Matcher matcher =  passwords.matcher(password);
	   return matcher.matches();
	
}
}
