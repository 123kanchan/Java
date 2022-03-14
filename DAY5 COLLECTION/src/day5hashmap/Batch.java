package day5hashmap;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Batch {
	Map<Long,Student> mapOfstudent =  new HashMap<>();
	
	long id;
	String name;
	int totalscore;
	public void addStudent(Student s)throws Nameexception,Scoreexception
	{
	boolean res1=Namevalidator(s.getName());
	
	boolean res2=Scorevalidator(s.getTotalscore());
	if(res1&&res2) {
		System.out.println("adding students to batch");
		mapOfstudent.put(s.getId(), s) ;
	}
		
		
	}
	public static boolean Namevalidator(String name)throws Nameexception
	{
		Pattern p=Pattern.compile("^[a-z A-Z]*");
		Matcher m=p.matcher(name);
		
		if(m.matches())
		return true;
		else
			throw new Nameexception("name is not in alphabetical order");
		
	}
	public static boolean Scorevalidator(int score)throws Scoreexception
	{
		boolean res=true;
		if(score<100)return res;
		else 
			throw new Scoreexception("score greater than 100");
	}
   
	public void displaykeys() {
		System.out.println("keys of student");
		Set<Long> keys = mapOfstudent.keySet();
		
		System.out.println(keys);

	}
	public void displayvalues()
	{
		System.out.println("displaying student values");
for(Student ee:mapOfstudent.values()) {
			
			System.out.println(ee);
			
		}
	}
	public void displayentry()
	{
		System.out.println("displaying entries");
		Set<Entry<Long,Student>> set = mapOfstudent.entrySet();
		  for(Entry<Long,Student> entry:set) {
			  
			      System.out.println(entry.getKey());
			      System.out.println(entry.getValue());
			     
		  }
		
	}
	
}
