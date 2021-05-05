package oopFirstTrial;



public class ProductManager {

	
	public void addToCart(Product product)
	{
		System.out.println("Product Name : " + product.productName);
		System.out.println("Unit Price : " + product.unitPrice);
		System.out.println("Store Name : " + product.storeName );
		System.out.println ("This product added the cart");
	}

}

