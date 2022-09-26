package curs6;

import java.util.Scanner;

public class SwtichExample {

	
	/*
	 * Intreb userul un calificativ
	 * In functie de calificativ printez urmatoarele mesaje;
	 * A--> Felicitari!
	 * B--> Destul de bine!
	 * C--> Sufictient!
	 * D--> Insuficient!
	 * Daca introduce alt calificativ in afara celor de mai sus: "Nota invalida!"
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("Te rog sa introduci un calificativ:");
		Scanner scan = new Scanner(System.in);
		String nota = scan.next();
		
		switch(nota.toUpperCase()) {
		
		case "A" :
			System.out.println("Felicitari!");
			break;
		case "B" :
			System.out.println("Destul de bine!");
			break;
		case "C" :
			System.out.println("Suficient!");
			break;
		case "D" :
			System.out.println("Insuficient!");
			break;
		default:
			System.out.println("Nota invalida!");
			
		}

	}

}
