package storeprogram;

import java.io.File;
import java.util.Scanner;
/**
 * This Class manages the input of files, as it stores data
 * @author hamza
 *
 */
public class FileManager {
	/**
	 * the inventory that the items from the file needs to be placed
	 */
	private Inventory i;
	/**
	 * the SupplierList where all suppliers are stored from the input file
	 */
	private SupplierList s;
	/**
	 * This is the constructor
	 * @param i the inventory to store all the input item data
	 * @param s the supplierlist to store all the input Supplier data 
	 */
	FileManager(Inventory i,SupplierList s){
		this.i=i;
		this.s=s;
	}
	/**
	 * Scanner variables to read files
	 */
	private Scanner x;
	private Scanner y;
	/**
	 * reads the item file
	 */
	public void readItemFile() {
		
		try {
			x=new Scanner(new File("items.txt"));
		}
		catch(Exception e){
			System.out.println("Couldn't find file");
		}
		String [] split=new String[5];
		while(x.hasNext()) {
			
			split=x.nextLine().split(";");
			
			
			String a = split[0];
			int id = Integer.parseInt(a);
		
			String name =split[1];
			
			String quan=split[2];
			int quantity= Integer.parseInt(quan);
			
			String pri=split[3];
			float price=Float.parseFloat(pri);
			
			String suppId=split[4];
			int supplierId=Integer.parseInt(suppId);
			
			i.newItem(id, name, quantity, price, supplierId);
		}
		
	}
	/**
	 * reads the supplier file
	 */
	public void readSupplierFile(){
		try {
			y=new Scanner(new File("suppliers.txt"));
		}
		catch(Exception e){
			System.out.println("Couldn't find file");
		}
		String [] split=new String[4];
		while(x.hasNext()) {
			
			split=y.nextLine().split(";");
			
			String a = split[0];
			int id = Integer.parseInt(a);
			
			String name =split[1];
			
			String address=split[2];
			
			String contact=split[3];
			
			s.newSupplier(id, name, address,contact);
		}
		
	}

}
