package appliancedomain;

public abstract class Appliance {
	private int applianceNumber;
	private String brand;
	private int quantity;
	private int wattage;
	private String colour;
	private double price;
	
	public Appliance(int applianceNumber, String brand, int quantity, int wattage, String colour, double price) {
		super();
		this.applianceNumber = applianceNumber;
		this.brand = brand;
		this.quantity = quantity;
		this.wattage = wattage;
		this.colour = colour;
		this.price = price;		
	}

	public int getApplianceNumber() {
		return applianceNumber;
	}

	public void setApplianceNumber(int applianceNumber) {
		this.applianceNumber = applianceNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getWattage() {
		return wattage;
	}

	public void setWattage(int wattage) {
		this.wattage = wattage;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item #: " + getApplianceNumber() +  "\n Brand: " + getBrand()
				+ "\n Quantity: " + getQuantity() + "\n Wattage: " + getWattage() + "\n Colour: " + getColour()
				+ "\n Price: " + getPrice()+ "\n";
	}
	public String toSaveString() {
		return +getApplianceNumber()+";"+getBrand()+";"+getQuantity()+";"+getWattage()+";"
				+getColour()+";"+getPrice();
	}
	
}
