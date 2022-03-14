package pl;
import bean.Employee;
import java.util.Scanner;
public class Service implements EmployeeService{
	Scanner sc=new Scanner(System.in);
	Employee e=new Employee();
	public Service(){
		super();
	}
	public void Getemp()
	{
		System.out.println("Enter name : ");
		String name=sc.nextLine();
		System.out.println("Enter designation : ");
		String desgnation=sc.nextLine();
		System.out.println("Enter id : ");
		int id=sc.nextInt();
		System.out.println("Enter salary : ");
		double salary=sc.nextDouble();
		
		this.e.setId(id);
		this.e.setDesignation(desgnation);
	
		this.e.setName(name);
		this.e.setSalary(salary);
		
	}
	public String Findins()
	{
		if(e.getDesignation().equals("Btech"))
			return "eligible for car loan";
		if(e.getDesignation().equals("Mtech"))
			return "eligible for home loan";
		if(e.getDesignation().equals("phd"))
			return "eligible for gold loan";
		return "";
		
	}
	public void Displayemp()
	{
		System.out.println(e);
	}
}
