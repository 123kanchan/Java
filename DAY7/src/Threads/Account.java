package Threads;

public class Account {
private int accNo;
private String accNm;
private float accBal;
public Account(int accNo, String accNm, float accBal) {
	super();
	this.accNo = accNo;
	this.accNm = accNm;
	this.accBal = accBal;
}
public void deposit(float amt)
{
	accBal+=amt;
}
public void withdraw(float amt)
{
	accBal-=amt;
}
@Override
public String toString() {
	return "Account [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
}
public int getAccNo() {
	return accNo;
}
public String getAccNm() {
	return accNm;
}
public float getAccBal() {
	return accBal;
}
}
