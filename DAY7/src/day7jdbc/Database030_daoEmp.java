package day7jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
/*
 * sattement for stati cqueries 
 * prepared statement sub interface of statement for static and dynamic queries
 * callable statement sub interface of statement
 */
  

/*connection is on 1 database
 * here in java transaction mannagement hapens with one dataabse only
 * java does not support transaction management across multiple databases
 * java does not support distributed transaction(across multiple databse)
 * distributed transaction are supported by JPA(java persistence api)
 * java support simple an dlocal transaction only
 * working with one databse and handling transaction with 1 database called simple/local transaction
hibernate and spring also simple transaction
distributed transation are supported by JPA java persistence API,spring JPA)).
 */
public class Database030_daoEmp implements IDatabase030_daoEmp {
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
	//transaction set to false
		connect.setAutoCommit(false);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
	throw new CustomException("connection opening failed",e);
	}
}
public List<Employee>getAllEmployees() throws CustomException
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
		throw new CustomException("failed while procuring list of all employee",e);
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
@Override
public boolean insertNewRecord(Employee e) throws CustomException {
	String query="INSERT INTO employee(empno,ename,sal) VALUES(?,?,?)";//dynamic queries
	try(
			
			//Statement stmt=connect.createStatement();
			PreparedStatement pstmt=connect.prepareStatement(query);
	)
	//ResultSet rs=pstmt.executeQuery("Select * from employee");
	//statement is super interface of preparedstatement
	{pstmt.setInt(1, e.getEmpno());
	pstmt.setString(2, e.getEmpNm());
	pstmt.setDouble(3, e.getEmpSal());
		boolean isExec=pstmt.execute();
		//explocit commit
		connect.commit();
	return isExec;
		
	}catch(SQLException se)
	{try {
		connect.rollback();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		throw new CustomException("failed while commiting  procuring list of all employee",se);
	}
		throw new CustomException("failed while procuring list of all employee",se);
	}
	
}
@Override
public boolean updateSalOfEmp(int empNo, float sal) throws CustomException {
	
	
	String query="UPDATE employee SET sal=? WHERE empno=?";//dynamic queries
	try(
			
			//Statement stmt=connect.createStatement();
			PreparedStatement pstmt=connect.prepareStatement(query);
	)
	//ResultSet rs=pstmt.executeQuery("Select * from employee");
	//statement is super interface of preparedstatement
	{pstmt.setFloat(1, sal);
	
	pstmt.setInt(2, empNo);
		boolean isExec=pstmt.execute();
		connect.commit();
	return isExec;
		
	}catch(SQLException se)
	{try {
		connect.rollback();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		throw new CustomException("failed while commiting updtating list of all employee",se);
	}
		throw new CustomException("failed while updtating list of all employee",se);
	}
	
}
@Override
public boolean deleteEmployee(int empNo) throws CustomException {
	
	String query="DeLETE FROM employee WHERE empno=?";//dynamic queries
	try(
			
			//Statement stmt=connect.createStatement();
			PreparedStatement pstmt=connect.prepareStatement(query);
	)
	//ResultSet rs=pstmt.executeQuery("Select * from employee");
	//statement is super interface of preparedstatement
	{pstmt.setInt(1, empNo);

		boolean isExec=pstmt.execute();
		connect.commit();
	return isExec;
		
	}catch(SQLException se)
	{try {
		connect.rollback();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		throw new CustomException("failed while commiting deleting list of all employee",se);
	}
		throw new CustomException("failed while deleting list of all employee",se);
	}
	
}

}
