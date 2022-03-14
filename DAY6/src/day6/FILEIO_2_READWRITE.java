//for taking data from one file and writing it to other file

package day6;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FILEIO_2_READWRITE {
	public static void main(String[] args) {
		String filepath="C:\\Users\\HP\\eclipse-workspace\\DAY6\\src\\day6\\";
		String filename="myfile.txt";
		String fileoutname="mytextout.txt";
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			//file open
		fis=new FileInputStream(filepath+filename);
		fos=new FileOutputStream(filepath+fileoutname);
			if(fis!=null)
				System.out.println("file opened successfully");
			int ch=fis.read();
			while(ch>=0)//-1 eof
			{
				fos.write((char)ch);
				System.out.print((char)ch);
				ch=fis.read();
			}
			System.out.println("file copied completely");
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
