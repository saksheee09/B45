package dayten;

public class ArrayIndexOutOfBox {

	public static void main(String[] args) {
		int []arr = new int [4];
		
		System.out.println("Welcome to B45 batch");
		
		try {
			
			int i= arr[4];
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
		System.out.println("next line should be execute");
		}
        System.out.println("Whatever happens this line will be execute");
	}

}
