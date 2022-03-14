package day5;

import java.util.Comparator;

public class CustomerAmountComparator implements Comparator<Customer> {
	public int compare(Customer b1, Customer b2) {
		
		 if(b1.getAmountpaid() ==  b2.getAmountpaid())
	    	 return 0;
	     else if(b1.getAmountpaid()
	    		 > b2.getAmountpaid())
	    	 return 1;
	     else
	    	 return -1;
	}}


