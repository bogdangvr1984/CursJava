package curs7;

import java.util.Arrays;

public class TwoDimArray {

	public static void main(String[] args) {
		
		int[][] array = { {1, 2}, {3, 4}};
		
		System.out.println("array[0][1] : " + array[0][1] );
		
		/*
		 *                      column0    column1   column2
		 * textArray --> row 0   Brasov      Iasi      Bacau
		 * 
		 *               row 1   Berlin      Paris     Roma
		 * 
		 * 
		 */

		String[][] textArray = new String[2][3];
		textArray[0][0] = "Brasov";
		textArray[0][1] = "Iasi";
		textArray[0][2] = "Bacau";
		
		textArray[1][0] = "Berlin";
		textArray[1][1] = "Paris";
		textArray[1][2] = "Roma";

		int row = textArray.length;
		System.out.println(row);
		int column = textArray[0].length;
		 System.out.println(column);
		
	
		for(int i = 0; i<textArray.length; i++) {
			System.out.println(" ROW ");
			
			for(int j=0; j<textArray[0].length; j++ ) {
				
				System.out.println(" COLUMN " + textArray[i][j] );
			}
		
			System.out.println("--------------------------------");
			for(String[] rand : textArray) {
				System.out.println(" row " + Arrays.toString(rand));
				
			for(String coloana : rand) {
				System.out.println(coloana);
			}
			}
		}
		
	}

}
