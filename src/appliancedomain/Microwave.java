package appliancedomain;

public class Microwave extends Appliance {
	
	private Double capacity;
	private String roomType;

	public Microwave(Integer applianceNumber, String brand, Integer quantity, Integer wattage, String colour, 
			Double price, Double capacity, String roomType) {
		super(applianceNumber, brand, quantity, wattage, colour, price);
		this.capacity = capacity;
		this.roomType = roomType;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(Double capacity) {
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
