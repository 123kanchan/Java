
public class qs3 {
public static void main(String[] args) {
	abc x=(a,b)->(a*b);
	System.out.println(x.fun(4, 3));
}
	interface abc{
		int fun(int a,int b);
	}

}
