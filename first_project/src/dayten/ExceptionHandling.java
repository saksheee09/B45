package dayten;

public class ExceptionHandling {

	public static void main(String[] args) {
		int number=50/5;
		System.out.println(number);
		
		int number1=50/10;
		System.out.println(number1);
		try {
		int number2=50/0;
		System.out.println(number2);
		}
		catch (Exception obj) {
			System.out.println(obj);
		}
		int number3=50/25;
		System.out.println(number3);
		
	}

}
