package practicelambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
public static void main(String[] args) {
	List<Person>lst=Arrays.asList(
			new Person(12,"klo","radidh"),
			new Person(13,"kloj","radidhj")
			);
	//sort list 
	Collections.sort(lst,new Comparator<Person>() {
		public int compare(Person p1,Person p2)
		{
			return p1.getLname().compareTo(p2.getLname());
		}
	});
	//through lambda
	Collections.sort(lst,(/*Person */p1,/*Person*/ p2)->p1.getLname().compareTo(p2.getLname()));
	//print
	printall(lst);
	printlastnamebegwith(lst);
}

private static void printlastnamebegwith(List<Person> lst) {
for(Person p:lst)
{
	if(p.getLname().startsWith("r"))
	{
		System.out.println(p);
	}
}
	
}

private static void printall(List<Person> lst) {
	for(Person p:lst)
		System.out.println(p);
	
}

}
