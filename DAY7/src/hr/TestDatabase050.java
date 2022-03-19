

package hr;



import java.util.List;

import org.apache.log4j.PropertyConfigurator;




public class TestDatabase050 {
public static void main(String[] args) {
	PropertyConfigurator.configure("resources/log4j.properties");
	IDatabase050_serviceEmp service= new  Database050_serviceEmp();
	
		try {
			List<Employee> lst=service.getAllEmployes();
			
			for(Employee emp:lst) {
				System.out.println(emp);}
			
			
			/*  Employee e=new Employee(109, "Dinesh", 8000); service.joinNewEmployee(e);*/
			 
		/*service.awardIncrement(109, 10000);*/
			/*List<Employee> lst1=service.getEmployeesOnSalRange(5000, 30000);
			for(Employee emp:lst1) {
				System.out.println(emp);}*/
			/*System.out.println(service.getEmployeesOnId(109));*/
			
			}
		catch (CustomException e) {
			e.printStackTrace();
		}
	
	} 

}



