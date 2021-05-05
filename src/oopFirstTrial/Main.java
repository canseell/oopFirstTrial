package oopFirstTrial;



public class Main {

	public static void main(String[] args)
	   {
         
		Category category1 = new Category();
		category1.categoryName = "Tekstil Ürünleri ";
		category1.idCategory = 101 ;
		category1.categoryProductsNumber = 3500 ;
		
		System.out.println("Category1 Name : " + category1.categoryName + " Category ID : " + category1.idCategory);
		
		Category category2 = new Category("Elektronik Esya" , 102 , 2000);
		System.out.println("Category2 Name : " + category2.categoryName);
		
		Product product1 = new Product(10 , "Telefon" , 2019 , 3500 , "Teknosa" , 2020);
	    System.out.println("Category Name: " + category2.categoryName + "Product Name: " + product1.productName + "Product Unit Price: " + product1.unitPrice);
		
		Product product2 = new Product(22, "Yatak Ortusu" , 2018 , 1000 , "Karaca" , 201);
	    System.out.println("Category Name: " + category1.categoryName + "Product Name: " + product2.productName + "Product Unit Price: " + product2.unitPrice);
		
	    
	   ProductManager productManager = new ProductManager();
	   
	   productManager.addToCart(product1);
	   
	   productManager.addToCart(product2);
      
	   }
}

