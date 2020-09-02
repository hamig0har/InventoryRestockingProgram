package storeprogram;
import java.io.IOException;

/**
 * this class is responsible for generating and order
 * @author hamza
 *
 */
public class Order {
	
	private Orderlines orderline;
	/**
	 * generates an order
	 * @param name
	 * @param amount
	 * @param supplierName
	 * @throws IOException
	 */
	public void generateOrder(String name,int amount,String supplierName) throws IOException {
	 orderline.generateOrder(name,amount,supplierName);
	}
	
}

