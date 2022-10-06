package curs9;

public class Animal {
	
	private boolean isVegetarian;
	private String meal;
	
	public Animal(boolean vegetarian, String meal) {
		
		setMeal(meal);
		setVegetarian(vegetarian);
		//this.meal = meal;
		//this.isVegetarian = vegetarian;
	}
	
	
	public boolean isVegetarian() {
		return isVegetarian;
	}
	private void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}
	public String getMeal() {
		return meal;
	}
	private void setMeal(String meal) {
		this.meal = meal;
	}
	
	

}
