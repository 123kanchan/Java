package lab8;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Second {
public static void main(String[] args) {
	String filepath="C:\\Users\\HP\\eclipse-workspace\\LAB8\\src\\lab8\\";
	String filename="input2numbers.txt";
	String fileoutname="outputnumbers.txt";
	FileInputStream fis=null;
	FileOutputStream fos=null;
	
	try {
		fis=new FileInputStream(filepath+filename);
		fos=new FileOutputStream(filepath+fileoutname);
		if(fis != null) {
			System.out.println("file opened succesfully");
		}
		if(fos != null) {
			System.out.println("output file opened succesfully");
		}
		int ch=fis.read();
		while(ch>=0) {
			char c=(char)ch;
			if(c!=',') {
				if((int)ch%2==0) {
					System.out.println((char)ch);
					fos.write((char)ch);
					
				}
			}
			
			ch=fis.read();
		}
		System.out.println("file copied successfully");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch(IOException ie) {
		ie.printStackTrace();
		
	}
	finally {
		try {
			if(fis !=null)
				fis.close();
			if(fos !=null)
				fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

}






