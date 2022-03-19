package hr;
import java.util.List;
public interface IDatabase050_serviceEmp {
	public List<Employee> getAllEmployes() throws CustomException;
	public boolean joinNewEmployee(Employee e) throws CustomException;
	public boolean awardIncrement(int empno, float sal) throws CustomException;
	public boolean retireOrExpelEmployee(Employee e) throws CustomException;
	List<Employee> getEmployeesOnSalRange(float from,float to) throws CustomException;
	Employee getEmployeesOnId(int empno) throws CustomException;
}



