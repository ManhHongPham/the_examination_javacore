package obj;

public class Address {

	// constants
	public static final String CITYNAME = "no city";

	// PROPERTIES
	private String cityName;

	public Address() {
		this(Address.CITYNAME);
	}

	public Address(String cityName) {
		this.cityName = cityName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
		return;
	}

	public String toString() {
		return cityName;
	}

	public String getFileLine() {
		return cityName;
	}

}
