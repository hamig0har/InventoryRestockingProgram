package storeprogram;
import java.io.IOException;
import java.util.ArrayList;
/**
 * this class holds all the items in the tool shop, manages them and is responsible for any decrement or increment in items
 * @author hamza
 *
 */
public class Inventory {
private Order order;
private ArrayList<Item>itemList = new ArrayList<Item>();
/**
 * lists all items in shop
 */
void listalltools() {
	for(int i=0;i<itemList.size();i++) {
		System.out.println(itemList.get(i).getItemName());
	}
}
/**
 * increases the quantity of an item
 * @param id the id of the item
 */
void increaseItem(int id) {
	for(int i=0;i<itemList.size();i++) {
		if(itemList.get(i).getItemId()==id) {
			itemList.get(i).incrementQuantity();
		}
	}
}
/**
 * decreases the quantity of the item by one
 * @param id the item id
 * @throws IOException
 */
void decreaseItem(int id) throws IOException {
	for(int i=0;i<itemList.size();i++) {
		if(itemList.get(i).getItemId()==id) {
			itemList.get(i).decrementQuantity();
		}
	}
}
/**
 * shows information about a particular tool 
 * @param id the item id
 */
void toolInfo(int id) {
	for(int i=0;i<itemList.size();i++) {
		if(itemList.get(i).getItemId()==id) {
	System.out.print("Item id:     "+itemList.get(i).getItemId()+"\n");
	System.out.print("Name:        "+itemList.get(i).getItemName()+"\n");
	System.out.print("Quantiy:     "+itemList.get(i).getItemQuantity()+"\n");
	System.out.print("Price:       "+itemList.get(i).getItemPrice()+"\n");
	System.out.print("Supplier id: "+itemList.get(i).getItemSupplierId()+"\n");
		}
	}
}
/**
 * shows information about a particular item
 * @param name name of the item
 */
void toolInfo(String name) {
	for(int i=0;i<itemList.size();i++) {
		int x=itemList.get(i).getItemName().compareToIgnoreCase(name);
		if(x==0) {
	System.out.print("Item id:     "+itemList.get(i).getItemId()+"\n");
	System.out.print("Name:        "+itemList.get(i).getItemName()+"\n");
	System.out.print("Quantiy:     "+itemList.get(i).getItemQuantity()+"\n");
	System.out.print("Price:       "+itemList.get(i).getItemPrice()+"\n");
	System.out.print("Supplier id: "+itemList.get(i).getItemSupplierId()+"\n");
		}
	}
}
/**
 * This is to add a brand new item to the inventory
 * @param id id of new item
 * @param name name of new item
 * @param quantity quantity of new item
 * @param price price of new item 
 * @param supplierId the supplierId of the item
 */
void newItem(int id,String name,int quantity,float price,int supplierId) {
	Item newItem=new Item(id, name, quantity, price, supplierId);
	itemList.add(newItem);
}
/**
 * deletes/removes a particular item from the inventory
 * @param id if of the item to be removed
 */
void deleteItem(int id) {
	for(int i=0;i<itemList.size();i++) {
		if(itemList.get(i).getItemId()==id) {
			itemList.remove(i);
		}
	}
}
/**
 * gets the list of the items
 * @return list of the items
 */
ArrayList<Item> getItemList() {
	return itemList;
}
/**
 * checks the quantity of every item in the inventory to see if there isn't anyone which is less in stock
 * @throws IOException
 */
public void checkQuantity() throws IOException {
	for(int i=0;i<itemList.size();i++) {
		if(itemList.get(i).getItemQuantity()<40) {
			int x= 50-itemList.get(i).getItemQuantity();
			order.generateOrder(itemList.get(i).getItemName(),x,itemList.get(i).getSupplier().getSupplierName());
		}
	}
}
/**
 * checks the quantity of a particular item 
 * @param name name of the item 
 */
public void checkItemQuantity(String name) {
	for(int i=0;i<itemList.size();i++) {
		int x=itemList.get(i).getItemName().compareToIgnoreCase(name);
		if(x==0) {
			System.out.print("Name:"+ itemList.get(i).getItemName()+"\n"+"Quantity: "+ itemList.get(i).getItemQuantity()+"\n");	
		}
	}
	
}

}





