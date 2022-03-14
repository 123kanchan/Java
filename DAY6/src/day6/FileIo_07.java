package day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileIo_07 {

	public static void main(String[] args) {
	ArrayList <Employee>emplist=new ArrayList<>();
	emplist.add(new Employee(1000,"Chandra",40000));
	emplist.add(new Employee(1001,"Chandran",40000));
	emplist.add(new Employee(1002,"john",40000));
	emplist.add(new Employee(1003,"adam",40000));
	emplist.add(new Employee(1004,"mary",40000));
	String filepath="C:\\Users\\HP\\eclipse-workspace\\DAY6\\src\\day6\\";
	String filename="Employees.ser";
	try (
	FileOutputStream fos=new FileOutputStream(filepath+filename);
	ObjectOutputStream oos=new 	ObjectOutputStream(fos);
	){
		oos.writeObject(emplist);
	}catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}catch(IOException e1)
	{
		e1.printStackTrace();
	}
	}
}
