package appliancedomain;

public class Refrigerator extends Appliance {
	
	private int doors;
	private int height;
	private int width;

	public Refrigerator(int applianceNumber, String brand, int quantity, int wattage, String colour, double price
			,int doors, int height, int width) {
		super(applianceNumber, brand, quantity, wattage, colour, price);
		this.doors = doors;
		this.height = height;
		this.width = width;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Item #: " + getApplianceNumber() + ", Brand: " + getBrand()
		+ ", Quantity: " + getQuantity() + ", Wattage: " + getWattage() + ", Colour: " + getColour()
		+ ", Price: " + getPrice() + ", # of Doors: " + getDoors() + ", Height: " +getHeight() + 
		", Width: " +getWidth();
	}
	
	
	

}
