package lab11layeredarchitecture;


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


public class MobileConnectPool implements Imobile  {
	PGSimpleDataSource ds=null;
	static Logger myLogger=Logger.getLogger(MobileConnectPool.class.getName());//oyeeee
	public MobileConnectPool() {
		super();
		ds= new PGSimpleDataSource();
		ApplProperties props = new ApplProperties();
		Properties p = null;
		try {
			p=props.loadProperties();
			myLogger.info("properties are loaded");
		} catch (IOException e1) {
			myLogger.error(e1.getStackTrace());
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
	public List<Mobile> getAllMobiles() throws CustomException {
	
		List<Mobile> mobList = new ArrayList();
		try (
				Connection connect = ds.getConnection();//not opening a connection but procuring it from the connect
				Statement stmt = connect.createStatement(); // for create statement
				ResultSet rs = stmt.executeQuery("SELECT * FROM \"Mobile\"");) // Create resultset for taking values of query
		{
				//5. process data in resultset
				while(rs.next()) {
					int mobileid = rs.getInt("mobileId");
					String name= rs.getString("mobileName");
					int price = rs.getInt("pricenumber");
					int quantity = rs.getInt("quantity");
					Mobile m = new Mobile(mobileid,name,price,quantity);
					mobList.add(m); // adding in emp
					//System.out.println(mobileid + " |" + name + " |" + price + " |" + quantity);
				}
				myLogger.info("list of mobile ");
			} catch (SQLException e) {
				myLogger.error("can't get list of mobiles");
				e.printStackTrace();
			}
		return mobList;
		
	
		
	}

	@Override
	public boolean addNewMobile(Mobile m) throws CustomException {
		String query = "INSERT INTO \"Mobile\"(\"mobileId\", \"mobileName\",pricenumber,quantity )	VALUES (?, ?, ?,?)";
		Connection connect= null;
		PreparedStatement pstmt= null;	
		try {
				connect= ds.getConnection();
				connect.setAutoCommit(false);
				pstmt = connect.prepareStatement(query);
			
				pstmt.setInt(1, m.mobileid);  //putting values at ? place
				
				pstmt.setString(2, m.mobilename);
				pstmt.setDouble(3, m.price);
				pstmt.setInt(4, m.quantity);
				boolean isExec = pstmt.execute();
				
				connect.commit();
				myLogger.info("mobile added");
				return isExec;
			}catch(SQLException se) {
				try {
					connect.rollback();
					
				} catch (SQLException e1) {
					throw new CustomException("Failed while commiting insert.",se);
				}
				throw new CustomException("Failed while procuring list of all mobiles.",se);
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

	@Override
	public boolean deleteMobile(int mobileid) throws CustomException {
		String query = "DELETE FROM \"Mobile\"  WHERE \"mobileId\" = ?";
		Connection connect = null;
		PreparedStatement pstmt=null;
		try {
			connect = ds.getConnection();
			connect.setAutoCommit(false);
			pstmt = connect.prepareStatement(query);
	
			pstmt.setInt(1, mobileid);
			boolean isExec = pstmt.execute();
			connect.commit();
			myLogger.error("deleted 1 mobile");
			return isExec;
		}catch(SQLException se) {
			try {
				connect.rollback();
			} catch (SQLException e) {
				throw new CustomException("Failed while commiting delting.",se);
			}
			throw new CustomException("Failed while deleteing",se);
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

	@Override
	public List<Mobile> getMobilesOnPriceRange(int from, int to) throws CustomException {
		List<Mobile> mobList = new ArrayList();
		String sql = "SELECT * FROM \"Mobile\" WHERE pricenumber BETWEEN ? AND ? "; 
		Connection connect =null; 
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		try {
				 connect = ds.getConnection();//not opening a connection but procuring it from the connect
				  pstmt = connect.prepareStatement(sql); // for create statement
		
				pstmt.setInt(1,from);
				pstmt.setInt(2,to);
				
				rs = pstmt.executeQuery();
				//5. process data in resultset
				while(rs.next()) {
					int mobileid = rs.getInt("mobileId");
					String name= rs.getString("mobileName");
					double price = rs.getInt("pricenumber");
					int quantity = rs.getInt("quantity");
					Mobile m = new Mobile(mobileid,name,price,quantity);
					mobList.add(m); 
				
				}
				myLogger.info("getting details on price range");
			} catch (SQLException e) {
				
				e.printStackTrace();
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
		// Remember , the resource management will call close() on conncection which return conection back to the pool
		return mobList;
	}

	@Override
	public boolean updateMobileQuantityOnPurchase(int mobileid, int quantity) throws CustomException {
		String query = "UPDATE  \"Mobile\" SET quantity =? WHERE \"mobileId\" = ?";
		Connection connect = null;
		PreparedStatement pstmt=null;
		try {
			connect = ds.getConnection();
			connect.setAutoCommit(false);
			pstmt = connect.prepareStatement(query);
	
			pstmt.setInt(2, mobileid);
			pstmt.setInt(1,quantity);
			boolean isExec = pstmt.execute();
			connect.commit();
			return isExec;
		}catch(SQLException se) {
			try {
				connect.rollback();
			} catch (SQLException e) {
				throw new CustomException("Failed while commiting update.",se);
			}
			throw new CustomException("Failed while update",se);
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
