package curs5.tema5;

import java.util.Scanner;

public class Login {
	
	String user;
	int parola;
	
	public void insertUserAndPassword() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a user :");
		String user = scan.next();
		System.out.println("Enter a password :");
		int parola = scan.nextInt();
	}

	public static void main(String[] args) {
	
		
		int i = 0;
		
		do {
			System.out.println("Login Error");
			//i++;
		} while((user != "TestUser") & (parola != 1234 ));

	}

}
