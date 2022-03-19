package day7jdbc;

import java.util.List;
/*
case 1 get all record 
case 2 insert new record
case 3 updae  a record
case 4 delete a record

 */
public interface IDatabase030_daoEmp {
	List<Employee>getAllEmployees() throws CustomException;
	boolean insertNewRecord(Employee e) throws CustomException;
	boolean updateSalOfEmp(int empNo,float sal)throws CustomException;
	boolean deleteEmployee(int empNo)throws CustomException;
	
}
