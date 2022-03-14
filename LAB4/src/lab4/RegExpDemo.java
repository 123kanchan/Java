package lab4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Regular Expression  -- pattern search
//method-- validations for the data that you have accepted from the user
//pincode -  6 digits length , password --  1 upper case 1 lower case 
//java --3 classes  Pattern Matcher  PatternSyntaxException 1 interface MatchResultInterface
//regular expression  abc \\d \\s [0-9] ,match
//java.util.regex ;

public class RegExpDemo {
	
	public static void main(String[] args) {
		
		
		String str1 = "Are you looking for your 2343434 friend abc "
				+ "in the abc 12 class for abc 342 subject 34343 g fdgdfg  343434344";
		String str2 = ".*friends.*";
		
		//check whether str1 contains friend word or not in it
		
		System.out.println("pattern 'friend' found in 'str1'" + Pattern.matches(str2, str1));
		
		Pattern p1 = Pattern.compile("(a|b)bc");
		
		Pattern p2 =  Pattern.compile("\\.");
		
		Matcher m=p1.matcher(str1);
		

		str1 = m.replaceAll("cab");
		System.out.println(str1);
		
		
		
		int ctr=0;
		
		
		  while(m.find()) { ctr++; System.out.println("abc is found"+ctr);
		  System.out.println("Start "+m.start()); System.out.println("end" +m.end());
		  
		  }
		 
//	"(\\d)*"  {m,n}  "A|B(xyz)"   == Axyz  Bxyz   [abc][mn] -- a b c individual  [a-h] 
		  
		  //[789]{1}[0-9]{9}  6898989898
		  
		  //"^[A-Za-z][0-9]{1}.*{8}"      -- this pattern means  it should start with alphabet upper or small case followed by occurence of any char .
		  
	//		(xyz)  -- round bracket
			
		//something "^Has$"  ^  - beginning of the str with H and ending with s $
		  //.  -- any character  quantifiers . anychar 
		  // .*   .?    .+    * ? +  are called as quantifiers
		  // |  or
		  
		  //abc[^pqr]
		  //[0-9]  \\d  digit class  \\D  non digit \\s --spaces  \\S -- non spaces 
		  
		  /**
		   * 
		   * Pattern object  is created  --regex where our pattern we are looking 
		   * 
		   * Matcher 
		   * 
		   * 
		   * 
		   * */
		  if (pinCodeValidator("23232")) {
			  System.out.println("lets carry on with other validations like email ,etc");}
			  else
				 System.out.println("invalid pincode ");
		  }
		   
	

	
	public static boolean pinCodeValidator(String pincode) {
		   
		  //1st we have to crreate aPattern object ,
		// we have to use factory method to create  -- design patterns oops  Gang Offour , design patterns , singleton , factory mvc when you a b c d spring framework  new operator
	     Pattern pincodePattern =Pattern.compile("[0-9]{6}"); 
	     //if pincode has 6 digits it is valid
	     
	     //we want to match it against the input which we are validating 
	     //Matcher object matcher method matches the accepted input vs the pattern 
	     Matcher matcher =  pincodePattern.matcher(pincode);
	     
	     return matcher.matches(); 
	    
	     
	   
	   
  }

}
