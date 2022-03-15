package day7jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/*
case 1 get all record 
case 2 insert new record
case 3 updae  a record
case 4 delete a record

 */
public class Database030_daoEmp {
	private Connection connect;
public Database030_daoEmp() throws CustomException
{
	ApplProperties props=new ApplProperties();
	Properties p=null;
	try {
		p = props.loadProperties();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	

	String url =p.getProperty("url");
	

	String user=p.getProperty("username");


	String password =p.getProperty("password");
	try {
		connect=DriverManager.getConnection(url,user,password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
	throw new CustomException("connection opening failed",e);
	}
}
public List<Employee>getAllEmployees()
{
	List<Employee>emplist=new ArrayList<>();
	try(
			Statement stmt=connect.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from employee");)
	
	{
		//process data in resultset
		while(rs.next())
		{
		int empNo=rs.getInt("empno");
		String empNm=rs.getString("ename");
		double empSal=rs.getFloat("sal");
		Employee e=new Employee(empNo,empNm,empSal);
				emplist.add(e);
		System.out.println(empNo+" "+empNm+" "+empSal);
		}
	}catch(SQLException e)
	{
		e.printStackTrace();
	}
	return emplist;
}
@Override
protected void finalize()throws Throwable
{
	if(connect!=null)
	{
		connect.close();
	}
	super.finalize();
}

}
