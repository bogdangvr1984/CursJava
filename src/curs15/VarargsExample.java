package curs15;

public class VarargsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printCeva(1, "unu", "doi", "trei", "patru");
		printCeva(2);
		printCevaGeneric(12, "123", 'c');
		
		//executeScript("js script", buton, buton2);
		
	}
	
/*	public static void printCeva(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}*/
	
	public static void printCeva(int nr, String...values) {
		for(String x: values) {
			System.out.println(x);
		}
	}
	
	public static <T> void printCevaGeneric(T...values) {
		for(T x: values) {
			System.out.println(x);
		}
	}
}
