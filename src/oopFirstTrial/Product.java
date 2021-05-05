package oopFirstTrial;

public class Product {
    
	int idProduct;
	String productName;
	int productYear;
	int unitPrice;
	String storeName;
	int publishDate;
	
	
	public Product() {
		
		System.out.println("Products showed");
	}
	
	public Product(int idProduct, String productName, int productYear, int unitPrice, String storeName, int publishDate )
	{
		
		this();
		this.idProduct = idProduct;
		this.productName = productName;
		this.productYear = productYear;
		this.unitPrice = unitPrice;
		this.storeName = storeName ;
		this.publishDate = publishDate;
		
		
	}
}

