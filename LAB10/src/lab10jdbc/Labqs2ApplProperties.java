package lab10jdbc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;



public class Labqs2ApplProperties {

	//creating property file properties is a hash map,all in string form
public void createProperties(Properties p) throws IOException
{
	String filePath="C:\\Users\\HP\\eclipse-workspace\\LAB10\\src\\lab10jdbc\\";
	String fileName="qs2Props.properties";
	FileOutputStream fos=new FileOutputStream(filePath + fileName);
   p.store(fos, "This is a propertuy file holding configuration properties of an application");

}

//new method
public Properties loadProperties() throws IOException
{
	String filePath="C:\\Users\\HP\\eclipse-workspace\\LAB10\\src\\lab10jdbc\\";
	String fileName="qs2Props.properties";
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
	Labqs2ApplProperties props=new Labqs2ApplProperties ();
	
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

	
	try {
		Properties pq=props.loadProperties();
		props.printProperties(pq);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
}
}}
