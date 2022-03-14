package lab4;

public class CurrentAccount extends Account {
public double overdraftlimit=500;
public void withdrawl(double amount)
{
	double balance=0;
	if(amount<overdraftlimit+balance)
	{
		balance-=amount;
		System.out.println(balance);
	}
	else
		System.out.println("cannot be withdrawn ,overlimitreached");
}
}
