package curs12.tema12;

public class Monkey extends Primate implements BasicNeeds {

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
		System.out.println("cannot speak");
	}
	@Override
	public void sleep() {
		System.out.println("I need to sleep!");
		
	}
	
	@Override
	public void eat(String eater) {
		eater = "mostly erbivore";
		System.out.println(eater);
		
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}

}
