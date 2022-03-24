package javacodestopractice;

public class AccountApp {

	public static void main(String[] args) {
		Customer obj=new Customer(1,"kanchan","kan@gmail.com");
		SavingsAccount obj1=new SavingsAccount(1011, obj,5000,500);
	if(obj1.withdraw(6000))
		System.out.println("withdraw sucessful");
	else
		System.out.println("not successful");
	}

}
