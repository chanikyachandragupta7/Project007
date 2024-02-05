package CreateArrayList;

class Items {
	
	private int itemid;
	private String name;
	private double cost;
	private double rating;
	
	// setters and getters
	public int getItenid() {
		return itemid;
	}
	public void setItenid(int itenid) {
		this.itemid = itenid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	// parameterized constructor
	Items(){
		
	}
	
	Items(int itemid,String name,double cost,double rating){
		super();
		this.itemid=itemid;
		this.name=name;
		this.cost=cost;
		this.rating=rating;
		
	}
	
	//overriding toString
	public String toString() {
		return "itemid:"+this.itemid+" "+"name:"+this.name+" "+"cost:"+this.cost+" "+"rating:"+this.rating;
	}

}
