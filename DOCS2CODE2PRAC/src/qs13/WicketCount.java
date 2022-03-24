package qs13;




import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

class Player{
	private String bowlerName;
	private int wicketCount;
	public String getBowlerName() {
		return bowlerName;
	}
	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}
	public int getWicketCount() {
		return wicketCount;
	}
	public void setWicketCount(int wicketCount) {
		this.wicketCount = wicketCount;
	}
	public Player(String bowlerName, int wicketCount) {
		super();
		this.bowlerName = bowlerName;
		this.wicketCount = wicketCount;
	}
	
	
}

public class WicketCount {
	
	private static HashMap<String,Player> hm=new HashMap<>();
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the player name");
			String na=sc.nextLine();
			System.out.println("Enter wickets - seperated by '|' symbol.");
			String wick=sc.nextLine();
			StringTokenizer wicks = new StringTokenizer(wick, "|");
			hm.put(na, new Player(na,wicks.countTokens()));
			System.out.println("\nDo you want to add another player (yes/no)");
			if(sc.nextLine().equals("no"))
				break;
		}
		while(true) {
			System.out.println("\nEnter the player name to search");
			String na=sc.nextLine();
			if(hm.containsKey(na)) {
				
				System.out.println(hm.get(na).getWicketCount());
			}
			else System.out.println("No player found with the name "+na);
			System.out.println("\nDo you want to search another player (yes/no)");
			if(sc.nextLine().equals("no"))
				break;
		}
	}

}
