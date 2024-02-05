package CreateArrayList;

import java.util.ArrayList;

public class Shopping1 {
	
	public static void main(String[] args) {
		
		ArrayList<Items> ls=new ArrayList<>();
		ls.add(new Items(1,"iphone",25000,4.5));
		ls.add(new Items(2,"TitanWatch",10000,2));
		ls.add(new Items(3,"Traintoy",2000,5));
		
		
		
		for(int i=0;i<ls.size();i++) {
			Items s=(Items)ls.get(i);
			if(s.getRating()>3.5) {
				System.out.println(ls.get(i));
			}
			
			
		}
		
		
		
	}

}
