

import java.util.Scanner;

public class WrapperDemo {
  public static void main(String[] args) {
	Integer i=100;
	int j = 100;
	
	//boxing --wraps the primitive value ,100 --
	//unboxing  --object to primitive
	
	//jdk 1.5 auto 
	System.out.println(i.intValue());
	System.out.println(i);
	
	//wrappers in collections 
	
	Integer newInt =  Integer.parseInt("1234");
	System.out.println(newInt);
	
	Character char1 = 'A'; //auto boxing
	char val = char1;  //unboxing
	
	System.out.println(char1);
	System.out.println(val);
	
	Float var2 =  new Float("20.54f");
	Float f2 = new Float(20.54f);
	
	System.out.println(Float.compare(var2, f2));
	System.out.println(Float.MAX_VALUE);
	System.out.println(Float.MIN_VALUE);
	System.out.println(Byte.MIN_VALUE);
	System.out.println(Byte.MAX_VALUE);
	
	
	//Number class
	//typeValue() compareTo() equals() parseInt abs ceil floor round min max sqrt log cos tan random
	
	//smaller bucket ,trying to fit in large value 
	//
	
	long start =  System.currentTimeMillis();
	int a =(int)f2.floatValue();

	int b =  (int) (20/5.9);
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the name");
    String name =  scanner.next();
    
    System.out.println("hello "+name);

    long ms = System.currentTimeMillis();
    
    int timeTaken=  (int) (ms - start);
    
    System.out.println("it took "+timeTaken+"ms");
	
	  String s = "Java Programming";
	  System.out.println(s.length());
	  for(int k=0;k<s.length();k++) {
		  System.out.print(s.charAt(k)+"\t");
	  }
	  
	  
	  StringBuilder sb =  new StringBuilder("abc");
	  System.out.println(sb.hashCode());
	  sb.append("how are you learning java - handson or theory");
	  sb.insert(4, "you all");
	  sb.replace(0,3,"tech");
	  sb.delete(10, 14);
	  System.out.println(sb);
	  System.out.println(sb.hashCode());
	  
	  StringBuilder sb2 =  new StringBuilder("java hello world program");
	  sb2.delete(10,13);
	  System.out.println(sb2);
	  
	  
}
  
}
