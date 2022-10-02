package curs7.tema7;

public class Vocale {

	public static void main(String[] args) {
			
		String sentence = "Eu invat Java";
		System.out.println(sentence);
		sentence = sentence.toLowerCase();
		
		int count = 0;
		
		for (int i=0; i<sentence.length(); i++){
		/*	if (sentence.charAt(i) == 'a' 
				|| sentence.charAt(i) == 'e' 
				|| sentence.charAt(i) == 'i' 
				|| sentence.charAt(i) == 'o' 
				|| sentence.charAt(i) == 'u'
				&& sentence.charAt(i) != ' ');*/ {
		count++;
		
		 }

		}
		System.out.println("Vocale: " + count);

	}

}
