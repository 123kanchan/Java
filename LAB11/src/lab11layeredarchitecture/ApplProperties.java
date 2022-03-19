package lab11layeredarchitecture;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Set;


//creating loading showing property files
public class ApplProperties {
	String filePath="C:\\Users\\HP\\eclipse-workspace\\LAB11\\src\\lab11layeredarchitecture\\";
	String fileName="ApplProps.properties";
	//creating property file properties is a hash map,all in string form
public void createProperties(Properties p) throws IOException
{
	
	FileOutputStream fos=new FileOutputStream(filePath + fileName);
   p.store(fos, "This is a propertuy file holding configuration properties of an application");

}

//new method
public Properties loadProperties() throws IOException
{
	
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
	ApplProperties props=new ApplProperties();
	
	Properties p=new Properties();
	p.setProperty("url","jdbc:postgresql://localhost/postgres");
	p.setProperty("username", "postgres");//here changing

	p.setProperty("password","system");
	
	try {
		props.createProperties(p);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	//for method 2
	/*
	try {
		Properties p=props.loadProperties();
		props.printProperties(p);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
}


}
