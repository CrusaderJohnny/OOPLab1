package appliancedomain;

public class Vacuum extends Appliance {
	
	private String grade;
	private Integer voltage;

	public Vacuum(Integer applianceNumber, String brand, Integer quantity, Integer wattage, String colour, 
			Double price, String grade, Integer voltage) {
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

	public void setVoltage(Integer voltage) {
		this.voltage = voltage;
	}
	
	@Override
	public String toString() {
		return "Item #: " + getApplianceNumber() + ", Brand: " + getBrand()
		+ ", Quantity: " + getQuantity() + ", Wattage: " + getWattage() + ", Colour: " + getColour()
		+ ", Price: " + getPrice() + ", Vacuum Grade: " + getGrade() + ", Voltage: " +getVoltage();
	}
	

}
