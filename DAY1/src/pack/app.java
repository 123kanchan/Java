//qs2.1
package pack;
import java.util.*;
public class app {
public static void main(String[]args)
{


	Person obj=new Person();
	Person obj2=new Person("Kanchan","Rawat",21,'F',55.0f);
	obj.setName("Divya","Bharti");
	obj.setAge(20);
	obj.setGender('F');
	obj.setWeight(80.50f);
	System.out.println(obj);
	System.out.println(obj2);
}
}
