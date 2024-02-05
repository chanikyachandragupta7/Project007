package toRemoveElement;

import java.util.ArrayList;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		ArrayList ls=new ArrayList();
		
		ls.add(new Student("arjun","10th",100));
		ls.add(new Student("ashoka","12th",90));
		ls.add(new Student("karna","degree",65));
		
		System.out.println(ls);
		System.out.println("===================");
		System.out.println(ls.remove(1));
		System.out.println("===================");
		  
		
		
		
	}

}
