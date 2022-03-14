package day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FILEIO_1 {
public static void main(String[] args) {
	String filepath="C:\\Users\\HP\\eclipse-workspace\\DAY6\\src\\day6\\";
	String filename="myfile.txt";
	FileInputStream fis=null;
	try {
		//file open
	fis=new FileInputStream(filepath+filename);
		if(fis!=null)
			System.out.println("file opened successfully");
		int ch=fis.read();
		while(ch>=0)//-1 eof
		{
			System.out.print((char)ch);
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
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
