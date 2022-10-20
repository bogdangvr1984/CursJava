package curs13;

public abstract class Product {
	
	public String numeProdus;
	
	public abstract int calculatePrice();
	
	public void productRating() {
		System.out.println("The best product!");
	}

}
