package appliancedomain;

public class Dishwasher extends Appliance {
	
	private String feature;
	private String soundRating;

	public Dishwasher(Integer applianceNumber, String brand, Integer quantity, Integer wattage, String colour, 
			Double price, String feature, String soundRating) {
		super(applianceNumber, brand, quantity, wattage, colour, price);
		this.feature = feature;
		this.soundRating = soundRating;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getSoundRating() {
		return soundRating;
	}

	public void setSoundRating(String soundRating) {
		this.soundRating = soundRating;
	}
	
	private String convertSoundRating(String soundRating) {
		switch(soundRating) {
		case "Qt":
			return "Quietest";
		case "Qr":
			return "Quieter";
		case "Qu":
			return "Quiet";
		case "M":
			return "Moderate";			
		}
		return null;		
	}
	@Override
	public String toString() {
		return "Item #: " + getApplianceNumber() + ", Brand: " + getBrand()
		+ ", Quantity: " + getQuantity() + ", Wattage: " + getWattage() + ", Colour: " + getColour()
		+ ", Price: " + getPrice() + ", Dishwasher feature: " + getFeature() +
		", Sound Rating: " +convertSoundRating(this.soundRating);
	}
	

}
