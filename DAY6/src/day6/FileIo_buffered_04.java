package day6;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileIo_buffered_04 {
	private BufferedReader br;
	private BufferedWriter bw;
	public void openFiles(String filepath,String filename,String fileoutname) throws Customexception {
		try {
			br=new BufferedReader( new FileReader(filepath+filename));
			bw= new BufferedWriter(new FileWriter(filepath+fileoutname));
		} catch (FileNotFoundException e) {
			throw new Customexception("contact admin pls",e);
			
		
		} catch (IOException e) {
			throw new Customexception("contact admin pls",e);
		}
		
	}
	public void readFiles() throws Customexception {
		try {
			String record=br.readLine();
			while(record!=null) {
				System.out.println(record);
				bw.write(record+"\n");
				record=br.readLine();
			}
		}
			catch(IOException e) {
				throw new Customexception("contact admin pls",e);
			}
		
	}
	public void closeFiles() throws Customexception
	{
		try {
			if(br!=null)
				br.close();
			if(bw!=null)
			
				bw.close();
			
		}catch(IOException e) {
			throw new Customexception("contact admin pls",e);
		}
	}
public static void main(String[] args) {
	String filepath="C:\\Users\\HP\\eclipse-workspace\\DAY6\\src\\day6\\";
	String filename="myfile.txt";
	String fileoutname="mytextout.txt";
	FileIo_buffered_04 fileoperations=new FileIo_buffered_04();
	try {
		fileoperations.openFiles(filepath, filename, fileoutname);
		fileoperations.readFiles();
	} catch (Customexception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		
	
	try {
		fileoperations.closeFiles();
	} catch (Customexception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}




	}
	
	
	
	
