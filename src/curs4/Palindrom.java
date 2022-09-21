package curs4;

public class Palindrom {

	public static void main(String[] args) {

		
		checkIfWordIsPalindrome("masina");
		
		
	}

	//radar
	//masina
	
	//         01234 
	//cuvant = radar --> radar.lenght() = 5
    //cuvantIntors = ""
	//cuvantIntors = cuvat.charAt(4)
	//cuvantIntors = cuvantIntors + "r"
	//cuvantIntors = cuvantIntors + cuvat.charAt(3)
	//cuvantIntors = "ra"
	//cuvantIntors = cuvantIntors + cuvat.charAt(2)
	//cuvantIntors = "rad"
	//....
	//cuvant.equals(cuvantIntors) 
	
	public static void checkIfWordIsPalindrome(String cuvant) {
		
		String cuvantIntors = "";
		
		for(int i=cuvant.length()-1; i>=0; i--) {
			
			cuvantIntors = cuvantIntors + cuvant.charAt(i);	
			
		}
		
		System.out.println("Cuvant original :" + cuvant);
		System.out.println("Cuvant intors :" + cuvantIntors);

		
		if(cuvant.equals(cuvantIntors)) {
			System.out.println("Cuvantul este palindorm");
		}else {
			System.out.println("Cuvantul NU este palindorm");

		}
		
		
	}
	
}
