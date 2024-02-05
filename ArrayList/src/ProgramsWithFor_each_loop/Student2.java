package ProgramsWithFor_each_loop;

import java.util.ArrayList;

public class Student2 {
	
	public static void main(String[] args) {
	
	
		ArrayList<Object> ls=new ArrayList<>(); 
		
		ls.add(new Student("chaeli","10th",450));
		ls.add(new Student("marcy","12th",80));
		ls.add(new Student("rosy","degree",500));
		ls.add(new Student("aikky","12th",25));
		ls.add(new Student("nisha","degree",350));
		
		//accessing elements using for each
		for(Object element:ls) {
			Student s=(Student)element;
			String name=s.getName();
			char ch=name.charAt(0);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(name);
			}
	

	}
}
}