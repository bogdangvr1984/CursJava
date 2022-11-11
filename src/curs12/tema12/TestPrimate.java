package curs12.tema12;

public class TestPrimate {

	public static void main(String[] args) {
		
		System.out.println("Primate dataType instance of Human:");
		System.out.println("-----------------------------------");
		
		Human human = new Human();
		human.walk();
		human.run();
		human.eat(null);
		human.speak();
		human.sleep();
		
		System.out.println();
		
		System.out.println("Primate dataType instance of Monkey:");
		System.out.println("------------------------------------");
		
		Monkey monkey = new Monkey();
		monkey.walk();
		monkey.run();
		monkey.sleep();
		monkey.eat(null);
		monkey.speak();

	}

}
