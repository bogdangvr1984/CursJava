package curs5;

import java.util.Scanner;

public class WhileExample2 {
	
	/*
	 * facem un program care calculeaza salariul pe o saptamana
	 * intrebam utilizatorul cate ore a lucrat
	 * calcum daca a lucrat maxim 40 de ore sau minim 1 ora
	 * daca introduce un numar invalid de ore il rugam sa introduca din nou
	 * pana introduce un numar valid
	 * rate per hour = 15
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu cate ore ai lucrat :");
		
		int oreLucrate = scan.nextInt();
		
		while(oreLucrate <1 || oreLucrate >40) {
			System.out.println("nr de ore invalid");
			System.out.println("Introdu un numar intr 1 si 40");
			oreLucrate = scan.nextInt();
		}
		System.out.println("Salariul tau teste :" + oreLucrate*15);
		

	}

}
