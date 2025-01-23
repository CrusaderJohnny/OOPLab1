package manager;
import java.io.File;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import appliancedomain.Appliance;
import appliancedomain.Dishwasher;
import appliancedomain.Microwave;
import appliancedomain.Refrigerator;
import appliancedomain.Vacuum;



public class ApplianceManager {
	
	private ArrayList<Appliance> list;
	Scanner input = null;
	Scanner keyboard = null;
	
	public ApplianceManager() {
		list = new ArrayList<>();
		loadAppliancesFromFile();
	}
	
	private void loadAppliancesFromFile() {
		File file = new File("res/appliances.txt");
		try {
			Scanner newfile = new Scanner(file);
			input = newfile;
		} catch(FileNotFoundException e) {
			e.printStackTrace();			
		}
		while(input.hasNext()) {
			String line = input.nextLine();
			String[] fields = line.split(";");
			String id = fields[0];
			char firstDigit = id.charAt(0);
			Appliance s = null;
			switch(firstDigit) {
				case '1':
					s = new Refrigerator(Integer.parseInt(fields[0]), fields[1], 
							Integer.parseInt(fields[2]), Integer.parseInt(fields[3]),
							fields[4], Double.parseDouble(fields[5]), Integer.parseInt(fields[6]), Integer.parseInt(fields[7]),
							Integer.parseInt(fields[8]));
					break;
				case '2':
					s = new Vacuum(Integer.parseInt(fields[0]), fields[1], 
							Integer.parseInt(fields[2]), Integer.parseInt(fields[3]),
							fields[4], Double.parseDouble(fields[5]), fields[6], Integer.parseInt(fields[7]));
					break;
				case '3':
					s = new Microwave(Integer.parseInt(fields[0]), fields[1], 
							Integer.parseInt(fields[2]), Integer.parseInt(fields[3]),
							fields[4], Double.parseDouble(fields[5]), Double.parseDouble(fields[6]), fields[7]);	
					break;
				case '4':
					s = new Dishwasher(Integer.parseInt(fields[0]), fields[1], 
							Integer.parseInt(fields[2]), Integer.parseInt(fields[3]),
							fields[4], Double.parseDouble(fields[5]), fields[6], fields[7]);
					break;
				case '5':
					s = new Dishwasher(Integer.parseInt(fields[0]), fields[1], 
							Integer.parseInt(fields[2]), Integer.parseInt(fields[3]),
							fields[4], Double.parseDouble(fields[5]), fields[6], fields[7]);
					break;
			}
			list.add(s);
		}
	}
	public void printList() {
		for(Appliance a : list) {
			System.out.println(a.toString());
		}
	}
	public ArrayList<Appliance> ReturnList() {
		
		return list;
	}
	public void SaveNQuit() {
		// TODO Auto-generated method stub
		
	}
	public void RandomList() {
		// TODO Auto-generated method stub
		
	}
	public void FindAppliancesType() {
		// TODO Auto-generated method stub
		
	}
	public void FindAppliances(String brandSearch) {
		boolean checkComplete = false;
		ArrayList<Appliance> foundBrands = null;
		for(Appliance a : list) {
			if(a.getBrand() == brandSearch) {
				System.out.println("found");
				foundBrands.add(a);
			}
		}
		if(foundBrands == null) {
			System.out.println("No matching brands");
		}
		
	}
	public void ApplianceCheckOut(int checkApp) {
		boolean checkComplete = false;
		for(Appliance a : list) {
			if(a.getApplianceNumber() == checkApp) {
				if(a.getQuantity() == 0) {
					System.out.println("The appliance is not available to be checked out.");
					checkComplete = true;
					break;
				}
				else {
					a.setQuantity(-1);
					System.out.println("Appliance "+checkApp+ "has been checked out.");
					checkComplete = true;
					break;
				}
			}			
		}
		if(checkComplete == false) {
			System.out.println("No appliances found with that number.");
		}
	}
}