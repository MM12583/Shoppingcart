package shoppingcart;

import java.io.FileInputStream ;
import java.io.FileOutputStream ;
import java.io.IOException ;
import java.io.ObjectInputStream ;
import java.io.ObjectOutputStream ;
import java.util.LinkedList ;

public class TestItem {
	
	public static final String ITEM_File = "D:/Java/workplace/DataBase_MySQL/src/shoppingcart/ITEM.dat" ;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		Item teddyBear = new Item("teddyBear", 225) ;
		Item toyCar = new Item("toyCar", 150) ;
		Item flower = new Item("flower", 72.5) ;
		Item jacket = new Item("jacket", 150.5) ;
		Item pants = new Item("pants", 125) ;
		
//		System.out.println(ItemBook.productBook.get(3).getProductPrice()) ; // 細項
//		ItemBook.productBook.get(1).displayInfo() ;
//		ItemBook.productBook.get(2).displayInfo() ;
//		ItemBook.productBook.get(3).displayInfo() ;
//		ItemBook.productBook.get(4).displayInfo() ;
//		ItemBook.productBook.get(5).displayInfo() ;
		
		System.out.println("------------------") ;
		
		LinkedList<Item> items = new LinkedList<>() ;
		
		items.add(jacket) ; 
		items.add(teddyBear) ;
		items.add(toyCar) ;
		items.add(flower) ;
		items.add(pants) ;
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ITEM_File, true))){
			for(Item i : items){
				oos.writeObject(i);
			}
		}
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ITEM_File))) {
			while (true) {
				Item item = (Item) ois.readObject() ;
				System.out.println("商品編號 : " + item.getSerialNumber()) ;
				System.out.println("商品名稱 : " + item.getProductName()) ;
				System.out.println("商品價格 : " + item.getProductPrice()) ;
			}
		} catch (IOException e) {
			System.out.println("讀取完畢") ;
		}

	}
}
