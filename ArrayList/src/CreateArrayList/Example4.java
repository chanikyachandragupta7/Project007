package CreateArrayList;

import java.util.ArrayList;

public class Example4 {
	
	public static void main(String[] args) {
		
		ArrayList ls=new ArrayList();
		
		//creating employee object
		Employee e1=new Employee(1,"Smith",2000);
		ls.add(e1);
		
		//another easy way to add employee details in arraylist
		ls.add(new Employee(2,"Allen",300));
		ls.add(new Employee(3,"Rita",250));
		
		ls.add(20);
		ls.add(true);
		ls.add(10.50);
		System.out.println("no of Employees:"+ls.size());
		
		System.out.println(ls);
	
	}

}
