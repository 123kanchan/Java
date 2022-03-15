package day7jdbc;

import java.util.List;

public class Database030_TestDaoEmp {

	public static void main(String[] args) {
		try {
			Database030_daoEmp  daoEmp=new Database030_daoEmp ();
		List<Employee>empList=daoEmp.getAllEmployees();
		for(Employee rec:empList)
			System.out.println(rec);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
