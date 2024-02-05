package tosearchelement;

import java.util.ArrayList;

public class Example1 {
	
	public static void main(String[] args) {
		
		ArrayList ls=new ArrayList();
		
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(20);
		System.out.println("ls :"+ls);
		
		//search an element in arraylist ls
		//keyelement is 30
		int keyelement=20;
		System.out.println(ls.contains(keyelement));
		System.out.println(ls.indexOf(keyelement));
		
	}

}
