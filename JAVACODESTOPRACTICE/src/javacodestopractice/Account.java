package javacodestopractice;

public abstract class Account {

	protected int accountNumber;
   protected Customer customerObj;
    protected double balance;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accountNumber, Customer customerObj, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.customerObj = customerObj;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Customer getCustomerObj() {
		return customerObj;
	}
	public void setCustomerObj(Customer customerObj) {
		this.customerObj = customerObj;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", customerObj=" + customerObj + ", balance=" + balance
				+ "]";
	}
    abstract public boolean withdraw(double amount) ;

}
