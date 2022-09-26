package curs4.tema4;

import java.util.Scanner;

public class CalculPunctaj {

	public static void main(String[] args) {
		
		int punctaj;
		String calificativ;
		String rezultat;
		
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Introduceti punctajul obtinut :");
		punctaj = scan.nextInt();
		
		
		if(punctaj>=90) {
			calificativ="FB";
			//System.out.println("Ai primit : FoarteBine");
		} 
		else if(punctaj>=80) {
			calificativ="B";
			//System.out.println("Ai primit : Bine");
		} 
		else {
			calificativ="S";
			//System.out.println("Ai primit : Suficient");
		}
		rezultat = calificativ = "FB" != null ? "Ai primit : FoarteBine" : calificativ = "B" ?"Ai primit : Bine":"Ai primit : Suficient";
		System.out.println(rezultat);

	}

}
