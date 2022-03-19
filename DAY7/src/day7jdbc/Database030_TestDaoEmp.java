package day7jdbc;

import java.util.List;

public class Database030_TestDaoEmp {

	public static void main(String[] args) {
		try {
			IDatabase030_daoEmp  daoEmp=new Database030_daoEmp ();
			/*
			//Database030_daoEmp  daoEmp=new Database030_daoEmp ();
			IDatabase030_daoEmp  daoEmp=new Database030_daoEmp ();
		List<Employee>empList=daoEmp.getAllEmployees();
		for(Employee rec:empList)
			System.out.println(rec);
		
		Employee e=new Employee(3,"mary",9000);
		daoEmp.insertNewRecord(e);
		
			System.out.println("record inserted successfully");
		*/
		//daoEmp.updateSalOfEmp(2, 70000);
			daoEmp.deleteEmployee(1);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			System.out.println("record insertion failed");
			e.printStackTrace();
		}
	}

}
