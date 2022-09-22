package curs3.tema3;

public class TestCar {

	public static void main(String[] args) {
		
		
		Car obiect = new Car("Audi","diesel");
		
		System.out.println(obiect.carDetials());
		
		Car obiect2 = new Car("Mazda","petrol");
		
		Car.type = "sedan";
		
		System.out.println(obiect2.carDetials());
		System.out.println(obiect.carDetials());

	}

}
