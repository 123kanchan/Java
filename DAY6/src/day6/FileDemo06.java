package day6;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
//NIO NEW IO WITH CHANNEL BASED I/O
public class FileDemo06 {

	public static void main(String[]args) {
		String fname = "C:\\Users\\HP\\eclipse-workspace\\DAY6\\src\\day6\\myfile.txt";
		   File f = new File(fname);
		   System.out.println("File name :    "+f.getName());
		   System.out.println("Parent directory name :    "+f.getParent());
		   System.out.println("Absolute path name :    "+f.getAbsolutePath());
		   System.out.println("File modified last on :    "+String.valueOf(f.lastModified()));
		   System.out.println("File length :    "+f.length());
		   System.out.println("File Readable?  :    " + (f.canRead()? "true":"false"));
		   ///next demo
		   try {
				Path file = Paths.get(fname);
					List<String> lines = Files.readAllLines(file);
					for(String line:lines) {
						System.out.println(line);
					}
					System.out.println("End of File....");
					
					
					//next demo
					String dirname = "C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\DAY6\\\\src\\\\day6";
					Path javaHome= Paths.get(dirname);
					DirectoryStream<Path> contents = Files.newDirectoryStream(javaHome);
					for(Path content: contents) {
						System.out.println(content.getFileName());
					}
					contents.close();
					
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
