package storeprogram;

import java.io.IOException;
import java.util.Scanner;
/**
 * this is the front end of the program that displays the menu to take user input for different operations
 * @author hamza
 *
 */
public class FrontEnd {

	/**
	 * the main function used for the menu
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		Shop shop=new Shop();
		Scanner sc=new Scanner(System.in);
		int choice;
		boolean option=true;
		
		while(option==true) {
			
		System.out.println("Menu");
		System.out.println("1. List all tools");
		System.out.println("2. Search for tool by tool name");
		System.out.println("3. Search for tool by toolID");
		System.out.println("4. Check item quantity");
		System.out.println("5. Decrease item quantity");
		System.out.println("6. QUIT");
		
		System.out.println("Enter Choice 1-6");
		
		choice=sc.nextInt();
		
		switch(choice) {
		
		case 1: shop.listallTools();
		option=true;
		break;
		
		case 2:System.out.println("Enter tool Name");
		String a= sc.nextLine();
		a= sc.nextLine();
		shop.showTool(a);
		option=true;
		break;
		
		case 3:System.out.println("Enter tool Id");
		int y=sc.nextInt();
		shop.showTool(y);
		option=true;
		break;
		
		case 4:System.out.println("Enter tool Name");
		String b= sc.nextLine();
		b= sc.nextLine();
		shop.checkItemQuantiy(b);
		option=true;
		break;
		
		case 5:System.out.println("Enter tool Id");
		int z=sc.nextInt();
		shop.decreaseItem(z);
		option=true;
		break;
		
		case 6:System.out.println("Program has been quit");
		option=false;
		break;
		
		
		default: System.out.println("Invalid input");
		System.out.println("Try again!");
		option=true;
		break;
		
		}
		}
		sc.close();
		

	}

}
