package curs2;

public class Rectangle {
	
	private int lenght;
	private int width;
	private int bigArea;
	
	public Rectangle() {}
	
	public Rectangle(int lenght, int width) {
		setLenght(lenght);
		setWidth(width);
	}
	
	public Rectangle(int lenght, int width, int bigArea) {
		setLenght(lenght);
		setWidth(width);
		this.bigArea = bigArea;
	}
	
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	
	public int calculateArea() {
		return lenght * width;
	}

	public int calculateBigArea() {
		return bigArea/calculateArea();
	}
	
	
	
}
