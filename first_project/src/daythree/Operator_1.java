package daythree;

public class Operator_1 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int x=10;
		System.out.println("a and b value before the operation: " + a + " " + b);
		++a;
		int c=++a + b + a--;
		System.out.println("c value after the operation: " + c);
		int d=c++ + a + b--;
		System.out.println("d value after the operation: " + d);
		System.out.println("a, b, c, d value after the operation: " + a + " " + c + " " + d );
		
		x= (10==x) ? 1:0;
		System.out.println(x);

	}

}
