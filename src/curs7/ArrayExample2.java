package curs7;

import java.util.Random;

public class ArrayExample2 {

	/*
	 * Facem un program care genereaza 6 numere intre 0 si 9
	 *numerele le va tine intr-un array
	 *nu tine numere duplicate
	 *printeaza array-ul 
	 * 
	 * 
	 * 
	 * o metoda care genereaza nr si le pune intr-un array
	 * o metoda care nu permite duplicat
	 * o metoda care printeaza array-ul //Arrays.toString(array)
	 */
	
	//ce stim
	
	public final int LENGTH = 6;
	public final int MAX_NUMBERS = 9;
	
	
	public int[] generateNumbers() {
		
		int[] numbers = new int[LENGTH];
		Random random = new Random();
		
		for(int i=0; i<LENGTH; i++) {
			int randomNR = 0;
			
			do {
				randomNR = random.nextInt(MAX_NUMBERS);
				
			}while(checkDuplicateNumber(numbers, randomNR));
			
			
						
			numbers[i] = randomNR;
		}
		
		
		return numbers;
	}
	
	
 public boolean checkDuplicateNumber(int[] array, int nr) {
		 
		 for(int number: array) {
			 
			 if(number == nr) {
				 return true;
			 }
		 }
		 return false;
	 }
	
	public void printArray(int[] array) {
		
		for(int nr : array) {
			System.out.print(nr + " | ");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		ArrayExample2 obj = new ArrayExample2();
		
		obj.printArray(obj.generateNumbers());

	}

}
