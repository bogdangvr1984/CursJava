package curs15;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		
		String[] myStringArray = {"Oana", "Ion", "Oana", "Ion", "Bogdan", "Ion", "Maria", "Oana"};

		for(int i = 0; i<myStringArray.length; i++) {
			
			for(int j=i+1; j<myStringArray.length; j++) {
				
				if(myStringArray[i].equals(myStringArray[j])) {
					System.out.println("Nume duplicat "+ myStringArray[i]);
				}
			}
		}
		
		System.out.println("---------------------");
		Set<String> duplicat = gasesteDuplicat(myStringArray);
		for(String nume : duplicat) {
			System.out.println("NUme duplicat "+ nume);
		}

		}
	
public static Set<String> gasesteDuplicat(String[] array){
	
	Set<String> numeDuplicat= new HashSet<>();
	
	for(int i = 0; i<array.length; i++) {
		
		for(int j=i+1; j<array.length; j++) {
			
			if(array[i].equals(array[j])) {
				
				numeDuplicat.add(array[i]);
			}
		}
	}
	
	
	return numeDuplicat;
	
}
}
