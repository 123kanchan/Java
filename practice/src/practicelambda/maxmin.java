package practicelambda;
interface max{
	int foo(int a,int b);
}
public class maxmin {
	public static void main(String[] args) {
		//max variable=(a,b)->(a>b)?a:b;
		/*max variable=(a,b)->{
			if(a>b)return a;
			return b;};*/
		max variable=(a,b)->{return(a+b);};
		
	int a=60;
	int b=40;
	System.out.println(variable.foo(a,b));



}}
