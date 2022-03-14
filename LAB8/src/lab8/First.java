package lab8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class First {
	private BufferedReader br;
	private BufferedWriter bw;
	public void openFiles(String filepath,String filename,String fileoutname) throws ContactAdminException {
		try {
			br=new BufferedReader( new FileReader(filepath+filename));
			bw= new BufferedWriter(new FileWriter(filepath+fileoutname));
		} catch (FileNotFoundException e) {
			throw new ContactAdminException("contact admin pls",e);
			
		
		} catch (IOException e) {
			throw new ContactAdminException("contact admin pls",e);
		}
		
	}
	public void readFiles() throws ContactAdminException {
		try {
			String record=br.readLine();
			while(record!=null) {
				
				StringBuffer buffer = new StringBuffer(record);
				buffer=buffer.reverse();
				String rs=buffer.toString();
				bw.write(rs+"\n");
				System.out.println(rs);
				record=br.readLine();
			}
		}
			catch(IOException e) {
				throw new ContactAdminException("contact admin pls",e);
			}
		
	}
	public void closeFiles() throws ContactAdminException
	{
		try {
			if(br!=null)
				br.close();
			if(bw!=null)
			
				bw.close();
			
		}catch(IOException e) {
			throw new ContactAdminException("contact admin pls",e);
		}
	}
		
	public static void main(String[] args) {
		String filepath="C:\\Users\\HP\\eclipse-workspace\\LAB8\\src\\lab8\\";
		String filename="reverse.txt";
		String fileoutname="myTextOut.txt";
		First fileoperations=new First();
		try {
			fileoperations.openFiles(filepath, filename, fileoutname);
			fileoperations.readFiles();
		} catch (ContactAdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		
		try {
			fileoperations.closeFiles();
		} catch (ContactAdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}	
}
	







