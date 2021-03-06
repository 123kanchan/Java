package day5;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class CustomerApp {
public static void main(String[] args) {
	 Set <Customer> s  = new HashSet<>();
	 Set<Customer> p =  new TreeSet<>();
	
	Customer obj1=new Customer(1,"kanchan",12400,200);
	Customer obj2=new Customer(2,"mary",100,300);
	Customer obj3=new Customer(3,"aamal",144400,100);
	 s.add(obj1);
	 s.add(obj2);
	 s.add(obj3);
	 System.out.println("displaying list of customer using hashset");
	 
	  for(Customer b:s) {
		  
		  System.out.println(b);
	  }
	  System.out.println("\n");
	  System.out.println("displaying list of customer using treeset");
	  
	  TreeSet<Customer> ts = new TreeSet<>();
		ts.add(obj1);
		ts.add(obj2);
		ts.add(obj3);
		
		 for(Customer b:ts) {
			  
			  System.out.println(b);
		  }
		  System.out.println("\n");
		 
		  System.out.println("displaying list of customer using name comparision");
		  TreeSet<Customer> t = new TreeSet<>(new CustomerNameComparator());
		  t.add(obj1);
		  t.add(obj2);
		  t.add(obj3);
for(Customer b:t) {
			  
			  System.out.println(b);
		  }
System.out.println("\n");
System.out.println("displaying list of customer using amount comparision");
TreeSet<Customer> tll = new TreeSet<>(new CustomerAmountComparator());
tll.add(obj1);
tll.add(obj2);
tll.add(obj3);
for(Customer b:tll) {
	  
	  System.out.println(b);
}
System.out.println("\n");
System.out.println("displaying list of customer using credit score comparision");
TreeSet<Customer> tllq = new TreeSet<>(new CustomerCreditScore());
tllq.add(obj1);
tllq.add(obj2);
tllq.add(obj3);
for(Customer b:tllq) {
	  
	  System.out.println(b);
}
}
}
