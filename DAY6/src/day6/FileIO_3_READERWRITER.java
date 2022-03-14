package day6;
//filereader and file writer are character oriented cllases,read and write data from text files
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO_3_READERWRITER {
private FileReader fr;
private FileWriter fo;
public void fileOpenfiles(String filePath,String fileInName,String fileOutName) throws Customexception
{
	try {
		//file open
	fr=new FileReader(filePath+fileInName);
	fo=new FileWriter(filePath+fileOutName);
	}
	catch(FileNotFoundException e)
	{
		throw new Customexception("contact admin",e);
	}
	catch(IOException e)
	{
		throw new Customexception("contact admin",e);
	}
}
public void copyFiles() throws Customexception{
try {
	int ch=fr.read();
	while(ch>=0)//-1 eof
	{
		

		System.out.print((char)ch);
		fo.write((char)ch);
		ch=fr.read();
	}
}catch(IOException e)
{
	throw new Customexception("contact admin",e);
}
}
public void closeFiles()  throws Customexception{
	try {
		if(fr!=null)
		fr.close();
		if(fo!=null)
			fo.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		throw new Customexception("contact admin",e);
	}
}
public static void main(String[] args) {
	String filepath="C:\\Users\\HP\\eclipse-workspace\\DAY6\\src\\day6\\";
	String filename="myfile.txt";
	String fileoutname="mytextout.txt";
	FileIO_3_READERWRITER fileOperations=new FileIO_3_READERWRITER();
	
	try {
		fileOperations.fileOpenfiles(filepath,filename,fileoutname);
		fileOperations.copyFiles();
	}catch (Customexception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		try {
			
			fileOperations.closeFiles();
		} catch (Customexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
