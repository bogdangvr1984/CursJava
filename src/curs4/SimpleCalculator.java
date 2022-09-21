package curs4;

import java.util.Scanner;

/*
 * Facem un calculator simplu pentru operatiile de baza : +(adunare), -(scadere), *(inmultire , /(impartire))
 * Intrebam userul primul numar
 * Intrebam operatorul pe care vrem sa il folosim
 * intrebam userul numarul doi
 * printam rezultatul : Ex: 2 + 2 = 4 
 * 
 */

	//   masina.charAt(0) == m   
	//   012345
   // 2x2 = 
	//   || --> OR  |
	//    && --> AND



public class SimpleCalculator {
	
	int number1;
	int number2;
	char operator;
	int result;
	
	public void askTheUser() {
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Please enter the first number:");
		number1 = scan.nextInt();
		System.out.println("Please enter the operator :");
		operator = scan.next().charAt(0);
		System.out.println("Please enter the second number :");
		number2 = scan.nextInt();
	}
	
	
	public void calculateValues() {
		
		askTheUser();
		
		if(operator == '+') {
			
			result = number1 + number2;
			printResult();
			
		}else if(operator == '-') {
			
			result = number1 - number2;
			printResult();

		}else if(operator == '*' || operator == 'x') {
			
			result = number1 * number2;
			printResult();

		}else if (operator == '/' || operator == ':') {
			
			result = number1/number2;
			printResult();

		}else {
			System.out.println("Wrong operation! Please insert only : '+', '-', '*', '/'");
		}
		
	}
	
	 public void printResult() {
		 
			System.out.println(number1 + " " + operator + " " + number2 + " = " + result );	

	 }
	
	

}
