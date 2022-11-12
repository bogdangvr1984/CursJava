package curs12.tema12;

public class Human extends Primate implements BasicNeeds{

	
	@Override
	public void walk() {
		System.out.println("can walk");
	}
	
	@Override
	public void run() {
		System.out.println("can run");
	}
	
	@Override
	public void speak() {
		System.out.println("I can speak !");
	}
	
	@Override
	public void eat(String eater) {
		eater = "Omnivore";
		System.out.println(eater);
		
	}

	@Override
	public void sleep() {
		System.out.println("I need to sleep!");
		
	}

	@Override
	public void drink() {
		System.out.println();
		
	}

}
