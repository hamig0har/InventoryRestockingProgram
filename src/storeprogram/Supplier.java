package storeprogram;
import java.util.ArrayList;
/**
 * holds the information of a particular supplier and the items it supplies
 * @author hamza
 *
 */
public class Supplier {
/**
 *  id of supplier	
 */
private int id;
/**
 * name of supplier
 */
private String name;
/**
 * the address of the supplier
 */
private String address;
/**
 *  the contact of the supplier
 */
private String contact;
/**
 * the list of items the supplier provides
 */
private ArrayList<Item> myItems=new ArrayList<>();
/**
 * constructor of class
 * @param id
 * @param name
 * @param address
 * @param contact
 */
Supplier(int id, String name,String address,String contact){
	this.id=id;
	this.name=name;
	this.address=address;
	this.contact=contact;
}
/**
 * gets supplier id
 * @return supplier id
 */
public int getSupplierId() {
	return id;
}
/**
 * gets supplier name
 * @return supplier name
 */
public String getSupplierName(){
	return name;
}
/**
 * gets supplier address
 * @return supplier address
 */
public String getSupplierAddress() {
	return address;
}
/**
 * gets supplier contact
 * @return supplier contact
 */
public String getSupplierConatct() {
	return contact;
}
/**
 * adds an item to the list of items the supplier provides
 * @param item the item to be added
 */
void addMyItem(Item item) {
	myItems.add(item);
	

}
}
