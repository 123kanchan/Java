package docs3codetopractice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.postgresql.ds.PGSimpleDataSource;
public class ProductRepository implements  ProductService  {

public static void main(String[] args){

	
	LocalDate date=LocalDate.of(2022, 03, 10);
	List<Product>lp=new ArrayList();
	Optional<Product> optionalObj;//
	lp.add(null);
	Product p=new Product("ABCD#23","ffxyz","ef",1000.00,date);
	p=new Product("BCDE#56","reaalme","cdf",100000.00,date);
	try {
		ProductRepository obj=new ProductRepository();
		obj.addProduct(p);
	lp.addAll(obj.getAllProduct());
	for(Product a:lp) {	
		optionalObj=Optional.ofNullable(a);
		if((optionalObj.isPresent()))
		//a=optionalObj.orElse(new Product("0", null, null,0,date));
	//Product ppp=optionalObj.orElse(new Product(null, null, null,100,null));
		System.out.println(a);
		else
			System.out.println("it is  null");}
	} catch (InvalidProductIdException e) {
		// TODO Auto-generated catch block
System.out.println(e.getMessage());
	}
	
}
			
	
	

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		 Implementation obj1=new  Implementation();
		 List<Product> p=obj1.getAllProduct();
		
		return p;
	}
	@Override
	public  boolean addProduct(Product product) throws InvalidProductIdException {
		ProductValidator obj=new ProductValidator();
		if(obj.validateProduct(product.getProductId()))
			{
			//adding to db
			 Implementation obj1=new  Implementation();
			 if(obj1.addproduct(product)) {
				 System.out.println("added");
			 }
			}
		else throw new InvalidProductIdException("invalid product id");
		
		return false;
	}


}



//another class
class ProductValidator{
	boolean validateProduct(String productId)throws InvalidProductIdException{
		
		Pattern p=Pattern.compile("^[a-zA-Z]+{4}[#]+[0-9]{2}");
		Matcher m=p.matcher(productId);
if(!m.matches())throw new InvalidProductIdException("invalid product id");
else return true;


		
	}
}


//another class
class Implementation{
	PGSimpleDataSource ds;
	public  Implementation() 
	
	{
		ds=new PGSimpleDataSource();
		ds.setDatabaseName("postgres");
		ds.setUser("postgres");
		ds.setPassword("system");
	}
	public boolean addproduct(Product p)
	{
		Connection connect=null;
		PreparedStatement pstat=null;
		String query="insert into product(pid,pname,pcategory,pprice) values(?,?,?,?)";
		
		try {
			connect=ds.getConnection();
			connect.setAutoCommit(false);
			
			pstat=connect.prepareStatement(query);
			pstat.setString(1, p.getProductId());
			pstat.setString(2,p.getProductName());
			pstat.setString(3,p.getProductCategory());
			pstat.setDouble(4,p.getProductPrice());
			
			
			pstat.execute();
			connect.commit();
			return true;
		}
		catch(SQLException sqe) {sqe.printStackTrace();}
		finally {
			try {
				if(pstat!=null)
					pstat.close();
				if(connect!=null)
					connect.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}
	
	public List<Product> getAllProduct(){
		List<Product> list=new ArrayList<>();
		
		try(Connection connect=ds.getConnection();
				Statement stmt=connect.createStatement();  //static queries
			ResultSet rs = stmt.executeQuery("select * from product");
				){
			while(rs.next()) {
			
				String na=rs.getString("pid");
				String mail=rs.getString("pname");
				String categ=rs.getString("pcategory");
				Double price=rs.getDouble("pprice");
				
				Product cu=new Product(na,mail,categ,price,null);
				list.add(cu);
			}
		} catch(SQLException e) {
		}
		return list;
	}
}
interface ProductService{
	public  boolean addProduct(Product product) throws InvalidProductIdException;
	public List<Product> getAllProduct();
}