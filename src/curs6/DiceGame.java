package curs6;

import java.util.Scanner;

public class DiceGame {

	/*
	 * Facem un joc de zaruri in care avem urmatoarele reguli:
	 * 1.daca userul da in total :2,6,12 --> Pierde jocul
	 * 2. daca userul da in total : 7,11 --> Castiga jocul
	 * 3. daca userul da in total : 3, 10  --> repeta aruncarea automat
	 * 4. daca da oricare alta varianta fata de cele de mai sus, il intrebam daca 
	 * vrea sa mai dea inca o data
	 * raspunsul trebuie sa fie un boolean : true sau false
	 * 
	 */
	
	public static void main(String[] args) {
		
		boolean condition = true;
		
	/*	double dice = Math.random()*6+1;
		System.out.println(dice);
		
		int dice2 = (int) (Math.random()*6+1);
		System.out.println(dice2);
	*/
		while(condition) {
			
			int dice = (int) (Math.random()*6+1);
			int dice2 = (int) (Math.random()*6+1);
			int total = dice + dice2;
			
			System.out.println("Ai dat: " + total);
			
			if(total == 2 || total == 6 || total ==12) {
				System.out.println("Imi pare rau! Ai dat: " + total + " Ai pierdut!");
				break;
			}
			else if(total == 7 || total ==11) {
				System.out.println("Felicitari! Ai dat: " + total + " Ai castigat!");
				break;
			}
			else if(total == 3 || total == 10) {
				System.out.println("Ai dat: " + total + " Automat mai dai odata!");	
				continue;
		}
			else {
				System.out.println("Mai vrei sa dai odata ?");
				Scanner scan = new Scanner(System.in);
				condition = scan.nextBoolean();
			}
			
			
	}
		System.out.println("Game over");
		
}
	
}
