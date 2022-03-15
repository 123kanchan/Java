package day7jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
//in io its autocloasable interface
public class database020_Closable {
	
public static void main(String[] args) {
	
	ApplProperties props=new ApplProperties();
	Properties p=null;
	try {
		p = props.loadProperties();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
//	String url = "jdbc:postgresql://localhost/postgres";
	String url =p.getProperty("url");
	
	 //String user = "postgres";
	String user=p.getProperty("username");

	//	String password = "system";
	String password =p.getProperty("password");
	System.out.println(url + user + password);
		try(Connection connect=DriverManager.getConnection(url,user,password);
				Statement stmt=connect.createStatement();
				ResultSet rs=stmt.executeQuery("Select * from employee");)
		
		{
			//process data in resultset
			while(rs.next())
			{
			int empNo=rs.getInt("empno");
			String empNm=rs.getString("ename");
			float empSal=rs.getFloat("sal");
			System.out.println(empNo+" "+empNm+" "+empSal);
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
}
}
