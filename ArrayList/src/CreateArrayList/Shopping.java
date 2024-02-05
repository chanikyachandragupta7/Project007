package CreateArrayList;

import java.util.ArrayList;

public class Shopping {
	
	public static void main(String[] args) {
		
		ArrayList ls=new ArrayList();
				
		ls.add(new Items(1,"iphone",35,4.5));
		ls.add(new Items(2,"TitanWatch",10000,4));
		ls.add(new Items(3,"Traintoy",2000,5));
		
		
		for(int i=0;i<ls.size();i++) {
			Items s=(Items)ls.get(i);
		if(s.getCost()%2==0) {
			
			System.out.println(ls.get(i));
			
			}
		}
		
	}
}
