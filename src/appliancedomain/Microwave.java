package appliancedomain;

public class Microwave extends Appliance {
	
	private double capacity;
	private String roomType;

	public Microwave(int applianceNumber, String brand, int quantity, int wattage, String colour, 
			double price, double capacity, String roomType) {
		super(applianceNumber, brand, quantity, wattage, colour, price);
		this.capacity = capacity;
		this.roomType = roomType;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	@Override
	public String toString() {
		return "Item #: " + getApplianceNumber() + ", Brand: " + getBrand()
		+ ", Quantity: " + getQuantity() + ", Wattage: " + getWattage() + ", Colour: " + getColour()
		+ ", Price: " + getPrice() + ", Capacity: " + getCapacity() + ", Room Type: " +getRoomType();
	}
	

}
