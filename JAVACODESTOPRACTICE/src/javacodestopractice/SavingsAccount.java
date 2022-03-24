package javacodestopractice;

public class SavingsAccount extends Account {

   private double minimumBalance;
    private int accountNumber;
    private  Customer customerObj;
     private double  balance;
    
public SavingsAccount(int accountNumber, Customer customerObj,double  balance ,double minimumBalance)
{
	
	this.accountNumber=accountNumber;
	this.customerObj=customerObj;
	this.balance=balance;
this.minimumBalance=minimumBalance;
}

public boolean withdraw(double amount) 
 {
	if(balance-amount>minimumBalance)
	{
		balance-=amount;
		return true;
	}
	 return false;
	 
 }



}
