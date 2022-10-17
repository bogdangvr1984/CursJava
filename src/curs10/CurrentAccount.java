package curs10;

public class CurrentAccount extends Account{

	public double overdraftLimit;
	public double overdraftFee;
	public boolean isOverDraft;
	
	public CurrentAccount(Customer owner, double balance, int accountNumber) {
		super(owner, balance, accountNumber);
		this.overdraftLimit = 1500;
		this.overdraftFee = 30.0;
		this.isOverDraft = true;
	}	
	
	@Override
	public void withdraw(double amount) {
		if(amount <= balance + overdraftLimit) {
			
			balance = balance - amount;
			
			if(isOverDraft) {
				balance = balance - overdraftFee;
			}
			
		}else {
			System.out.println("Insuficient funds!");
		}
	}

}
