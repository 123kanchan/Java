package lab11layeredarchitecture;

import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {

  int purchaseid;
 String cname;
	 String mailid;
	 String phoneno;
	LocalDate purchasedate;
int mobileid;
		public int getPurchaseid() {
		return purchaseid;
	}
	public void setPurchaseid(int purchaseid) {
		this.purchaseid = purchaseid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public LocalDate getPurchasedate() {
		return purchasedate;
	}
	public void setPurchasedate(LocalDate purchasedate) {
		this.purchasedate = purchasedate;
	}
	public int getMobileid() {
		return mobileid;
	}
	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}
		@Override
	public String toString() {
		return "Customer [purchaseid=" + purchaseid + ", cname=" + cname + ", mailid=" + mailid + ", phoneno=" + phoneno
				+ ", purchasedate=" + purchasedate + ", mobileid=" + mobileid + "]";
	}
		public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
		public Customer(int purchaseid, String cname, String mailid, String phoneno, LocalDate purchasedate, int mobileid) {
		super();
		this.purchaseid = purchaseid;
		this.cname = cname;
		this.mailid = mailid;
		this.phoneno = phoneno;
		this.purchasedate = purchasedate;
		this.mobileid = mobileid;
	}
		

		
		public boolean validateName(String name) throws CustomException
		{
			String s ="^[a-zA-Z]+";
			Pattern pattern =Pattern.compile(s);
			Matcher m=pattern.matcher(name);
			if( m.matches() != true) {
				throw new CustomException("Name not valid");	
			}
			else
				return true;
		}

		public boolean validateMail(String mail) throws CustomException
		{
			String s ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+.(com)$";
			Pattern pattern =Pattern.compile(s);
			Matcher m=pattern.matcher(mail);
			if( m.matches() != true) {
				throw new CustomException("Mail not valid");	
			}
			else
				return true;
		}

		public boolean validatePhoneno(String number) throws CustomException
		{
			String s ="\\d{10}";
			Pattern pattern =Pattern.compile(s);
			Matcher m=pattern.matcher(number);
			if( m.matches() != true) {
				throw new CustomException("Phone number entered is not valid");	
			}
			else
				return true;
		}

		public boolean validateMobileId(String i) throws CustomException
		{
			String s ="\\d{4}";
			Pattern pattern =Pattern.compile(s);
			Matcher m=pattern.matcher(i);
			if( m.matches() != true) {
				throw new CustomException("Mobile Id entered is not valid");
			}
			else
				return true;
		}
}
