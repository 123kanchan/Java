package day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
public class File05linenumberreader {

	public static void main(String[] args) {
		String s;
		try(FileReader fr = new FileReader("C:\\Users\\HP\\eclipse-workspace\\DAY6\\src\\day6\\myfile.txt");
		LineNumberReader lr = new LineNumberReader(fr);) {
		while((s = lr.readLine()) != null)
		System.out.println(lr.getLineNumber()+" " +s);
		}catch (IOException e) {
		System.out.println(e.getMessage());
		
	}

}}






