package curs10;

public class SavingsAccount extends Account {

	public double interestRate;
	public double unpaidInterest;
	
	public SavingsAccount(Customer owner, double balance, int accountNumber) {
		super(owner, balance, accountNumber);
		this.unpaidInterest = 100;
		this.interestRate = 0.05;
				
	}

	public double calculateInterest() {
		return getBalance() * interestRate;
	}
	
	public void payInterest(double interest) {
		
		deposit(interest);
		
	}
}
