package curs3;

import java.util.Scanner;

//  CamelCase
//  UpperCamelCase --> numele claselor
//  lowerCamelCase --> metode



public class CheckOddOrEven {
	
	/* Facem un program care intreba userul un numar
	 * si verifica daca acel numar este par sau impar
	 * Printam in consola rezultatul
	 */
	
	int number;
	
	public void askTheUserForNumber() {
		
		System.out.println("Please enter a number :");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		scan.close();
				
	}
	
	public void checkIfNumberIsOddOrEven() {
		
		if(number % 2 == 0) {
			
			System.out.println(number + " : is even!");
			
		}else {
			
			System.out.println(number + " : is odd!");

		}
	}
	
	
	
	

}
