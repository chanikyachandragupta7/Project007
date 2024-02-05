package CreateArrayList;

import java.util.ArrayList;

public class TraverseReverseofNumbers {
	
	public static void main(String[] args) {
		
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		
		for(int i=ls.size()-1;i>=0;i--) {
			
			System.out.println(ls.get(i));
			
		}
	}

}
