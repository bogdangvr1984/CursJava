package curs3;

import java.util.Scanner;

public class GreatesOfThreeNumbers {
	
	/*
	 * Facem un program in care intrebam utilizatorul 3 numere
	 * Verificam care dintre cele 3 este cel mai mare
	 * si printam corespunzator
	 * Daca din cele 3 numere 2 sunt egale si sunt cele mai mari
	 * printam : Some numbers are equal
	 * Ex: The first is the greatest!
	 * 
	 */
	//int number1, number2, number3;
	int number1;
	int number2;
	int number3;
	
	public void askTheUserForThreeNumbers() {
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Please enter first number :");
		number1 = scan.nextInt();
		System.out.println("Please enter second number :");
		number2 = scan.nextInt();
		System.out.println("Please enter third number :");
		number3 = scan.nextInt();
		
	}
	
	public void compareThreeNumbers() {
		
		if(number1 >number2 && number1 > number3 ) {
			
			System.out.println("The first number is the greatest!");
			
		}else if(number2 > number1 && number2 > number3) {
			
			System.out.println("The second number is the greatest!");

		}else if(number3 > number1 && number3 > number2) {
			
			System.out.println("The third number is the greatest!");

		}else {
			System.out.println("Some numbers are equal!");
		}
		
		
		
	}
	
	

}
