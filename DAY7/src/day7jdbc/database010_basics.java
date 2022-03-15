package day7jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class database010_basics {

	public static void main(String[] args) {
		/*it willr un code if comment or don't comment
		try {
			//1.load driver
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return;
		}*/
		//2.create connection
		 String url = "jdbc:postgresql://localhost/postgres";
	 String user = "postgres";
		String password = "system";
		Connection connect=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			connect = DriverManager.getConnection(url,user,password);
			
stmt = connect.createStatement();

rs = stmt.executeQuery("SELECT * FROM employee");
			//process data in resultset
while(rs.next())
{
int empNo=rs.getInt("empno");
String empNm=rs.getString("ename");
float empSal=rs.getFloat("sal");
System.out.println(empNo+" "+empNm+" "+empSal);
}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)
				{
					rs.close();
				}
				//close statement/prepare statatement
				if(stmt!=null)
				{
					stmt.close();
				}
					
						//close connection
				if(connect!=null)
				{
					connect.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		//close resultset

	}

}
