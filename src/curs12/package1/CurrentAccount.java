package curs12.package1;

public class CurrentAccount implements Account{

	public double balance;
	@Override
	public void deposit(double amount) throws InvalidAmountException {
		
		if(amount <=0) {
			throw new InvalidAmountException(amount + " is not valid!");
		}
		balance = balance + amount;
		
	}

	@Override
	public void withdraw(double amount) throws InsuficentFundsException {
		if(balance <amount) {
			throw new InsuficentFundsException("You don't have sufficient funds!");
		}
		balance = balance - amount;
		
	}

	@Override
	public void checkBalance() {
		
		System.out.println("Current balance is :" + balance);
		
		
	}

}
