package lab8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class objtofile {

	public static void main(String[] args) {
		Employee e=new Employee(21,"kanchan",2100);
		String filepath="C:\\Users\\HP\\eclipse-workspace\\LAB8\\src\\lab8\\objoutput3rd.txt";
		try {
			FileOutputStream fileOut=new FileOutputStream(filepath);
			ObjectOutputStream oos=new 	ObjectOutputStream(fileOut);
			
			oos.writeObject(e);
			FileInputStream fis=new FileInputStream(filepath);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object obj1=ois.readObject();
			System.out.println(obj1);
			ois.close();
			oos.close();
		}catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}

}
