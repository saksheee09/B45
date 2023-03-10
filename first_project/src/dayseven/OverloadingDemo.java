package dayseven;

public class OverloadingDemo {
	public void m1(int a, String b) {
		System.out.println("Firstprogram");

}
	public void m1 (String r, int s) {
		System.out.println("Secondprogram");
	}
	
	public static void main (String[] args) {
		OverloadingDemo h= new OverloadingDemo();
		h.m1(12,"sakshi");
		h.m1("sayali",34);
		
		
		
	}

}