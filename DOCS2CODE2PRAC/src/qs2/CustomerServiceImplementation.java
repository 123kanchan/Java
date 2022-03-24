package qs2;
import qs2.model.*;
import qs2.utility.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.postgresql.ds.PGSimpleDataSource;

public class CustomerServiceImplementation {
	
	PGSimpleDataSource ds;
	
	public CustomerServiceImplementation() {
		ds=new PGSimpleDataSource();
		ds.setDatabaseName("postgres");
		ds.setUser("postgres");
		ds.setPassword("system");
	}
	
	public int addCustomer(Customer cus) {
		Connection connect=null;
		PreparedStatement pstat=null;
		String query="insert into \"Customer\"(custoid,customername,customeremail,customeraddress,customerphone,customercity) values(?,?,?,?,?,?)";
		
		try {
			connect=ds.getConnection();
			connect.setAutoCommit(false);
			
			pstat=connect.prepareStatement(query);
			pstat.setInt(1, cus.getCustomerId());
			pstat.setString(2,cus.getCustomerName());
			pstat.setString(3,cus.getCustomerEmail());
			pstat.setString(4,cus.getCustomerAddress());
			pstat.setLong(5,cus.getCustomerPhone());
			pstat.setString(6, cus.getCustomerCity());
			
			pstat.execute();
			connect.commit();
			return 1;
		}
		catch(SQLException sqe) {sqe.printStackTrace();}
		finally {
			try {
				if(pstat!=null)
					pstat.close();
				if(connect!=null)
					connect.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	
	public List<Customer> getCustomer(){
		List<Customer> cusList=new ArrayList<>();
		
		try(Connection connect=ds.getConnection();
				Statement stmt=connect.createStatement();  //static queries
			ResultSet rs = stmt.executeQuery("select * from \"Customer\"");
				){
			while(rs.next()) {
				int id=rs.getInt("custoid");
				String na=rs.getString("customername");
				String mail=rs.getString("customeremail");
				String addr=rs.getString("customeraddress");
				Long ph=rs.getLong("customerphone");
				String ci=rs.getString("customercity");
				Customer cu=new Customer(id,na,mail,addr,ph,ci);
				cusList.add(cu);
			}
		} catch(SQLException e) {
		}
		return cusList;
	}
	
	public Customer getCustomerById(int id) {
		String query="select * from \"Customer\" where custoid=?";
		try(
			Connection connect=ds.getConnection();
			PreparedStatement pstmt=connect.prepareStatement(query); ){
			pstmt.setFloat(1, id);
			
			ResultSet rs=pstmt.executeQuery();
			
			if(rs.next()) {
				int idd=rs.getInt("custoid");
				String na=rs.getString("customername");
				String mail=rs.getString("customeremail");
				String addr=rs.getString("customeraddress");
				Long ph=rs.getLong("customerphone");
				String ci=rs.getString("customercity");
				Customer cu=new Customer(idd,na,mail,addr,ph,ci);
				return cu;
			}			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	public List<Customer> getCustomerBasedOnCity(String city){
		List<Customer> cusList=new ArrayList<>();
		String query=" select * from \"Customer\" where customercity=?";
		try(Connection connect=ds.getConnection();
			PreparedStatement pstmt=connect.prepareStatement(query); //static queries
				){
			pstmt.setString(1, city);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("custoid");
				String na=rs.getString("customername");
				String mail=rs.getString("customeremail");
				String addr=rs.getString("customeraddress");
				Long ph=rs.getLong("customerphone");
				String ci=rs.getString("customercity");
				Customer cu=new Customer(id,na,mail,addr,ph,ci);
				cusList.add(cu);
			}
		} catch(SQLException e) {
		}
		return cusList;
		
	}

	public int updateCustomer(int customerId) {
		String query="update \"Customer\" set customerphone= ?,customercity=? where customerid = ?"; 
		Connection connect=null;
		PreparedStatement pstmt=null;
		try{
			connect=ds.getConnection();
			connect.setAutoCommit(false);
			pstmt=connect.prepareStatement(query);
			
			pstmt.setLong(1, 1234567890);
			pstmt.setString(2,"NY");
			pstmt.setInt(3,customerId);
			
			pstmt.execute();
			connect.commit();
			return 1;
				
			} 
		catch(SQLException se) {
				try {
					connect.rollback();
				}
				catch(SQLException sqe) {
					sqe.printStackTrace();
				}		
		}
		finally {
			try {
				if(pstmt!=null)
					pstmt.close();
				if(connect!=null)
					connect.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return 0;
			
	}
	
	public int deleteCustomer(int customerId) {
		
		String query="delete from \"Customer\" where custoid = ? ";
		Connection connect=null;
		PreparedStatement pstmt=null;
		try{
			connect=ds.getConnection();
			connect.setAutoCommit(false);
			pstmt=connect.prepareStatement(query);
			
			pstmt.setInt(1,customerId);
			
			pstmt.execute();
			connect.commit();
			return 1;
				
			} 
		catch(SQLException se) {
				try {
					connect.rollback();
				}
				catch(SQLException sqe) {
					sqe.printStackTrace();

				}
			}
		finally {
			try {
				if(pstmt!=null)
					pstmt.close();
				if(connect!=null)
					connect.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return 0;
		
	}
}
