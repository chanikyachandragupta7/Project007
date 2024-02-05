package CreateArrayList;

import java.util.ArrayList;

public class SumofNumbersUsingget {
	
	public static void main(String[] args) {
		
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		
		int sum=0;
		for(int i=0;i<ls.size();i++) {
			sum=sum+(int)ls.get(i);
		}
		System.out.println(sum);
	}

}
