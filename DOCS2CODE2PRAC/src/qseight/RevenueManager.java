package qseight;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;




class Revenue implements Comparable<Revenue>{
	private String revenueCategory;
	private int amount;
	
	public String getRevenueCategory() {
		return revenueCategory;
	}
	public void setRevenueCategory(String revenueCategory) {
		this.revenueCategory = revenueCategory;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Revenue(String revenueCategory, int amount) {
		super();
		this.revenueCategory = revenueCategory;
		this.amount = amount;
	}
	
	
	  @Override public int compareTo(Revenue o) { if (this.amount == o.amount)//giving in  a scending 
	  return 0; else if(this.amount > o.amount) return 1; else return -1; }
	 
	
	
}

public class RevenueManager {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		TreeSet<Revenue> ts=new TreeSet<>();
		
		Revenue rev=null;
		
		Iterator i;
		
		while(true) {
			System.out.println("Enter revenue category");
			String cat=sc.nextLine();
			System.out.println("Enter revenue amount");
			int amt=sc.nextInt();
			rev=new Revenue(cat,amt);
			ts.add(rev);
			i=ts.descendingIterator(); 
			System.out.println("Do you want to continue(yes/no):");
			if(sc.next().equals("no"))
				break;
			sc.nextLine();
		}
		System.out.println("\nTop spending categories");
		System.out.println(String.format("%-15s%-15s","Category", "Amount"));
		int sum=0;
		while(i.hasNext())  {  
		Object r=i.next();
			System.out.println(String.format("%-15s%-15s",((Revenue) r).getRevenueCategory(), ((Revenue) r).getAmount())); 
			sum+=((Revenue) r).getAmount();
		}
		System.out.println("Total amount earned: "+sum);
	}

}
