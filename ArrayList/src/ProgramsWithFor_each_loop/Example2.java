package ProgramsWithFor_each_loop;

import java.util.ArrayList;

public class Example2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> country=new ArrayList<>();
		country.add("Asia");
		country.add("Africa");
		country.add("Austrailia");
		country.add("Europe");
		
		//access all the lements using for_each statement
		
		for(String element:country) {
			
			if(element.compareTo(element)=='E') {
			
			System.out.println(element+" "+"number of characters="+" "+element.length());
			
		}
	}
	
}
}