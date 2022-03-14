package lab3;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Fourth {
public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	String date1,date2;
	date1=sc.next();
	date2=sc.next();
	DateTimeFormatter formater =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate datefirst =  LocalDate.parse(date1,formater);
	LocalDate datesecond =  LocalDate.parse(date2,formater);
	Period p = Period.between(datefirst, datesecond);
	 System.out.println("Years (Difference) = "+p.getYears());
    System.out.println("Month (Difference) = "+p.getMonths());
    System.out.println("Days (Difference) = "+p.getDays());
}
}
