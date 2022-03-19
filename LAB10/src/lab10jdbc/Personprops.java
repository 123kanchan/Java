/*Write a program to store a person details in a properties file named as 
“PersonProps.properties” and also do the following tasks:
a) Read data from properties file, load the data into Properties object and display the 
data in the console.
b) Read data from properties file(using getProperties method) and print data in the 
console
 * 
 * 
 * */


package lab10jdbc;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.sql.Connection;
import java.util.Properties;
import java.util.Set;


public class Personprops {
	//creating property file properties is a hash map,all in string form
	public void createProperties(Properties p) throws IOException
	{
		String filePath="C:\\Users\\HP\\eclipse-workspace\\LAB10\\src\\lab10jdbc\\";
		String fileName="PersonProps.properties";
		FileOutputStream fos=new FileOutputStream(filePath + fileName);
	   p.store(fos, "This is a propertuy file holding configuration properties of an application");

	}

	//new method
	public Properties loadProperties() throws IOException
	{
		String filePath="C:\\Users\\HP\\eclipse-workspace\\LAB10\\src\\lab10jdbc\\";
		String fileName="PersonProps.properties";
		FileInputStream fis=new FileInputStream(filePath+fileName);
		Properties p=new Properties();
		p.load(fis);
		return p;
	}
	//method3
	public void printProperties(Properties p)
	{
		Set<Object>keys=p.keySet();
		for(Object key:keys)
		{
			System.out.println("key:"+key+" "+p.getProperty((String)key));
		}
	}

	public static void main(String[] args) {
		Personprops props=new Personprops();
		//for method 1 it was
		Properties p=new Properties();
		p.setProperty("filePath","C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\LAB9\\\\src\\\\lab10jdbc\\\\" );
		//p.setProperty("fileName", "MyText.txt");
		//p.setProperty("userName","kanchan123");
		//p.setProperty("password", "23");
		p.setProperty("name", "kanchan rawat");
		p.setProperty("age", "21");
		p.setProperty("course", "Btech");
		
		
		try {
			props.createProperties(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//for method 2
		try {
			Properties pq=props.loadProperties();
			props.printProperties(pq);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
