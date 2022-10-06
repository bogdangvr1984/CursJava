package curs9;

public class Dog extends Animal{
	
	private String color;

	public Dog(boolean vegetarian, String meal) {
		super(vegetarian, meal);
		this.color = "Stripe";
		
	}
	
	public Dog(boolean vegetarian, String meal, String color) {
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
