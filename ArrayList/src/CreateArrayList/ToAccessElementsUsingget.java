package CreateArrayList;

import java.util.ArrayList;

public class ToAccessElementsUsingget {
	
	public static void main(String[] args) {
		
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		
		System.out.println(ls.get(0));
		System.out.println(ls.get(ls.size()-1));
		
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		
	}

}
