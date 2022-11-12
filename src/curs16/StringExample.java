package curs16;

public class StringExample {

	
	public static void main(String[] args) {
		
		transformToString();
		
	}
	
	
	public static void transformToString() {
		
		char ch = 'a';
		String chStr = Character.toString(ch);
		String chStr2 = String.valueOf(ch);
		
		System.out.println(chStr.getClass());
		System.out.println(chStr2.getClass());
		
		System.out.println("---------------------");
		
		boolean bol = true;
		String bolStr = Boolean.toString(bol);
		String bolStr2 = String.valueOf(bol);
		
		System.out.println(bolStr.getClass());
		System.out.println(bolStr2.getClass());
		
		
	}
}
