package curs10;

/*
 * Simuleaza lucrul unui client cu conturile sale
 * Customer
 * Cont curent
 * Cont de economii
 * --pot sa fac depozit
 * --pot sa scot bani
 * 
 */

public class BankApp {
	
	public static void main(String[] args) {
		
		Customer owner = new Customer("Oana", "Iasi", "oana@oana.ro");
		
		SavingsAccount sva = new SavingsAccount(owner, 500, 12345);
		System.out.println(sva.getBalance());
		sva.payInterest(sva.calculateInterest());
		System.out.println(sva.getBalance());
		
		sva.deposit(400);
		
		
		System.out.println("--------------------");
		CurrentAccount ca = new CurrentAccount(owner, 250, 54321);
		System.out.println(ca.getBalance());
		
		ca.deposit(100);
	}

}
