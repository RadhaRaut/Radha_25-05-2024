package com.aboutJavaObjectCloning;


// step-1: class required to implements Cloneable interface
public class Product implements Cloneable
{

	
	private int productId;
	private String productName;
	private double productPrice;
	
	public Product()
	{
		
	}

	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		
		Product product1 = new Product(103, "mobile phone", 89075.78);
		System.out.println(product1.getProductId());
		System.out.println(product1.hashCode());
		
		////ste2: call clone() method of Object and type cast to required object
		
		Product product2 = (Product)product1.clone();
		product2.setProductPrice(98765.09);
		System.out.println(product2.productPrice);
		System.out.println(product2.productId);
		System.out.println(product2.hashCode());
	}
	
	
}
