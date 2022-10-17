package curs12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {

		ExceptionExample obj = new ExceptionExample();
		 obj.division();
	}
	
	public void division() {
		
		Scanner scan = new Scanner(System.in);
		int num1, num2, result;
		
		do {
			try {
			System.out.println("Please enter number 1:");
			try {
			num1 = Integer.parseInt(scan.next());
			}catch (NumberFormatException e) {
				System.out.println("Please enter only numeric values!");
				continue;
				
			}
			System.out.println("Please enter numbar 2:");
			try {
			num2 = Integer.parseInt(scan.next());
			
			}catch(NumberFormatException e) {
				System.out.println("Please enter only numeric values!");
				continue;
			}
			
			if(num1 ==0 || num2 ==0) {
				throw new ArithmeticException("One of the numbers is 0. Try again!");
			}
			result = num1/num2;
			System.out.println("Result :" + result);
			break;
			
			}catch(InputMismatchException  e) {
				System.out.println("Please enter only numeric values!");
				scan.reset();
			}
		}while(true);
	}

}
