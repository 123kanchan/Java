package lab13multithreading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread extends Thread {

	
public void run()
{
	String filepath="C:\\Users\\HP\\eclipse-workspace\\LAB13\\src\\lab13multithreading\\";
	String filename="source.txt";
	FileInputStream fis=null;
	FileOutputStream fos=null;
	String fileoutname="target.txt";
	try {
		//file open
	fis=new FileInputStream(filepath+filename);
	fos=new FileOutputStream(filepath+fileoutname);
		if(fis!=null)
			System.out.println("file opened successfully");
		int ch=fis.read();
		int cnt=0;
		while(ch>=0)//-1 eof
		{
			if(ch!=',') {
			fos.write((char)ch);
			cnt++;
			if(cnt==10)
			{
				System.out.println("10 character are copied\n");
				
				cnt=0;
				try {
					Thread.currentThread().sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//System.out.print((char)ch);
			
			}
			ch=fis.read();
		}
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	} catch (IOException e) {//if read gave error
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		try {
			if(fis!=null)
			fis.close();
			if(fos!=null)
				fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
