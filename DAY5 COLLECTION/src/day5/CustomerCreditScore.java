package day5;

import java.util.Comparator;

public class CustomerCreditScore implements Comparator<Customer>{
	public int compare(Customer b1, Customer b2) {
		
	 if(b1.getCreditscore() ==  b2.getCreditscore())
    	 return 0;
     else if(b1.getCreditscore() > b2.getCreditscore())
    	 return 1;
     else
    	 return -1;
}}
