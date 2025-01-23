package manager;
import java.io.File;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import appliancedomain.Appliance;
import appliancedomain.Dishwasher;
import appliancedomain.Microwave;
import appliancedomain.Refrigerator;
import appliancedomain.Vacuum;



public class ApplianceManager {
	
	private ArrayList<Appliance> list;
	private Scanner input = null;
	private Scanner keyboard = new Scanner (System.in);
	private File file = new File("res/appliances.txt");
	
	public ApplianceManager() {
		list = new ArrayList<>();
		loadAppliancesFromFile();
	}
	
	private void loadAppliancesFromFile() {
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

	public ArrayList<Appliance> ReturnList() {
		
		return list;
	}
	public void SaveNQuit() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Appliance a : list) {
                writer.write(a.toSaveString()); // Use the toString method for consistent formatting
                writer.newLine(); // Add a new line after each object
            }
            System.out.println("File Saved");
        } catch (IOException e) {
            System.err.println("Error saving objects to file: " + e.getMessage());
        }
	}
	public void RandomList(Integer ranNum) {
		ArrayList<Appliance> randomList = new ArrayList<Appliance>();
		Random random = new Random();
		for(int i = 0; i < ranNum; i++) {
			int randomIndex = random.nextInt(list.size());
			randomList.add(list.get(randomIndex));
		}
		System.out.println(randomList.toString());
	}
	public void FindAppliancesType(Integer appType) {
		boolean checkComplete = false;
		switch (appType) {
		case 1:
			System.out.println("Enter number of doors(2, 3, 4): ");
			Integer doorNumbers = keyboard.nextInt();
			for(Appliance a : list) {
				if(a instanceof Refrigerator) {
					if (((Refrigerator) a).getDoors() == doorNumbers) {
						System.out.println(a.toString());
						checkComplete = true;
					}
				}
			}
			break;
		case 2:
			System.out.println("Enter battery voltage value (18v, 24v:");
			Integer battVolt = keyboard.nextInt();
			for(Appliance a : list) {
				if (a instanceof Vacuum) {
					if (((Vacuum) a).getVoltage() == battVolt) {
						System.out.println(a.toString());
						checkComplete = true;
					}
				}
			}
			break;
		case 3:
			System.out.println("Microwave room location(K for kitchen or W for work):");
			String roomLoc = keyboard.nextLine();
			for(Appliance a : list) {
				if(a instanceof Microwave) {
					if(((Microwave) a).getRoomType().equalsIgnoreCase(roomLoc)) {
						System.out.println(a.toString());
						checkComplete = true;
					}
				}
			}
			break;
		case 4:
			System.out.println("Enter dishwasher sound rating(Qt(Quietest), Qr(Quieter), Qu(Quiet), or M(Moderate):");
			String soundRat = keyboard.nextLine();
			for(Appliance a : list) {
				if (a instanceof Dishwasher) {
					if(((Dishwasher) a).getSoundRating().equalsIgnoreCase(soundRat)) {
						System.out.println(a.toString());
						checkComplete = true;
					}
				}
			}
			break;
		default:
			System.out.println("No matching appliances");
		}
		
		
	}
	public void FindAppliances(String brandSearch) {
		boolean checkComplete = false;
		for(Appliance a : list) {
			if(a.getBrand().equalsIgnoreCase(brandSearch)) {
				System.out.println("Matching Brands");
				System.out.println(a.toString());
				checkComplete = true;
			}
		}
		if(!checkComplete) {
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
					a.setQuantity(a.getQuantity()-1);
					System.out.println("Appliance " +checkApp+ " has been checked out.");
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