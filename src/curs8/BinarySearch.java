package curs8;

import java.util.Arrays;

public class BinarySearch {
	
	static int[] array = {2, 5, 7, 8, 9, 1, 3, 11, 50, 99, 87, 67, 54, 32};

	public static void main(String[] args) {
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
	    int index =	Arrays.binarySearch(array, 50);
		System.out.println("Elementul se afla la index :" + index);
		
		System.out.println("---------------------");
		
		System.out.println(Arrays.toString(array));
		searchBinary(array, 50);
		
	}
	
	
	public static void searchBinary(int[] array, int searchValue) {
		
		//luam indexul de start
		int first = 0;
		//luam indexul de final
		int last = array.length-1;
		//luam mijlocul arrayului
		int middle = (first+last)/2;
		
		while(first<=last) {
			
			if(array[middle] < searchValue) {
				first = middle +1;
			}else if(array[middle] == searchValue) {
				System.out.println("Elementul se afla la index :" + middle);
				break;
			}else {
				last = middle -1;
			}
			middle = (first+last)/2;
		}
		if(first>last) {
			System.out.println("Elementul nu a fost gasit");
		}
	}

}
