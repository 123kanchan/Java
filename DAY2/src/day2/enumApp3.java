package day2;
//for enum demonstration//
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class enumApp3 {
public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	long idd =  sc.nextLong();
	String name =  sc.next();
	String ltype =  sc.next();
	Loantype lt1 =  Loantype.valueOf(ltype);
	String dateOfappl =  sc.next();
	DateTimeFormatter formater =  DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	LocalDate d1 =  LocalDate.parse(dateOfappl,formater);

	loanapplication application2 =
			new loanapplication(idd, name, d1,lt1);
	System.out.println(application2);
	}
}
