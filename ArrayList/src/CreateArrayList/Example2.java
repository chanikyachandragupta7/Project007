package CreateArrayList;

/* creating a method, which creates arraylist object and returns reference*/

import java.util.ArrayList;

public class Example2 {
	
	public static ArrayList createarraylist() {
		
		return new ArrayList();
	}
	
	public static void main(String[] args) {
		
		ArrayList ls=createarraylist();
		System.out.println(ls.size());
	}

}
