package day7jdbc;
/*
 * use connection pool over connection managememt of your own
 * this is DAO class implemented using interface
 * from the DAO class jdbc compoment 
 * 
 * */
import java.util.List;

public class Database040_TestConnectPool {

	public static void main(String[] args) {
		try {
			IDatabase030_daoEmp  daoEmp=new Database040_ConnectPool ();
			/*
			//Database030_daoEmp  daoEmp=new Database030_daoEmp ();
			IDatabase030_daoEmp  daoEmp=new Database030_daoEmp ();*/
		/*List<Employee>empList=daoEmp.getAllEmployees();
		for(Employee rec:empList)
			System.out.println(rec);
		*/
			/*
		Employee e=new Employee(4,"aamary",9000);
		daoEmp.insertNewRecord(e);
		
			System.out.println("record inserted successfully");
		*/
		//daoEmp.updateSalOfEmp(2, 80000);
			daoEmp.deleteEmployee(4);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			System.out.println("record insertion failed");
			e.printStackTrace();
		}

	}

}
