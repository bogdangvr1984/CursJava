package curs9;

public class TestAnimal {

	public static void main(String[] args) {
		
		Horse horse = new Horse(true, "grass");
		System.out.println("Horse is vegetarian :" + horse.isVegetarian());
		System.out.println("Horse eats :" + horse.getMeal());
		System.out.println("Horse color is :" + horse.getColor());
		
		System.out.println("----------------------------------------------");
		
		Dog dog = new Dog(false, "hotdog", "White");
		System.out.println("Dog is vegetarian :" + dog.isVegetarian());
		System.out.println("Dog eats :" + dog.getMeal());
		System.out.println("Dog color is :" + dog.getColor());

	}
	
	//Animal doggy = new Dog(false, "carne", "Galben");
	//WebDriver driver = new ChromeDriver();

}
