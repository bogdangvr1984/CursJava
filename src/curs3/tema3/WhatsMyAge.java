package curs3.tema3;

import java.util.Scanner;

public class WhatsMyAge {

	int varsta;
	
	public void askMeWhatsMyAge() {
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Introduceti varsta :");
		varsta = scan.nextInt();
	}
	
	public void compareAge() {
        if(varsta < 18) {
			
			System.out.println("Esti minor");
			
		}else if(varsta >= 18 && varsta <= 65) {
			
			System.out.println("Esti adult");

		}else if(varsta > 65) {
			
			System.out.println("Esti batran");

		}
    }
}
