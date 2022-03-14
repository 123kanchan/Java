package day2;

import java.util.Scanner;

public class RegistrationApp {
public static void main(String[]args)
{
	Registrationable obj=null;
	Ak obj2=new Ak();
	Scanner scanner =  new Scanner(System.in);
	int choice =  scanner.nextInt();
	   switch(choice) {
	   case 1 :
		   obj2.register();
		   obj=new lion();
		   obj.register();
	   break;
	   case 2:
		   obj2.register();
		   obj=new deer();
		   obj.register();
	   break;
	   case 3: obj2.register();
		   obj=new elephant();
		   obj.register();
	   }
}
}
