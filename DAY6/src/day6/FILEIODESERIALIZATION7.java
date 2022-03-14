package day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class FILEIODESERIALIZATION7 {

	public static void main(String[] args) {
		String filepath="C:\\Users\\HP\\eclipse-workspace\\DAY6\\src\\day6\\";
		String filename="Employees.ser";
		try(
			FileInputStream fis=new FileInputStream(filepath+filename);
				ObjectInputStream ois=new ObjectInputStream(fis);
				){
			ArrayList<Employee>emplist=(ArrayList<Employee>)ois.readObject();
			for(Employee rec:emplist)
			{
				System.out.println(rec);
			}
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e1)
		{
			e1.printStackTrace();
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
