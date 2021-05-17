package shoppingcart ;

import java.io.Serializable;

public class Item extends ItemBook implements Serializable {
	
	private int serialNumber ;
	private String productName ;
	private double productPrice ;
	
	public Item(String productName, double productPrice) {
		
		serialNumber = autoIncrement ;
		this.productName = productName ;
		this.productPrice = productPrice ;
		super.addProduct(this) ;
		setAutoIncrement(getAutoIncrement() + 1) ;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public String getProductName() {
		return productName ;
	}

	public double getProductPrice() {
		return productPrice ;
	}
	
	public void displayInfo(){
		System.out.println("商品編號 : " + serialNumber) ;
		System.out.println("商品名稱 : " + productName) ;
		System.out.println("商品價格 : " + productPrice) ;
	}
}
