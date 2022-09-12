package curs2;

public class WageCalculator {

	int nrOfHoursWorked = 40;
	
	public static void main(String[] args) {
	
		Tester tester1 = new Tester();
		//tester1.nume = "Ion";
		tester1.setNume("Ion");
		tester1.setRatePerHour(45);
		
		
		Tester tester2 = new Tester();
		tester2.setNume("Oana");
		tester2.setRatePerHour(25);
		
		System.out.println(tester1.getNume());
		System.out.println(tester2.getNume());

		tester1.printeazaNume();
		
		WageCalculator obj = new WageCalculator();
		
		System.out.println("Salariul lui"+ tester1.getNume() + " este :" +obj.calculateSalary(tester1.getRatePerHour()));
		
		System.out.println("Salariul lui"+ tester2.getNume() + " este :" +obj.calculateSalary(tester2.getRatePerHour()));
	}

	public int calculateSalary(int rateHourly) {
		
		//int salary = rateHourly * nrOfHoursWorked;
		
		return rateHourly * nrOfHoursWorked;
	}
}
