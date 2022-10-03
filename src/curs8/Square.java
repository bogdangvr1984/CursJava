package curs8;

public class Square extends Shape{

	public Square(String culoare, String nume) {
		super(culoare, nume);
		
	}

	String nume = "Patrat";
	String culoare = "Negru";
	
	public void printDetails() {
		System.out.println("Numele este :" + super.nume + " si culoare este " + super.culoare);
	}
}
