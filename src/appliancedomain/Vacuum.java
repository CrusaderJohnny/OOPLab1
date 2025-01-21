package appliancedomain;

public class Vacuum extends Appliance {
	
	private String grade;
	private int voltage;

	public Vacuum(int applianceNumber, String brand, int quantity, int wattage, String colour, 
			double price, String grade, int voltage) {
		super(applianceNumber, brand, quantity, wattage, colour, price);
		this.grade = grade;
		this.voltage = voltage;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	
	@Override
	public String toString() {
		return "Item #: " + getApplianceNumber() + ", Brand: " + getBrand()
		+ ", Quantity: " + getQuantity() + ", Wattage: " + getWattage() + ", Colour: " + getColour()
		+ ", Price: " + getPrice() + ", Vacuum Grade: " + getGrade() + ", Voltage: " +getVoltage();
	}
	

}
