package daysix;

public class Class extends State {
	private String cityName;
	private float area;
	
	
	public String getCityName() {
		return cityName;
	}
	
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
	public float getArea() {
		return area;
	}
	
	
	public void setArea(float area) {
		this.area = area;
	}


	@Override
	public String toString() {
		return "Class [cityName=" + cityName + ", area=" + area + ", getCityName()=" + getCityName() + ", getArea()="
				+ getArea() + "]";
	}
	
	
	
	
	
}
