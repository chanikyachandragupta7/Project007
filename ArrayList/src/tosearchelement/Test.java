package tosearchelement;

import java.util.Scanner;
import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		ArrayList ls=new ArrayList();
		ls.add(new Bottle("TopperWear","2lt","aqua"));
		ls.add(new Bottle("Prestiage","1lt","silver"));
		ls.add(new Bottle("pigeon","2lt","black"));
		ls.add(new Bottle("hilton","1lt","steel"));
		ls.add(new Bottle("puma","1lt","red"));
		
		//System.out.println(ls);
		Removebottle(ls);
		
				
	}
	public static void Removebottle(ArrayList ls) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the keyindex");
		int c=s.nextInt();
		ls.remove(c);
		for(Object element:ls) {
		System.out.println(element);
		
	}

}
}