package ProgramsWithFor_each_loop;

public class Student4 {
	
	private String name;
	private String standard;
	private double marks;
	
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	//parameterized constructor
	Student4(String name,String standard,double marks){
		super();
		this.name=name;
		this.standard=standard;
		this.marks=marks;
	}
	
	//to display marks
	public void displaymarks() {
		System.out.println(marks);
	}
	
	//override toString()
	public String toString() {
		return "name:"+this.name+" "+"Class :"+this.standard+" "+"marks:"+this.marks;
	}
	

}
