package daythree;

public class Switch_demo {

	public static void main(String[] args) {
		int x=4;
		switch(x)
		{
		case 'l': 
		case 'L':
			System.out.println(x+ " is a letter");
			break;
		case 'd':
		case 'D':
			System.out.println(x+ " is a digit");
			break;
			
		case 'w':
		case 'W':
			System.out.println(x+ " is a white space");
		case 's':
		case 'S':
			System.out.println(x+ " is special letter");
			default:
				System.out.println(x+ " is other than letter");
				break;
		}
		
	}

}
