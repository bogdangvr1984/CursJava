package curs2;

public class TestRectangle {

	public static void main(String[] args) {
		
		
		Rectangle rectangle1 = new Rectangle();
		rectangle1.setLenght(5);
		rectangle1.setWidth(4);
		
		System.out.println(rectangle1.calculateArea());
		
		
		Rectangle rectangle2 = new Rectangle(5, 3);
		System.out.println(rectangle2.calculateArea());
 
		System.out.println("==========================");
		Rectangle rectangle3 = new Rectangle(5, 6, 4);
		System.out.println(rectangle3.calculateBigArea());
		System.out.println(rectangle3.calculateArea());
	}

}
