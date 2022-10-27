package curs15;

public class TestEmployee {

	public static void main(String[] args) {
		
		EmployeeUtils<Developer> dev = new EmployeeUtils<Developer>(new Developer("Ion", 500));
		EmployeeUtils<Manager> manager = new EmployeeUtils<Manager>(new Manager("Oana", 1500));
		
		//EmployeeUtils<Tester> tester = new EmployeeUtils<Tester>(new Tester("Oana", 1500));
		
		System.out.println(dev.getSalary());
		System.out.println(manager.getSalary());

		
		System.out.println(dev.isSalaryEqual(manager));
	}

}
