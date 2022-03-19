package hr;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.postgresql.ds.PGSimpleDataSource;


import org.apache.log4j.PropertyConfigurator;




public class Database050_ConnectPool implements IDatabase050_daoEmp{
	PGSimpleDataSource ds =null;
	//logger
	//to make loggerr ready logger is aclass with get
		static Logger myLogger=Logger.getLogger(Database050_serviceEmp.class.getName());//oyeeee
	public Database050_ConnectPool() {
		super();
	 ds = new PGSimpleDataSource() ; 
	 
	 ApplProperties props=new ApplProperties();
		Properties p=null;
		try {
			p = props.loadProperties();
			myLogger.info("properties are loaded");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			//for logger
			//e1.printStackTrace();
			myLogger.error(e1.getStackTrace());
		}
		
		

		String database =p.getProperty("database");
		

		String user=p.getProperty("username");


		String password =p.getProperty("password");
		ds = new PGSimpleDataSource() ; //its a pool opeening n number of connection 
			ds.setDatabaseName(database );   
			ds.setUser( user );       
			ds.setPassword(password );
			myLogger.info("connection pool is ready");
	}
	@Override
	public List<Employee> getAllEmployees() throws CustomException {
		List<Employee>emplist=new ArrayList<>();
		try(
				Connection connect =ds.getConnection();//not opening connection but procuring it from connection
				//ds is a datasource javax.sql.Datasource 
				Statement stmt=connect.createStatement();
				ResultSet rs=stmt.executeQuery("Select * from employee");)
		
		{
			//process data in resultset
			
			myLogger.info("In getAllEmployees() resources are ready");
			while(rs.next())
			{
			int empNo=rs.getInt("empno");
			String empNm=rs.getString("ename");
			double empSal=rs.getFloat("sal");
			Employee e=new Employee(empNo,empNm,empSal);
					emplist.add(e);
			System.out.println(empNo+" "+empNm+" "+empSal);
			}
			myLogger.info("In getAllEmployees() data are ready");
		}catch(SQLException e)
		{
			myLogger.error(e.getStackTrace());
			throw new CustomException("failed while procuring list of all employee",e);
		}
		//remeber the resource management will call close method on connection which return connection bcak to the pool
		return emplist;
		
	}

	@Override
	public boolean insertNewRecord(Employee e) throws CustomException {
	
		String query="INSERT INTO employee(empno,ename,sal) VALUES(?,?,?)";//dynamic queries
		Connection connect =null;
		PreparedStatement pstmt=null;
		try {
				connect=ds.getConnection();
				connect.setAutoCommit(false);
				//Statement stmt=connect.createStatement();
			pstmt=connect.prepareStatement(query);
		
		//ResultSet rs=pstmt.executeQuery("Select * from employee");
		//statement is super interface of preparedstatement
		pstmt.setInt(1, e.getEmpno());
		pstmt.setString(2, e.getEmpNm());
		pstmt.setDouble(3, e.getEmpSal());
			boolean isExec=pstmt.execute();
			//explocit commit
			connect.commit();
		return isExec;}
			
		catch(SQLException se)
		{try {
			connect.rollback();
			
			
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			throw new CustomException("failed while commiting  procuring list of all employee",se);
		}
			throw new CustomException("failed while procuring list of all employee",se);
		}finally {
			try {
				if(pstmt!=null)
					pstmt.close();
				if(connect!=null)
					connect.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	

	@Override
	public boolean updateSalOfEmp(int empNo, float sal) throws CustomException {
		
		String query="UPDATE employee SET sal=? WHERE empno=?";//dynamic queries
		Connection connect =null;
		PreparedStatement pstmt=null;
		try {
				connect=ds.getConnection();
				connect.setAutoCommit(false);
				//Statement stmt=connect.createStatement();
			pstmt=connect.prepareStatement(query);
		
		//ResultSet rs=pstmt.executeQuery("Select * from employee");
		//statement is super interface of preparedstatement
			pstmt.setFloat(1, sal);
			
			pstmt.setInt(2, empNo);
			boolean isExec=pstmt.execute();
			//explocit commit
			connect.commit();
		return isExec;}
			
		catch(SQLException se)
		{try {
			connect.rollback();
			
			
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			throw new CustomException("failed while commiting  procuring list of all employee",se);
		}
			throw new CustomException("failed while procuring list of all employee",se);
		}finally {
			try {
				if(pstmt!=null)
					pstmt.close();
				if(connect!=null)
					connect.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

	@Override
	public boolean deleteEmployee(int empNo) throws CustomException {
	
		String query="DeLETE FROM employee WHERE empno=?";//dynamic queries
		Connection connect =null;
		PreparedStatement pstmt=null;
		try {
				connect=ds.getConnection();
				connect.setAutoCommit(false);
				//Statement stmt=connect.createStatement();
			pstmt=connect.prepareStatement(query);
		
		//ResultSet rs=pstmt.executeQuery("Select * from employee");
		//statement is super interface of preparedstatement
			pstmt.setInt(1, empNo);
			boolean isExec=pstmt.execute();
			//explocit commit
			connect.commit();
		return isExec;}
			
		catch(SQLException se)
		{try {
			connect.rollback();
			
			
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			throw new CustomException("failed while commiting  procuring list of all employee",se);
		}
			throw new CustomException("failed while procuring list of all employee",se);
		}finally {
			try {
				if(pstmt!=null)
					pstmt.close();
				if(connect!=null)
					connect.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	@Override
	public List<Employee> getEmployeesOnSalRange(float from, float to) throws CustomException {
		// TODO Auto-generated method stub
		
		List<Employee> emplist=new ArrayList<>();
		String sql="SELECT * FROM employee WHERE sal BETWEEN ? AND ?";
		Connection connect=null;
		PreparedStatement pst =null;
		ResultSet rs =null;
		
		try {	
				connect=ds.getConnection();
				pst = connect.prepareStatement(sql);
				pst.setFloat(1, from);
				pst.setFloat(2, to);
				rs = pst.executeQuery();

			while (rs.next()) {
				int empno = rs.getInt("EMPNO");
				String ename = rs.getString("ENAME");
				float sal = rs.getFloat("SAL");
				Employee e=new Employee(empno,ename,sal);
				emplist.add(e);
				System.out.println(empno + " " + ename + " " + sal);
			}	
		}

		catch (SQLException e) {
			throw new CustomException("Failed while procuring employee.",e);
		}
		finally {
			try {
				if (pst != null) {
					pst.close();
				}
				if (connect != null) {
					connect.close(); // Returns connection back to the pool.
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return emplist;
		

	}
	@Override
	public Employee getEmployeesOnId(int empno) throws CustomException {
		// TODO Auto-generated method stub
		
		String sql="SELECT * FROM employee WHERE empno=?";
		Connection connect=null;
		PreparedStatement pst =null;
		ResultSet rs =null;
		
		try {	
				connect=ds.getConnection();
				pst = connect.prepareStatement(sql);
				pst.setInt(1, empno);
				rs = pst.executeQuery();

			if(rs.next()) {
				String ename = rs.getString("ENAME");
				float sal = rs.getFloat("SAL");
				Employee emp=new Employee(empno,ename,sal);
				return emp;
			}
			else {
				return null;
			}
		}

		catch (SQLException e) {
			throw new CustomException("Failed while procuring employee.",e);
		}
		finally {
			try {
				if (pst != null) {
					pst.close();
				}
				if (connect != null) {
					connect.close(); // Returns connection back to the pool.
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}

		
	}

		
		
	}

	


