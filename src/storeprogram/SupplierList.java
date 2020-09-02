package storeprogram;
import java.util.ArrayList;

/**
 * holds the list of all the suppliers that provide to the shop
 * @author hamza
 *
 */
public class SupplierList {
	/**
	 * list of suppliers
	 */
	private ArrayList<Supplier>supplierList = new ArrayList<>();
	/**
	 * gets supplierslist
	 * @return the list of suppliers
	 */
	ArrayList<Supplier> getSupplierList(){
		return supplierList;
	}
	
	/**
	 * adds a brand new supplier
	 * @param id the new suppliers id
	 * @param name the new suppliers name
	 * @param address the new suppliers address 
	 * @param contact the new suppliers contact
	 */
	void newSupplier(int id, String name, String address, String contact) {
		Supplier newSupplier=new Supplier(id, name, address, contact);
		supplierList.add(newSupplier);
	}
	/**
	 * removes a supplier
	 * @param id the id of the supplier to be removed
	 */
	void removeSupplier(int id) {
		for(int i=0;i<supplierList.size();i++) {
			if(supplierList.get(i).getSupplierId()==id) {
				supplierList.remove(i);
			}
		}
	}
}
