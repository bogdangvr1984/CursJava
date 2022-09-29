package curs7;

public class ForEachExample {

	public static void main(String[] args) {
		
		String[] orase = {"Iasi", "Cluj", "Brasov", "Bucuresti", "Timisoara"};
		
		for(int i = 0; i<orase.length; i++) {
			
			System.out.println(orase[i]);
		}
		System.out.println("----------------");
		
		for(String elem : orase) {
			
			System.out.println(elem);
			
		}

	}

}
