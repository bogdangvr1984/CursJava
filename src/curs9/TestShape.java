package curs9;

public class TestShape {

	public static void main(String[] args) {
		
		
		Shape shape = new Shape();
		shape.draw();
		shape.printClass();
		System.out.println(shape.nume);
		
		System.out.println("-----------------------");
		
		Cerc cerc = new Cerc();
		cerc.draw();
		cerc.printClass(); // o mosteneste din clasa Shape
		System.out.println(cerc.nume);
		
		System.out.println("-----------------------");
		
		Patrat patrat = new Patrat();
		patrat.draw(); //mostenit din clasa Parinte -- Shape
		patrat.printClass(); //mostenit din clasa Parinte -- Shape
		System.out.println(patrat.nume);
		
	}

}
