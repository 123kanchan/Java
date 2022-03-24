import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class qs7 {

	public static void main(String[] args) {
		int[]arr= {10,20,25,30,35,40,45,50,55,60};
		List<Integer>list =getMarksToList(arr);
	System.out.println(list);
		System.out.println(getMarksAsStream(list));
System.out.println(addGraceMarks(list));
System.out.println(getMaxMarks(list));
System.out.println(countPassedStudentS(list));
System.out.println(sortMarks(list));
	}

	private static List<Integer>sortMarks(List<Integer>list) {
		return list.stream().sorted((a,b)->a>b?-1:1).collect(Collectors.toList());
	}

	private static List<Integer> getMarksToList(int[] arr) {
		List<Integer>list=new ArrayList<>();
		for(int i:arr)
			list.add(i);
		return list;
	}
	
	public static Stream<Integer> getMarksAsStream(List<Integer>list) {
		Stream<Integer> s=list.stream();
		s.forEach(n->System.out.println(n));
		return s;
	}
	public static List<Integer> addGraceMarks(List<Integer>list){
		return list.stream().filter(a->a>=30&&a<35).map(a->a+5).collect(Collectors.toList());
	}
	public static int getMaxMarks( List<Integer> list)
	{
		return list.stream().max((a1,a2)->a1>a2?1:-1).get();
	}
	public static int countPassedStudentS(List<Integer> list)
	{
		return (int) list.stream().filter(a->a>40).count();
	}
	
}
