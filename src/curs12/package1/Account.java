package curs12.package1;

public interface Account {
	
	public void deposit(double amount) throws InvalidAmountException;
	public void withdraw(double amount) throws InsuficentFundsException;
	public void checkBalance();

}
