package lab11layeredarchitecture;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Properties;
import java.util.*;
import org.postgresql.ds.PGSimpleDataSource;

public class PurchaseConnectPool  implements IPurchase{
	PGSimpleDataSource ds=null;
	public PurchaseConnectPool() {
		super();
		ds= new PGSimpleDataSource();
		ApplProperties props = new ApplProperties();
		Properties p = null;
		try {
			p=props.loadProperties();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		 String database = p.getProperty("database");			// Taking database username and password from property file/
		 String user = p.getProperty("username");
		 String password = p.getProperty("password");

		ds = new PGSimpleDataSource() ; // this are connection pool Establsihed connection here only
		ds.setDatabaseName( database );   
		ds.setUser( user );       
		ds.setPassword( password ); 
	}

	@Override
	public boolean insertPurchaseDetails(Customer p) throws CustomException {
		String query ="INSERT INTO \"Purchasedetails\" (purchaseid, cname, mailid, purchasedate,mobileid, phoneno) VALUES(?,?,?,?,?,?) ";
		Connection connect= null;
		PreparedStatement pstmt= null;	
		try {
				connect= ds.getConnection();
				connect.setAutoCommit(false);
				pstmt = connect.prepareStatement(query);
				LocalDate d = p.purchasedate;
				pstmt.setInt(1, p.purchaseid);  //putting values at ? place
				if(p.validateName(p.getCname()))
				pstmt.setString(2, p.cname);
				if(p.validateMail(p.getMailid()))
				pstmt.setString(3, p.mailid);
				if(p.validatePhoneno(p.getPhoneno()))
				pstmt.setString(6, p.phoneno);
				pstmt.setObject(4, d);
				pstmt.setInt(5, p.mobileid);
				boolean isExec = pstmt.execute();
				
				connect.commit();
				return isExec;
			}catch(SQLException se) {
				try {
					connect.rollback();
					
				} catch (SQLException e1) {
					throw new CustomException("Failed while commiting insert.",se);
				}
				throw new CustomException("Failed while procuring list of all purchase details.",se);
			}
			finally {
				try {
					if(pstmt!=null)
						pstmt.close();
					if(connect != null) {
						connect.close();
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		
	}

}
