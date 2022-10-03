package curs7.tema7;

public class NumeDuplicate {
	
	static String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion"};

	public static void main(String[] args) {
		
		for(int i=0; i<myStringArray.length; i++) {
			for(int j = i + 1; j<myStringArray.length; j++) {
			if(myStringArray[i] == myStringArray[j]) {
				System.out.println("Nume duplicat " + myStringArray[j]);
			}

       	}

     }

   }
}