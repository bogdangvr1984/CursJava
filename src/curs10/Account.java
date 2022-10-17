package curs10;

public class Account {
	
	public int accountNumber;
	public double balance;
	public Customer owner;
	
	public Account(Customer owner, double balance, int accountNumber) {
		this.owner = owner;
		this.balance = balance;
		this.accountNumber = accountNumber;
		
	}
	
	public double getBalance() {
		return this.balance;
		
	}

	public void deposit(double amount) {
		if(amount <=0) {
			System.out.println("Invalid amount");
		}else {
		
		balance = balance + amount;
		System.out.println("Ai depus " + amount + " noua balanta este " + getBalance());
		}
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("Insuficient funds!");
		}else {
		
		balance = balance - amount;
		}
	}
}
