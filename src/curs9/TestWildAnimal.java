package curs9;

public class TestWildAnimal {

	public static void main(String[] args) {
		
		/*
		WildAnimal animal = new WildAnimal();
		animal.makeSound();
		
		System.out.println("------------------");
		
		Deer bambi = new Deer();
		bambi.makeSound();//metoda suprascrisa 
		bambi.eatGrass();
		
		System.out.println("------------------");
		
		Lion simba = new Lion();
		simba.makeSound();//metoda suprascrisa 
		simba.eatMeat();*/
		
		System.out.println("------------------");
		
		WildAnimal simba = new Lion();
		simba.makeSound();
		//simba.eatMeat();//The method eatMeat() is undefined for the type WildAnimal
		((Lion)simba).eatMeat(); // Lion lion = new Lion()
		feedAnimal(simba);
		
		simba = new Deer();
		simba.makeSound();
		((Deer)simba).eatGrass();
		feedAnimal(simba);

	}
	
	public static void feedAnimal(WildAnimal animal) {
		
		if(animal instanceof Lion) {
			System.out.println("You are getting burgers!");
		}else if (animal instanceof Deer) {
			System.out.println("You are getting salad!");
		}
	}

}
