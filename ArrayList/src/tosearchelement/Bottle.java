package tosearchelement;

public class Bottle {
	
	String brand;
	String size;
	String color;
	
	Bottle(){
		
	}
	Bottle(String brand,String size,String color){
		super();
		this.brand=brand;
		this.size=size;
		this.color=color;
	}
	
	//override to String
	public String toString() {
		return "brand:"+this.brand+" "+"size:"+this.size+" "+"color:"+this.color;
	}
	
	

}
