package curs7.tema7;

import java.util.Scanner;

public class Suma {
	

	public static void main(String[] args) {

		int[] numbersArray = new int[10];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu 10 numere:");
		
		int sum = 0;
		
		 for(int i=0; i<10; i++){
	         numbersArray[i] = scan.nextInt();
	         sum = sum + numbersArray[i];
		 }
		 		
		 System.out.println("Suma numereleor din array este :"+sum);

	}

}
