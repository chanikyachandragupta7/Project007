package ProgramsWithFor_each_loop;

import java.util.ArrayList;

public class Example1 {
	
	public static void main(String[] args) {
		
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add('a');
		ls.add(true);
		ls.add("hello");
		
		// access using for-each-loop
		for(Object element :  ls ) {
			System.out.println(element);
		}
	}

}
