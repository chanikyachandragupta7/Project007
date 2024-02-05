package CreateArrayList;

public class Employee {
	
	private int eid;
	private String name;
	private double salary;
	
	//getter and setter
	public int geteid() {
		return eid;
	}
	public void seteid(int eid) {
		this.eid=eid;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	
	//parameterized constructor
	Employee(int eid,String name,double salary){
		super();
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	//override toString
	public String toString() {
		
		return "EmpID:"+this.eid+" "+"EmpName:"+this.name+" "+"EmpSalary:"+this.salary;
		
	}

}
