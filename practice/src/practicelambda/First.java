package practicelambda;
//greetingfunction=()->sysout("hi");
//doublenumberfunction=(int a)->a*2;
//addfun=(int a,int b)->a+b;
//safedivision=(int a,int b)->{
//if(b==0)return 0;
//return a/b;
//}
/*stringlengthcount=(String a)->a.length();
 * */
//now how to executee these above expression
/**return type of these var?
 * mylambdafun=()->sysout("sk");
 * create interface for var
 * interface mylambda{
 * void foo();
 * }
 * soo,mylambda mylambdafun=()->sysout("sk");
 /*calling this lambda fun
  * mylambdafun.foo();
  * anonymous inner class
  * interfaceclass obj=new inerfaceclass(){
  * 
  * public void perform(){
  * sysout(hi)
  * }
  * 
  * };
  * obj.perform();//hi
  */

 
 
public class First {
public static void main(String[] args) {
	/*xyz lambdafun=a->a.length();
	System.out.println(lambdafun.foo("kanchan"));*/
	printlambda(a->a.length());
	
}
public static void printlambda(xyz lambdafun)
{
	
	System.out.println(lambdafun.foo("kanchan"));
}

}
interface xyz{
	
	int foo(String a);
}
