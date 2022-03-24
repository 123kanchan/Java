package docs3codetopractice;

import java.time.LocalDate;

public class Product {
	private String productId;
	private String productName;
	private String productCategory;
	private double productPrice;
	private LocalDate productMfd;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCategory="
				+ productCategory + ", productPrice=" + productPrice + ", productMfd=" + productMfd + "]";
	}
	public Product(String productId, String productName, String productCategory, double productPrice,
			LocalDate productMfd) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.productMfd = productMfd;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public LocalDate getProductMfd() {
		return productMfd;
	}
	public void setProductMfd(LocalDate productMfd) {
		this.productMfd = productMfd;
	}

}
