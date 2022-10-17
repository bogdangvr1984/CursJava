package curs12;

public class TestInterface {

	public static void main(String[] args) {
		
		//Angajat angajat = new Angajat();
		
		Tester t1 = new Tester();
		t1.setName("Oana");
		t1.setEmail("oana@oana.com");
		t1.printDepartament();
		
		Developer dev = new Developer();
		dev.setName("Ioana");
		dev.setEmail("ioana@oana.com");
		dev.printDepartament();
		

	}

}
