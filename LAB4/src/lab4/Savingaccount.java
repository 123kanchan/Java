package lab4;

public class Savingaccount extends Account {
	
private static final double minbalance=500;
public void withdraw(double amount)
{
	if(balance<minbalance)
	{
		System.out.println("you can't withdraw");
	}
	else
	{
		if(amount>balance)
			System.out.println("cant withdraw");
		balance=balance-amount;
	}
}
}
