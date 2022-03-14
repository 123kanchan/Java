package service;
import pl.EmployeeService;
import pl.Service;
public class EmployeeApp {
public static void main(String[] args) {
	Service obj=null;
obj=new Service();
obj.Getemp();
System.out.println(obj.Findins());
obj.Displayemp();
}
}
