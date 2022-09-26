package curs4.tema4;

import java.util.Scanner;

public class DiscountFacturi {

	public static void main(String[] args) {
		
		
	   int factura;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu valoarea facturii:");
		factura = scan.nextInt();
		
		
	   int discount = factura>100?factura - (factura*10/100):factura - (factura*5/100);
	   
	   System.out.println("Discountul tau este :" + discount);

	}

}
