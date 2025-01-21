package appliancedomain;

public class Dishwasher extends Appliance {
	
	private String feature;
	private String soundRating;

	public Dishwasher(int applianceNumber, String brand, int quantity, int wattage, String colour, 
			double price, String feature, String soundRating) {
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
		String qt = "Quietest";
		String qr = "Quieter";
		String qu = "Quiet";
		String m = "Moderate";
		if(soundRating == qt) {
			return qt;
		}
		else if(soundRating == qr) {
			return qr;
		}
		else if(soundRating == qu) {
			return qu;
		}
		else if(soundRating == m) {
			return m;
		}
		else {
			return "Invalid Rating";
		}
		
	}
	@Override
	public String toString() {
		return "Item #: " + getApplianceNumber() + ", Brand: " + getBrand()
		+ ", Quantity: " + getQuantity() + ", Wattage: " + getWattage() + ", Colour: " + getColour()
		+ ", Price: " + getPrice() + ", Dishwasher feature: " + getFeature() +
		", Sound Rating: " +convertSoundRating(this.soundRating);
	}
	

}
