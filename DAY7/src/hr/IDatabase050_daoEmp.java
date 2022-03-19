package hr;

import java.util.List;
import log.*;
/*
case 1 get all record 
case 2 insert new record
case 3 updae  a record
case 4 delete a record

 */
public interface IDatabase050_daoEmp {
	List<Employee>getAllEmployees() throws CustomException;
	boolean insertNewRecord(Employee e) throws CustomException;
	boolean updateSalOfEmp(int empNo,float sal)throws CustomException;
	boolean deleteEmployee(int empNo)throws CustomException;
	List<Employee> getEmployeesOnSalRange(float from,float to) throws CustomException;
	Employee getEmployeesOnId(int empno) throws CustomException;
}
