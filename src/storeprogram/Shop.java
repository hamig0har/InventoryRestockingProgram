package storeprogram;

import java.io.IOException;
/**
 * this is the back-end controller of the program
 * @author hamza
 *
 */
public class Shop {
	/**
	 * inventory for the shop
	 */
	 private Inventory inventory;
	 /**
	  * supplier list that holds all suppliers
	  */
	 private SupplierList supplierlist;
	 /**
	  * helps import the files
	  */
	 FileManager files;
	
 Shop(){
		 inventory =new Inventory();
		 supplierlist=new SupplierList();
		 files=new FileManager(inventory,supplierlist);
		 files.readItemFile();
		 files.readSupplierFile();
	}
 /**
  * lists all tools
  */
 void listallTools() {
	 inventory.listalltools();
 }
 /**
  * checks the quantity of a particular item
  */
 void checkItemQuantiy(String name) throws IOException {
	 inventory.checkItemQuantity(name);
 }
 
 /**
  * adds a brand new a item
  * @param id
  * @param name
  * @param quantity
  * @param price
  * @param supplierid
  */
 void addNewItem(int id, String name, int quantity,float price, int supplierid) {
	 inventory.newItem(id,name,quantity,price,supplierid);
	 return;
 }
 /**
  * shows tool by id
  * @param id
  */
 void showTool(int id){
	 inventory.toolInfo(id);
	 return;
 }
 /**
  * shows tool by name
  * @param name
  */
 void showTool(String name) {
	 inventory.toolInfo(name);
	 return;
 }
 /**
  * increases an item by 1
  * @param id
  */
 void increaseItem(int id) {
	 inventory.increaseItem(id);
	 return;
 }
 /**
  * decreases an item by 1
  * @param id
  * @throws IOException
  */
 void decreaseItem(int id) throws IOException {
	 inventory.decreaseItem(id);
	 return;
 }
 /**
  * adds a brand new supplier to the supplier list
  * @param id
  * @param name
  * @param address
  * @param contact
  */
 void newSupplier(int id, String name,String address,String contact) {
	 supplierlist.newSupplier(id, name, address, contact);
 }
 /**
  * sets suppliers to the items they provide and vice versa
  */
 void setSupplierToItems(){
	 
	 for(int i=0; i<inventory.getItemList().size();i++) {
		 for(int j=0;j<supplierlist.getSupplierList().size();j++) {
			if(inventory.getItemList().get(i).getItemSupplierId()==supplierlist.getSupplierList().get(j).getSupplierId() ) {
				inventory.getItemList().get(i).setSupplier(supplierlist.getSupplierList().get(j));
				supplierlist.getSupplierList().get(j).addMyItem(inventory.getItemList().get(i));
			}
		 }
	 }
	 
 }
}
