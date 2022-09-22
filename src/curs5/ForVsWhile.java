package curs5;

import java.util.Scanner;

public class ForVsWhile {
	
	/*
	 * facem un program care iis cere userului numere incontinuu
	 * le inmulteste cu 10
	 * pana cand userul introduce 0
	 * Daca a introdus 0 -- facem exit din loop
	 * 
	 */

	public static void main(String[] args) {
		
		rezolvareCuFor();
	
	}
	public static void rezolvareCuFor() {
		
		System.out.println("Please enter a number :");
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
			int nr = scan.nextInt();
			if(nr ==0) {
				break;
			}
			System.out.println("Please enter a number :");
			System.out.println(nr*10);
		}
		System.out.println("Exit!");
	}
	
	public static void recolvareCuFor2(){
		System.out.println("Please enter a number :");
		Scanner scan = new Scanner(System.in);
		
		for (int nr = scan.nextInt(); nr!=0; nr=scan.nextInt()) {
			
		}
			
		}
	
	public static void rezolvareCuWhile() {
		System.out.println("Please enter a number :");
		Scanner scan = new Scanner(System.in);
		
		int nr = scan.nextInt();
		while(nr!=0) {
			nr*=10;
			System.out.println(nr);
			System.out.println("Please enter a number :");
			nr = scan.nextInt();
			}
	}
}

