package curs7;

public class FindIndexOfElementInArray {

	/*
	 * Avem un array
	 * ne trebuie o metode pentru a afla care este indexul unui element
	 * printam care este elementul si indexul
	 * rezolvam cu FOR
	 * rezolvam cu FOR EACH
	 * rezolvam cu WHILE
	 * rezolvam cu DO WHILE
	 * 
	 * Ex de raspuns: index pentru element 5 este 3
	 *  
	 */
	
	static int[] numbers = {3, 5, 7, 8, 9, 2};
	
	public static void main(String[] args) {
		System.out.println("--------FOR--------");
		rezolvareCuFor(5);
		System.out.println("--------FOR EACH--------");
		rezolvareCuForEach(8);
		System.out.println("--------WHILE--------");
		rezolvareCuWhile(5);
		System.out.println("--------DO WHILE--------");
		rezolvareCuDoWhile(5);

	}
	
	public static void rezolvareCuFor(int element) {
		
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i] == element) {
				System.out.println(" Index pentru element " + element + " este : " + i);
			}
		}
	}
	
	public static void rezolvareCuForEach(int element) {
		int i = 0;
		for(int nr: numbers) {
			
			if(nr == element) {
				System.out.println(" Index pentru element " + element + " este : " + i);
			}
			i++;
		}
	}
	
	public static void rezolvareCuWhile(int element) {
		
		int i = 0;
		
		while(i<numbers.length) {
			if(numbers[i] == element) {
				System.out.println(" Index pentru element " + element + " este : " + i);
			}
			i++;
		}
	}
	
	public static void rezolvareCuDoWhile(int element) {
		
		int i = 0;
		
		do {
			if(numbers[i] == element) {
				System.out.println(" Index pentru element " + element + " este : " + i);
			}
			i++;
		}while(i<numbers.length);
		
		}
	}


