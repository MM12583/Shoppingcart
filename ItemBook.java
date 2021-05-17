package shoppingcart;

import java.util.HashMap;

public class ItemBook  {
	
	static int autoIncrement = 1 ;
	static HashMap<Integer, Item> productBook = new HashMap<>();

	public ItemBook() {}
	
	public static void setAutoIncrement(int i ) {
		autoIncrement = i ;
	}
	
	public static int getAutoIncrement() {
		return autoIncrement;
	}

	public static HashMap<Integer, Item> getProductList() {
		return productBook;
	}
	
	public void addProduct(Item p){
		productBook.put(autoIncrement, p) ;
	}
	
}
