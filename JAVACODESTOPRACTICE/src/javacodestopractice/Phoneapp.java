package javacodestopractice;

import java.util.ArrayList;
import java.util.List;


import java.util.Scanner;

public class Phoneapp {
	public static void main(String[] args) {
		Phonebook p=new Phonebook();
		int i;
		
		do {
		System.out.println("Menu\r\n"
				+ "1.Add Contact\r\n"
				+ "2.Display all contacts\r\n"
				+ "3.Search contact by phone \r\n"
				+ "4.Remove contact\r\n"
				+ "5.Exit\r\n"
				+ "");
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your choice: ");
		i=sc.nextInt();
		switch(i) {
		case 1:System.out.println("add a contact");
		System.out.print("enter the first name: ");
		String f=sc.next();
		System.out.print("enter the last name: ");
		String l=sc.next();
		System.out.println("enter the phn no");
		long no=sc.nextLong();
		System.out.print("enter the email: ");
		String e=sc.next();
		AironeContact c=new AironeContact(f, l,no, e);
		p.addContact(c);
		break;
		case 2:System.out.println("The contacts in the List are:");
		System.out.println(p.viewAllContacts());
		break;
		case 3:System.out.print("Enter the Phone number to search contact:");
		long no1=sc.nextLong();
		System.out.println("the contact is: ");
		System.out.println(p.viewContactGivenPhone(no1));
		break;
		case 4:System.out.print("Enter the Phone number to remove ");
		long no3=sc.nextLong();
		System.out.print("Do you want to remove the contact (Y/N): ");
		char c1=sc.next().charAt(0);
		if(c1=='Y') {
			p.removeContact(no3);
			System.out.println("contact deleted successfully");
		}
		else {
			break;
		}
		break;
		
		case 5:
			System.exit(0);
		
		}
		
		
		
		
		
		
		
		
		}while(i!=5);
	}

}

