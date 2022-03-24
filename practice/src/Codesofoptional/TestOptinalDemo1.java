package Codesofoptional;

import java.util.Optional;

public class TestOptinalDemo1 {

	public static void main(String[] args) {

Integer value1=null;
Integer value2=100;
		

//empty() return an empty optional object
	Optional<Integer>	optionalObj=Optional.empty();
	System.out.println(optionalObj);
	//ofNullbale() method will return an empty optioanl object if the parameterized value will null ,
	//in case of non-null value it will create an optional object with the same value
	Optional<Integer> num1=Optional.ofNullable(value1);
	System.out.println(num1);
	//of() method will cause for null pointer exception object if the parameterized value will null ,
		//in case of non-null value it will create an optional object with the same value
	Optional<Integer> num2=Optional.of(value2);
	System.out.println(num2);
	System.out.println(multiply(num1, num2));
	}

	public static int multiply(Optional<Integer> num1, Optional<Integer> num2)
	{
		System.out.println("First number is present" + " "+num1.isPresent());
		System.out.println("second number is present" + " "+num2.isPresent());
		//System.out.println("empty optional"+ " "+num1.isEmpty());
		int x=num1.orElse(20);
		int y=num2.get();
		return x*y;
		
	}
}
