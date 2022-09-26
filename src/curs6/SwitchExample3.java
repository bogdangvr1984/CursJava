package curs6;

import java.util.Scanner;

public class SwitchExample3 {
/*
 * Facem un program care cere de la tastatura un an si o luna
 * si printeaza cate zile are luna respectiva
 * 
 * 
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog sa introduci un an :");
		int an = scan.nextInt();
		System.out.println("Te rog sa introduci o luna :");
		int luna = scan.nextInt();
		
		int days = 0;
		
		switch(luna) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: days = 31;
			 break;
			case 4:
			case 6:
			case 9:
			case 11: days = 30;
			 break;
			case 2:
				if((an%4==0)&&(an%100 !=0) || an%400 ==0) {
					days = 29;
				}else {
					days = 28;
				}
				break;
			default:
				System.out.println("Te rog introdu o valoare valida!");
		}
		
		System.out.println("Luna aleasa de tine are :" + days);

	}

}
