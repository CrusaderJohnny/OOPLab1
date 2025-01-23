package manager;

import java.util.ArrayList;
import java.util.Scanner;
import manager.ApplianceManager;
import manager.NotIntegerException;
import appliancedomain.Appliance;


public class MenuManager {
	
	ApplianceManager am = new ApplianceManager();
	
	private void applianceTypeMenu() {
		System.out.println("Appliance Types");
		System.out.println("1 - Refrigerators");
		System.out.println("2 - Vacuums");
		System.out.println("3 - Microwaves");
		System.out.println("4 - Dishwashers");
		System.out.println("Enter type of appliance: ");
	}
	
	Scanner keyboardInput = new Scanner( System.in );

	public void MenuPrint() {
		String menuInput = null;
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
				keyboardInput.nextLine();
				MenuPrint();
				break;
			case "2":
				System.out.println("Enter brand to search for:");
				String brandSearch = keyboardInput.nextLine();
				am.FindAppliances(brandSearch);	
				MenuPrint();
				break;
			case "3":
				applianceTypeMenu();
				Integer appType = keyboardInput.nextInt();
				am.FindAppliancesType(appType);
				keyboardInput.nextLine();
				MenuPrint();
				break;
			case "4":
				System.out.println("Enter number of appliances:");
				Integer ranNumb = keyboardInput.nextInt();
				am.RandomList(ranNumb);
				keyboardInput.nextLine();
				MenuPrint();
				break;
			case "5":
				am.SaveNQuit();
				System.out.println("Z!=Y goodbye!");
				System.exit(0);
				break;
		}
		
	}

	
}
