package curs4;

import java.util.Scanner;

public class ConditionalOperator {

	/*
	 * Program care citeste 2 numere de la tastatura si verifica urmatoarele:
	 * daca fiecare dintre numere este pozitiv
	 * daca ambele numere sunt pozitive
	 * care dintre cele 2 numere este cel mai mic
	 *  
	 */
	
	
	public static void main(String[] args) {

		int num1;
		int num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number:");
		num1 =  scan.nextInt();
		
		System.out.println("Please enter second number:");
		num2 =  scan.nextInt();
		
		
		//verificam daca primul numar este pozitiv
		if(num1>0) {
			System.out.println("Num1 is pozitiv");
		}else {
			System.out.println("Num1 is negativ");
		}
		//result =  conditie?expersie1:expresie2;
		String result = num1>0 ? "Num1 is pozitiv" :"Num1 is negativ";
		System.out.println("TR " +result);
		
		
		//verificam daca al doilea numar este pozitiv
		if(num2>0) {
			System.out.println("Num2 is pozitiv");
		}else {
			System.out.println("Num2 is negativ");
		}
		result = num2>0 ? "Num2 is pozitiv":"Num2 is negativ";
		System.out.println("TR " +result);

		
		//verificam daca ambele numere sunt pozitive
		if(num1>0 && num2>0) {
			System.out.println("Numbers are positive");
		}else {
			System.out.println("Numbers are negative");
		}
		result = (num1>0 && num2>0) ? "Numbers are positive": "Numbers are negative";
		System.out.println("TR " +result);

		
		//verificam care este mai mare (ar putea fi egale)
		if(num1>num2) {
			System.out.println("Num2 is the smallest");
		}else if(num2>num1) {
			System.out.println("Num1 is the smallest");
		}else {
			System.out.println("Numbers are equal");
		}
		result = (num1>num2) ? "Num2 is the smallest" :(num2>num1)?"Num1 is the smallest":"Numbers are equal";
		System.out.println("TR " +result);

	
	}

}
