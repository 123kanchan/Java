package qs10;




import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Unionofsets {
	
	public static void Union(Set<String> se1,Set<String> se2){
		Set<String> se3=new HashSet<>(se1);
		se3.addAll(se2);
		System.out.println("\nUnion");
		for(String s:se3)
			System.out.println(s);
	}

	public static void Intersection(Set<String> se1,Set<String> se2){
		Set<String> se3=new HashSet<>(se1);
		se3.retainAll(se2);
		System.out.println("\nIntersection");
		for(String s:se3)
			System.out.println(s);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Set<String> set1=new HashSet<>();
		Set<String> set2=new HashSet<>();

		System.out.println("Enter the number of top run scorers in season 4");
		int s4=sc.nextInt();
		System.out.println("Enter the names of players");
		int i=0;
		sc.nextLine();
		
		while(i<s4) {
			set1.add(sc.nextLine());
			i+=1;
		}
		
		System.out.println("Enter the number of top run scorers in season 5");
		int s5=sc.nextInt();
		System.out.println("Enter the names of players");
		i=0;
		sc.nextLine();
		
		while(i<s5) {
			set2.add(sc.nextLine());
			i+=1;
		}
		
		System.out.println("\nPlayer Set 1");
		for(String s:set1)
			System.out.println(s);
		System.out.println("\nPlayer Set 2");
		for(String s:set2)
			System.out.println(s);
		
		Union(set1,set2);
		Intersection(set1,set2);
		
		sc.close();
	}

}
