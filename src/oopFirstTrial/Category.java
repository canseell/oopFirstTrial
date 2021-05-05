package oopFirstTrial;

public class Category {
	
    String categoryName;
    int idCategory;
    int categoryProductsNumber;
	
	  public Category() {
	    	 
	    	 System.out.println("Category sections worked.");
	    
      	 
	  }
	     
    public Category(String categoryName, int idCategory, int categoryProductsNumber) {
      	 
           this();
      	 this.categoryName = categoryName;
      	 this.idCategory = idCategory;
      	 this.categoryProductsNumber = categoryProductsNumber;
      	 
      	 System.out.println("Kategori : " + categoryName);
      	 
     }
}