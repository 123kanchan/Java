package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> lst=Arrays.asList(12,13,45,67,26,89);
//1st approach	
//lst.sort(new CompareIntegers());
//2nd  approach inner class
/*Comparator c=new Comparator<Integer>(){

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
};*/
//3rd approach using lambda expression
Comparator<Integer>c=(a,b)->a.compareTo(b);
lst.sort(c);
	for(Integer val:lst)
	{
		System.out.println(val);
	}
	}

}
class CompareIntegers implements Comparator<Integer>{
	public int compare(Integer a1,Integer a2)
	{
		return a1.compareTo(a2);
	}
}