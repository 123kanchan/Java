package lambda;

public class LambdaFunctional {

	public static void main(String[] args) {
PrintReport p1=(val)->System.out.println(val+"hi");

PrintReport p2=(val)->{
	System.out.println(val+"capge,bangalore");
	System.out.println("hji");
};
p1.produceReport("hii");
p2.produceReport("hi");


	}

}
