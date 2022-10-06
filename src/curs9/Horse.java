package curs9;

public class Horse extends Animal {
	
	private String color;

	public Horse(boolean vegetarian, String meal) {
		super(vegetarian, meal);
		this.color = "Brown";
	}
	
	public Horse(boolean vegetarian, String meal,String color) {
		super(vegetarian, meal);
		this.color = color;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	

}
