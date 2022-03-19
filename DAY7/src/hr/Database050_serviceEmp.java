package hr;
import java.util.List;

import org.apache.log4j.Logger;

import log.MyClass;
public class Database050_serviceEmp implements IDatabase050_serviceEmp{
	private IDatabase050_daoEmp dao=null;
	
	static Logger myLogger=Logger.getLogger(Database050_serviceEmp.class.getName());
	
	public Database050_serviceEmp() {
		dao=new Database050_ConnectPool();
		myLogger.info("In constructor dao object created");
	}
	
	@Override
	public List<Employee> getAllEmployes() throws CustomException {
		List<Employee> lst=dao.getAllEmployees();
		myLogger.info("In method list created created");
		return lst;
	}

	@Override
	public boolean joinNewEmployee(Employee e) throws CustomException {
		boolean result=dao.insertNewRecord(e);
		return result;
	}

	@Override
	public boolean awardIncrement(int empno, float sal) throws CustomException {
		boolean result=dao.updateSalOfEmp(empno, sal);
		return result;
	}

	@Override
	public boolean retireOrExpelEmployee(Employee e) throws CustomException {
		
		return false;
	}

	@Override
	public List<Employee> getEmployeesOnSalRange(float from, float to) throws CustomException {
		List<Employee> lst1=dao.getEmployeesOnSalRange(from, to);
		return lst1;
	}

	@Override
	public Employee getEmployeesOnId(int empno) throws CustomException {
		Employee emp=dao.getEmployeesOnId(empno);
		return emp;
	}
	
}


