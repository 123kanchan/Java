package codesofstreamapi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

public class TestStreamDemo1 {

	public static void main(String[] args) {
/*
 * LinkedList
 * [prev][object][next]<--->--->null
 * ArrayList15000000
 * [][][][][][][]
 * 
 * Stack
 * Vector
 * 
 */
		/*
		 * A stream is sequence of objects which provides some terminal and non-terminal operations
		 * 
		 * This is used to process a collections of object
		 * 
		 * 
		 * 
		 * 
		 */

		List<Integer> list=new ArrayList();
		//marks of the student
		list.add(10);
		list.add(1);
		list.add(200);
		list.add(6);
		list.add(8);
		/*for(int i=0; i<list.size(); i++)
		{
		int marks=list.get(i)+5;	
		System.out.println(marks);
		}*/
		//stream()
		//fileter(predicate)
		//map
	list.stream().filter(x->x<10).map(x->x+5).forEach(n->System.out.println(n));
	Stream xx=list.stream().filter(x->x<10).map(x->x+5);
	
		xx.forEach(x->System.out.println(x));

	}

}
