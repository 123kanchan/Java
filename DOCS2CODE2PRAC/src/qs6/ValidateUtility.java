package qs6;
import java.util.regex.*;
public class ValidateUtility{
	public static Validate validateEmployeeName = (nam)->{
		if(Pattern.matches("^[a-zA-Z]+$", nam))
			return true;
		return false;
	};
	public static Validate validateproductName=(nam)->{
		if(Pattern.matches("^[a-zA-Z]+[0-9]{5}$", nam))
			return true;
		return false;
	};
	public static void main(String[] args) {
		if(validateEmployeeName.validateName("kanchan"))
			System.out.println("name valid");
		
		if(validateproductName.validateName("ab12345"))
			System.out.println("name valid");
		else
			System.out.println("name invalid");
	}
}

 