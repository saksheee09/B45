package daysix;

public class HierarchicalInDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("......person details......");
		System.out.println(p1);
		
		Person p;
		p=new Person ("Aditya", "Panvel");
		if (p instanceof Person)
			System.out.println("person Details " +p);
		
		
		p=new Employee (101 , 6900, "Sales");
		if (p instanceof Employee)
			System.out.println("Employee Detail" + p);
		
		
		
		p= new Students ("Amar", "Kharghar", "BE", 75);
		if (p instanceof Students)
			System.out.println("Students Details" + p);
		

	}

}
