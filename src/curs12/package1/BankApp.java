package curs12.package1;

import java.util.Scanner;

/*
 * Simulam o aplicatie bancara
 * putem retrage, depune si verifica soldul
 * Intrebam userul ce operatiune vrea sa faca
 * Daca userul introduce 0 sau o valoare negativa cand depunde vom arunca InvalidAmountException
 * Daca userul incearca sa scoata mai mult decat balanta aruncam InsuficentFundsException
 * il tinem in loop pana cand introduce valori corecte
 * il intrebam dupa ce face o operatiune daca vrea sa continue
 * implementam pentru un singur tip de cont (cont curent) dar pe viitor putem avea mai multe tipuri
 * cu aceleasi functionalitati
 * 
 */

/*
 * 1 clasa de exceptie InvalidAmountException
 * 1 clasa de exceptie InsuficentFundsException
 * 1 interfata pentru Account
 * 1 clasa pentru CurrentAccount
 * 1 clasa pentru BankApp
 * 
 */




public class BankApp {
	
	static boolean flag = true;
	
	public static void main(String[] args) throws InvalidAmountException, InsuficentFundsException {
		
		CurrentAccount acc = new CurrentAccount();
		BankApp app = new BankApp();
		acc.balance = 1000;
		
		do {
			try {
		   app.bankApp(acc);
		   flag = false;
		   
			}catch (InvalidAmountException e) {
				System.out.println(e.getMessage());
			}
		}while(flag);
	}
	
	public void bankApp(CurrentAccount account) throws InvalidAmountException, InsuficentFundsException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi, Available operations are: ");
		System.out.println("1 Deposit");
		System.out.println("2 Withdraw");
		System.out.println("3 Check balance");
		String option = scan.next();
		
		switch(option) {
		
		case "1" :
			System.out.println("Please enter deposit amount :");
			double amount = scan.nextDouble();
			account.deposit(amount);
			account.checkBalance();
			break;
		case "2" :
			System.out.println("Please enter withdraw amount :");
			double amount2 = scan.nextDouble();
			account.withdraw(amount2);
			account.checkBalance();
			break;
		case "3" :
			account.checkBalance();
			break;
		default:
			System.out.println("Invalid option");
			
		}
		
		System.out.println("Do you want to continue ?");
		String answer = scan.next();
		if(answer.equalsIgnoreCase("yes")) {
			flag = true;
			bankApp(account);			
		}
	}

}
