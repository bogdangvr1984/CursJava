package curs8;

public class Shape {
	
	String nume = "nume generic";
	String culoare = "culoare generica";
	
	public Shape(String culoare, String nume) {
		this.culoare = culoare;
		this.nume = nume;
	}
	
	public void printDetails() {
		System.out.println("Numele este :" + nume + " si culoare este " + culoare);
	}

}