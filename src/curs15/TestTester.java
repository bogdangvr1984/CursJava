package curs15;

public class TestTester {

	public static <T> void main(String[] args) {
		
		Tester t1 = new Tester(22);
		
		t1.printAge();
		
		Tester<T> t2 = new Tester("22");
		t2.printAge();

	}

}
