package tosearchelement;

import java.util.ArrayList;

public class Example2 {
	
	public static void main(String[] args) {
		
		ArrayList ls=new ArrayList();
		ls.add("india");
		ls.add("japan");
		ls.add("africa");
		ls.add("USA");
		
		System.out.println(ls.contains("india"));
		System.out.println(ls.indexOf("japan"));
		
	}

}
