package day7props;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
//creating loading showing property files
public class ApplProperties {

	//creating property file properties is a hash map,all in string form
public void createProperties(Properties p) throws IOException
{
	String filePath="C:\\Users\\HP\\eclipse-workspace\\DAY7\\src\\day7props\\";
	String fileName="ApplProps.properties";
	FileOutputStream fos=new FileOutputStream(filePath + fileName);
   p.store(fos, "This is a propertuy file holding configuration properties of an application");

}

//new method
public Properties loadProperties() throws IOException
{
	String filePath="C:\\Users\\HP\\eclipse-workspace\\DAY7\\src\\day7props\\";
	String fileName="ApplProps.properties";
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
	/*for method 1 it was
	Properties p=new Properties();
	p.setProperty("filePath","C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\DAY7\\\\src\\\\day7props\\\\" );
	p.setProperty("fileName", "MyText.txt");
	p.setProperty("userName","kanchan123");
	p.setProperty("password", "23");
	
	
	try {
		props.createProperties(p);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/
	//for method 2
	try {
		Properties p=props.loadProperties();
		props.printProperties(p);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
