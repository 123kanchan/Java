package qs11;





import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Ranking  implements Comparable<Ranking>{
	
	private String name;
	private long score;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getScore() {
		return score;
	}
	
	public void setScore(long score) {
		this.score = score;
	}
	
	public Ranking(String name, long score) {
		super();
		this.name = name;
		this.score = score;
	}

	
	  @Override public int compareTo(Ranking o) { if(this.score<o.score) return -1;
	  else if(this.score>o.score) return 1; return 0; }
	 

	@Override
	public String toString() {
		return name +" "+ score;
	}
	
	
}

class SortByScore implements Comparator<Ranking>{

	@Override
	public int compare(Ranking o1, Ranking o2) {
		if(o1.getScore()>o2.getScore())
			return -1;
		else if(o1.getScore()<o2.getScore())
			return 1;
		return 0;
	}
	
}

public class KabbadiRanker {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		List<Ranking> li=new ArrayList<>();
		
		System.out.println("Please provide the number of raiders");
		int n=sc.nextInt();
		
		int i=0;
		
		while(i<n) {
			sc.nextLine();
			System.out.println("Enter the name of the raider "+(i+1));
			String na=sc.nextLine();
			System.out.println("Enter the raid points");
			long po=sc.nextLong();
			li.add(new Ranking(na,po));
			i+=1;
		}
		
		li.sort(new SortByScore());
		
		i=1;
		for(Ranking r:li) {
			System.out.println(i+" "+ r);
			i+=1;
		}
		
	}

}
