package lab13multithreading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {

public static void main(String[] args) {
	CopyDataThread obj=new CopyDataThread();
	obj.start();
}
}
