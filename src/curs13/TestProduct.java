package curs13;

public class TestProduct {

	public static void main(String[] args) {
		
		//Product product = new Product();
		
		Laptop laptop = new Laptop(123, 19, 3);
		System.out.println(laptop.calculatePrice());
		laptop.productRating();
		
		System.out.println("----------------------");
		
		Mobile mobile = new Mobile(123, 19);
		System.out.println(mobile.calculatePrice());
		mobile.productRating();
	

	}

}
