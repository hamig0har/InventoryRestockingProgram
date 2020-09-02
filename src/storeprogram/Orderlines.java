package storeprogram;
import java.util.Date;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * This class generates all the order-lines on the orders.txt file
 * @author hamza
 *
 */
public class Orderlines {
	/**
	 * date of the order
	 */
	private Date date;
	/**
	 * id of the order
	 */
	private int id;
	
	Orderlines(){
		id = generateId();
		date= new Date();
	}
	/**
	 * generated random 5 digit id
	 * @return
	 */
	public int generateId() {
		Random random=new Random();
		int rnd= 10000+random.nextInt(99999);
		return rnd;
	}
	/**
	 * gets order id
	 * @return order id
	 */
	public int getId() {
		return this.id;
	}
	/**
	 * gets date of order
	 * @return date
	 */
	public Date getDate() {
		return this.date;
	}
	

	/**
	 * generates order on orders.txt
	 * @param name name of item 
	 * @param amount amount to be ordered
	 * @param supplierName the neame of the supplier that provides the item
	 * @throws IOException
	 */
	public void generateOrder(String name,int amount,String supplierName) throws IOException {
		
		File orders=new File("orders.txt");
		FileWriter fileWriter = new FileWriter(orders,true);
		BufferedWriter buffer=new BufferedWriter(fileWriter);
		PrintWriter printWriter=new PrintWriter(buffer);
		
		if(orders.exists()==false) {
			orders.createNewFile();
		}
		
		printWriter.println("Order Id:           "+this.id+"\n");
		printWriter.println("Date Ordered:       "+this.date+"\n");
		printWriter.println("Item description:   " +name+"\n");
		printWriter.println("Amount Ordered:     "+amount+"\n");
		printWriter.println("Supplier:           "+supplierName+"\n");
		
		printWriter.close();
	
		
		
	}
}
