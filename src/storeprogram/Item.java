package storeprogram;

import java.io.IOException;
/**
 * This class represents one item
 * @author hamza
 *
 */
public class Item {

	private int id;
	private String name;
	private int quantity;
	private float price;
	private int supplierId;
	private Supplier itemSupplier;
	private Orderlines orderline;
	
	Item(int id,String name,int quantity,float price,int supplierId){
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
		this.supplierId=supplierId;
	}
	/** gets item id
	 * @return item id
	 */
	int getItemId(){
		return id;
	}
	/** gets item name
	 * @return item name
	 */
	String getItemName() {
		return name;
	}
	/** gets item price
	 * @return item price
	 */
	float getItemPrice() {
		return price;
	}
	/** gets item quantity
	 * @return item quantity
	 */
	int getItemQuantity() {
		return quantity;
	}
	/** gets items supplier id
	 * @return supplier id
	 */
	int getItemSupplierId() {
		return supplierId;
	}
	/**
	 * increments the quantity of an item by 1
	 */
	void incrementQuantity() {
		this.quantity++;
	}
	/**
	 * decrements the quantity of an item by 1
	 * @throws IOException
	 */
	void decrementQuantity() throws IOException {
		this.quantity--;
		if(this.quantity<40) {
			int x =50-this.quantity;
			orderline.generateOrder(name, x, itemSupplier.getSupplierName());
		}
	}
	/**
	 * sets the item to its particular supplier
	 * @param itemSupplier the items supplier
	 */
	void setSupplier(Supplier itemSupplier) {
		
		this.itemSupplier=itemSupplier;
	}
	/** gets item supplier
	 * @return item supplier
	 */
	public Supplier getSupplier() {
		return this.itemSupplier;
	}
}
