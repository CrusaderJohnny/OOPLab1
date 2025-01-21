package manager;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
					new Dishwasher(Integer.parseInt(fields[0]), fields[1], 
							Integer.parseInt(fields[2]), Integer.parseInt(fields[3]),
							fields[4], Double.parseDouble(fields[5]), fields[6], fields[7]);
					break;
				case '5':
					new Dishwasher(Integer.parseInt(fields[0]), fields[1], 
							Integer.parseInt(fields[2]), Integer.parseInt(fields[3]),
							fields[4], Double.parseDouble(fields[5]), fields[6], fields[7]);
					break;
			}
			list.add(s);
		}
	}
}