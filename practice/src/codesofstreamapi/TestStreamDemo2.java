package codesofstreamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product
{
	
	private int productId;
	private String productName;
	private double productPrice;
	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	
	
	
	
}
class ProductBO
{
	Stream<Product> streamOfProduct;
	List<Product> listOfproduct=new ArrayList();

	
	void addProduct(Product product)
	{
		listOfproduct.add(product);
		streamOfProduct=listOfproduct.stream();
	}
	
	Stream<Product >getAllProduct()
	{
		return streamOfProduct;
	}
List<Product>	   searchProductBasedOnPrice()
{
	/*List<Product > list1=new ArrayList<Product>();
	for(Product p: listOfproduct)
	{
		if(p.getProductPrice()>5000.00)
		{
			list1.add(p);
		}
	}*/
	
	List<Product> listOfPrductbasedOnPrice=listOfproduct.stream().filter(p->p.getProductPrice()>5000.00).
			collect(Collectors.toList());
	return listOfPrductbasedOnPrice;
}



  double getTotalPrice()
  {
	  /*double sum=0.0;
	  for(int i=0; i<listOfproduct.size(); i++)
	  {
		 double price=listOfproduct.get(i).getProductPrice();
		 sum=sum+price;
	  }*/
	double totalAmt=listOfproduct.stream().map(p->p.getProductPrice()).reduce(0.0,(sum,price)->sum+price);
	return totalAmt;
  }
  
  
  Product getMaxPriceProduct()
  {
	Product product=  listOfproduct.stream().max((p1,p2)->p1.getProductPrice()>p2.getProductPrice()?1:-1).get();
	return product;
  }
  
  List<Product> getSortedProduct()
  {
	  Comparator<Product> prouctComparator=(p1,p2)->p1.getProductId()>p2.getProductId()?1:-1;
	  List<Product> listOfSortedProduct=listOfproduct.stream().sorted(prouctComparator).collect(Collectors.toList());
	  return listOfSortedProduct;
  }
}

public class TestStreamDemo2 {

	public static void main(String[] args) {

ProductBO pbo=new ProductBO();
Scanner scanner=new Scanner(System.in);
int noP=Integer.parseInt(scanner.nextLine());
for(int i=0; i<noP; i++)
{
	System.out.println("Enter product id");
	int id=Integer.parseInt(scanner.nextLine());
	System.out.println("Enter product name");
	String pName=scanner.nextLine();
	System.out.println("Enter product price");
	double price=Double.parseDouble(scanner.nextLine());
	Product pObj=new Product(id, pName, price);
	pbo.addProduct(pObj);
	
}
//accessing all product
Stream<Product> streamOfProduct=pbo.getAllProduct();
streamOfProduct.forEach(p->System.out.println(p.getProductId() + " "+p.getProductName() + " "+p.getProductPrice()));

System.out.println("*************");
//search Product based on price
 List<Product> listOfP=pbo.searchProductBasedOnPrice();
 Iterator<Product> itr=listOfP.iterator();
 while(itr.hasNext())
 {
	 System.out.println("k2");
Product p=	 itr.next();
System.out.println(p.getProductId() + " "+p.getProductName() + " "+p.getProductPrice());
 }

   System.out.println("****************");
  double price= pbo.getTotalPrice();
  System.out.println(price);
  System.out.println("****************");
   Product p= pbo.getMaxPriceProduct();
 
	}

}
