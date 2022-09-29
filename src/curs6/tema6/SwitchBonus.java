package curs6.tema6;

import java.util.Scanner;

public class SwitchBonus {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti anii de vechime in firma :");
		int an = scan.nextInt();
		System.out.println("Introduceti valoarea vanzarilor efectuate :");
		int vanzari = scan.nextInt();
		System.out.println("Introduceti luna in care ati efectuat vanzarile :");
		int luna = scan.nextInt();
		
		int bonus = 0;
		
		switch(an) {
		
		case 1: bonus = 100;
		System.out.println("Primiti un bonus de " + bonus);
		     break;
		case 2: bonus = 200;
		System.out.println("Primiti un bonus de " + bonus);
		     break;
		case 3: 			
			if ((vanzari <= 5000) & luna!=0) {
				bonus = 600;
		System.out.println("Primiti un bonus de " + bonus);
			}
			else if ((vanzari <= 10000) & (luna >=1 & luna<=6)){
				bonus = 800;
		System.out.println("Primiti un bonus de " + bonus);
			}
			else if ((vanzari <= 10000) & (luna >=7 & luna<=11)){
				bonus = 1000;
		System.out.println("Primiti un bonus de " + bonus);
			}
			else if ((vanzari <= 10000) & luna==12){
				bonus = 900;
		System.out.println("Primiti un bonus de " + bonus);
		System.out.println("In decembrie se vand singure!");
			}
			else if (vanzari > 10000) {
				bonus = 1200;
		System.out.println("Primiti un bonus de " + bonus);
			}
			break;
		default:
			System.out.println("Te rog introdu o valoare valida!");
		}

	}

}
