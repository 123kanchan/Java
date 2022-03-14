package lab3;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class third {
public static void main(String[] args) {
	String date;
	Scanner sc =  new Scanner(System.in);
	date=sc.next();
	DateTimeFormatter formater =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate date1 =  LocalDate.parse(date,formater);
	LocalDate date2=LocalDate.now();
	Period p = Period.between(date1, date2);
	 System.out.println("Years (Difference) = "+p.getYears());
     System.out.println("Month (Difference) = "+p.getMonths());
     System.out.println("Days (Difference) = "+p.getDays());
}
}
