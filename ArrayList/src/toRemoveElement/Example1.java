package toRemoveElement;

import java.util.ArrayList;

public class Example1 {
	
	public static void main(String[] args) {
		
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		ls.add(60);
		
		System.out.println(ls);
		ls.remove(2);
		System.out.println(ls);
		ls.remove(4);
		System.out.println(ls );
	}

}
