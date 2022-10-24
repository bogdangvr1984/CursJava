package curs5.tema5;

import java.util.Scanner;

public class Login {
	
	static String user;
	static int parola;
	
	Scanner scan = new Scanner(System.in);
	
	public void threeTries() {
      int i = 0;
		
		do {			
			i++;
			
			System.out.println("Enter a user :");
			String user = scan.next();
			System.out.println("Enter a password :");
			int parola = scan.nextInt();
			
			if (user.equals("TestUser") & parola == 1234){
				break;
				
			}else
			System.out.println("Login Error");
			//break;
			
		} while (i++ <= 3);
			
			//((user != "TestUser") & (parola != 1234 ) && i<=2);
		
		System.out.println("Maximum attempts reached. User blocked");
	}
	

	
	public static void main(String[] args) {
	
		Login obj = new Login();
		
	//	obj.insertUserAndPassword();
		obj.threeTries();
       System.out.println("Login successful");
	}

}
