package day2;
//book author code demonstration
import java.time.LocalDate;
public class book {
private int id;
private String title;
private LocalDate dateOfPublishing;
private double price;
public  Author au;
private static int ctr;
public static int getCtr() {
	return ctr;
}
public static void setCtr(int ctr) {
	book.ctr = ctr;
}
public int getId() {
	return id;
}
public book(int id, String title, LocalDate dateOfPublishing, double price) {
	super();
	this.id = id;
	this.title = title;
	this.dateOfPublishing = dateOfPublishing;
	this.price = price;
	ctr++;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public LocalDate getDateOfPublishing() {
	return dateOfPublishing;
}
public void setDateOfPublishing(LocalDate dateOfPublishing) {
	this.dateOfPublishing = dateOfPublishing;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Author getAu() {
	return au;
}
public book() {
	ctr++;
	System.out.println("Book created");
}
@Override
public String toString() {
	return "book [id=" + id + ", title=" + title + ", dateOfPublishing=" + dateOfPublishing + ", price=" + price
			+ ", au=" + au + "]";
}
public void setAu(Author au) {
	this.au = au;
}

}
