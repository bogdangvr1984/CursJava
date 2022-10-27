package curs15;

import java.util.Scanner;

/*
 * Avem nevoie de o clasa care sa contina inca de la initializare o serie de coduri postale 
 * si orasele asociate cu acele coduri(6 orase)
 * Avem nevoie de o functionalitate in care sa caut pe baza unui cod postal si sa imi intoarca orasul
 * Daca codul postal nu exista vreau sa arunc o exceptie CodPostalException
 * Daca codul exista vreau sa printez orasul care are acel cod postal
 * In cazul exceptiei vreau sa intreb din nou pana primesc un cod postal corect
 * 
 * ne trebuie un map pentru cod postal :oras
 * 
 * 
 */


public class SearchPostalCode {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		CoduriPostale codPostal = new CoduriPostale();
		
		String oras = "";
		
		while(oras.equals("")) {
			System.out.println("Introdu un cod postal :");
			int codPost = scan.nextInt();
			try {
			
				oras = codPostal.gasesteOras(codPost);
				System.out.println("Orasul asociat codului " + codPost + " este :"+ oras);
			break;
			
			}catch (CodPostalException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	

}
