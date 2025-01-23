package appliancedomain;

public class Refrigerator extends Appliance {
	
	private Integer doors;
	private Integer height;
	private Integer width;

	public Refrigerator(Integer applianceNumber, String brand, Integer quantity, Integer wattage, String colour, Double price
			,Integer doors, Integer height, Integer width) {
		super(applianceNumber, brand, quantity, wattage, colour, price);
		this.doors = doors;
		this.height = height;
		this.width = width;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(Integer doors) {
		this.doors = doors;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Item #: " + getApplianceNumber() +  "\n Brand: " + getBrand()
		+ "\n Quantity: " + getQuantity() + "\n Wattage: " + getWattage() + "\n Colour: " + getColour()
		+ "\n Price: " + getPrice() + "\n # of Doors: " + getDoors() + "\n Height: " +getHeight() + 
		"\n Width: " +getWidth()+ "\n";
	}
	public String toSaveString() {
		return +getApplianceNumber()+";"+getBrand()+";"+getQuantity()+";"+getWattage()+";"
				+getColour()+";"+getPrice()+";"+getDoors()+";"+getHeight();
	}
	
	
	

}
