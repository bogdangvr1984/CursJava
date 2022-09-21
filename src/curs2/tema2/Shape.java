package curs2.tema2;

public class Shape {
	
	public int calculateSquareArea(int lenght) {
		return lenght * lenght;
	}
	
	public int calculateRectangleArea(int lenght, int width) {
		return lenght * width;
	}

	public Shape(int lenght) {
//		calculateSquareArea(lenght);
		
	System.out.println("The area of the square is : " + calculateSquareArea(lenght));
	}
	
	public Shape(int lenght, int width) {
//		calculateRectangleArea(lenght, width);
		
		System.out.println("The area of the rectangle is : " + calculateRectangleArea(lenght, width));
	}
	
	public Shape(double radius) {
		double arieCerc = radius * radius * Math.PI;
		
		System.out.println("The area of the circle is : " + arieCerc);
				
	}
	
	
}
