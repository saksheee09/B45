package daysix;

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		City city =new City();
		city.setCityName("Nashik");
		city.setArea(264.2f);
		city.setStateName("Maharastra");
		city.setLanguage("Marathi");
		city.setCountryName("India");
		city.setCapital("Delhi");
		System.out.println(city);

	}

}
