package com.aboutJavaObjectLifeCycle;

public class Product {

	/**
	 * Fields and Methods
	 */
	private int productId;
	private String productName;
	private double productPrice;
	
	public Product() {
		
	}

	public Product(int productId, String productName, double productPrice) {
	
		System.out.println("step-1: an object is created");
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		System.out.println("step-2: an object is an initialized");
	}

	public String getProduct() 
	{
		System.out.println("step-3: an object service method is called");
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}	
	
	protected void finalize()
	{
		System.out.println("step-4: an object is removed");
	}

	public static void main(String[] args) {
		
		Product product = new Product(101, "Mobile Phone", 89765.78);
		System.out.println(product.getProduct());

		product = null;
		
		System.gc();
		
	}

}
