package curs13.tema13;

import java.util.Scanner;

public class TestVegetableCalories {

	public static void main(String[] args) {
		
		VegetableCalories veggie = new VegetableCalories();
		veggie.writePropertiesFile();
		
		
		
		Scanner scan = new Scanner(System.in);
	
		
	//	while(key.equals(calorie)) {
			
			System.out.println("Ce leguma doriti sa cumparati?");
			String key = scan.next();
			veggie.readPropertiesFile(key);
			
			
	/*		try {
			
				//oras = codPostal.gasesteOras(codPost);
			//	System.out.println("Orasul asociat codului " + codPost + " este :"+ oras);
			break;
			
			}catch (CodPostalException e) {
				e.printStackTrace();
			}
		
		*/
		
		
	//	System.out.println(veggie.readPropertiesFile(key));
		}
	
	}
