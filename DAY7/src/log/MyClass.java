package log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MyClass {
	//to make loggerr ready logger is aclass with get
	static Logger myLogger=Logger.getLogger(MyClass.class.getName());
	
	Object x=null;

	public void do_something( int a, float b)
	{
		myLogger.info("do_something are: " + a +" "+ b); 
		myLogger.debug("Operation performed successfully");
		if (x == null)
		{
		myLogger.error("Value of X is null");

		}
	}
	//
	public static void main(String[] args) {

		  PropertyConfigurator.configure("resources/log4j.properties");
MyClass myClass=new MyClass();
myClass.do_something(10,15);
	}

}
