package ProgramsWithFor_each_loop;

import java.util.ArrayList;

public class StudentDriver1 {
	
	public static void main(String[] args) {
		
		ArrayList ls=new ArrayList();
		ls.add(new Student("chaeli","10th",450));
		ls.add(new Student("marcy","12th",80));
		ls.add(new Student("rosy","degree",500));
		ls.add(new Student("vikky","12th",25));
		ls.add(new Student("nisha","degree",350));
		
		//accessing elements using for each
		for(Object element:ls) {
			Student s=(Student)element;
			if(s.getMarks()>90) {
				System.out.println(s);
			}
		}
		
	}

}
