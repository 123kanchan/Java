package qs1;

import java.util.Scanner;

public class Main {
	
	public static Candidate getCandidateDetails()throws CustomException {
		Scanner sc=new Scanner(System.in);
	
			System.out.println("enter name");
			String name=sc.nextLine();
			System.out.println("enter gender");
			String gender=sc.nextLine();
			System.out.println("enter expected salary");
			double expectedSalary=sc.nextDouble();
			if(expectedSalary<=10000)
				throw new CustomException("salary inavlid less than 10000");
			Candidate obj1=new Candidate(name,gender,expectedSalary);	
			return obj1;
		
	}
public static void main(String[] args) {

	try {
		Candidate obj1=getCandidateDetails();
		if(obj1 instanceof Candidate)
	System.out.println(obj1);
		
	} catch (CustomException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
}
}
