package lab11layeredarchitecture;



public class Mobile {
int mobileid;
 String mobilename;
double price;
 int quantity;
public Mobile(int mobileid, String mobilename, double price, int quantity) {
	super();
	this.mobileid = mobileid;
	this.mobilename = mobilename;
	this.price = price;
	this.quantity = quantity;
}
public int getMobileid() {
	return mobileid;
}
public void setMobileid(int mobileid) {
	this.mobileid = mobileid;
}
public String getMobilename() {
	return mobilename;
}
public void setMobilename(String mobilename) {
	this.mobilename = mobilename;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Mobile [mobileid=" + mobileid + ", mobilename=" + mobilename + ", price=" + price + ", quantity=" + quantity
			+ "]";
}
public Mobile() {
	super();
	// TODO Auto-generated constructor stub
}

}
