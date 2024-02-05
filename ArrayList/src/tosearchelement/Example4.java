package tosearchelement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Example4 {

	public static void main(String[] args) {		
		try {
			get();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Lenght is greater than 4");
		}

	}

	public static void get() throws IndexOutOfBoundsException {
		ArrayList ls = new ArrayList();

		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(20);

		System.out.println(ls.get(5));
		System.out.println("End");

	}

}
