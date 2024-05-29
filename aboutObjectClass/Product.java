package com.aboutObjectClass;

public class Product {
	
	/**
	 * Fields and Methods
	 */
	private int productId;
	private String productName;
	private double productPrice;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProduct() 
	{
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}	
	

	public static void main(String[] args) {
		
		Product product = new Product(101, "Mobile Phone", 89765.78);
		System.out.println(product.getProduct());


	}

}
