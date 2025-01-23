package manager;

import java.util.ArrayList;
import java.util.Scanner;
import manager.ApplianceManager;
import manager.NotIntegerException;
import appliancedomain.Appliance;


public class MenuManager {
	
	ApplianceManager am = new ApplianceManager();
	
	private ArrayList<Appliance> menuList;
	public void LoadMenus() {
		menuList = am.ReturnList();
	}
	
	Scanner keyboardInput = new Scanner( System.in );
	String menuInput;
	public void MenuPrint() {
		System.out.println("Welcome to Modern Appliances!");
		System.out.println("How may we assist you?");
		System.out.println("1 - Check out appliance");
		System.out.println("2 - Find appliances by brand");
		System.out.println("3 - Display appliances by type");
		System.out.println("4 - Produce random appliance list");
		System.out.println("5 - Save & Exit");
		System.out.println("Enter option: ");
		menuInput = keyboardInput.nextLine();
		switch(menuInput) {
			case "1":
				System.out.println("Enter the item number of an appliance: ");
				Integer checkOut = keyboardInput.nextInt();
				am.ApplianceCheckOut(checkOut);
				MenuPrint();
				break;
			case "2":
				System.out.println("Enter brand to search for:");
				String brandSearch = keyboardInput.nextLine();
				am.FindAppliances(brandSearch);
				MenuPrint();
				break;
			case "3":
				am.FindAppliancesType();
				break;
			case "4":
				am.RandomList();
				break;
			case "5":
				am.SaveNQuit();
				break;
			case "6":
				am.printList();
				MenuPrint();
				break;
		}
		
	}

	
}
