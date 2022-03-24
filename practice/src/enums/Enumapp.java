package enums;

import java.util.Scanner;

public class Enumapp {
	private static int userId;
	private static String userName;
	private static Userstatus status;
public static void main(String[] args) {
	 
	Scanner sc=new Scanner(System.in);
	userId=sc.nextInt();
	sc.nextLine();
	userName=sc.nextLine();
	String a=sc.nextLine();
	status=Userstatus.valueOf(a);
	User obj=new User();
	obj.setStatus(status);
	obj.setUserId(userId);
	obj.setUserName(userName);
	System.out.println(obj.getUserId()+" "+obj.getUserName()+" "+obj.getStatus());
}
	

}


//another class
class User{

	private static int userId;
	
	
	private static String userName;
	private static Userstatus status;
	public static int getUserId() {
		return userId;
	}
	public static void setUserId(int userId) {
		User.userId = userId;
	}
	public static String getUserName() {
		return userName;
	}
	public static void setUserName(String userName) {
		User.userName = userName;
	}
	public static Userstatus getStatus() {
		return status;
	}
	public static void setStatus(Userstatus status) {
		User.status = status;
	}

}