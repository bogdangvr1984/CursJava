package curs6;

public class BreakContinue {

	public static void main(String[] args) {
		
		for(int i =0; i<10; i++) {
			
			if(i==4) {
				continue;
				//break;
			}
			
			System.out.println(i);
		}

	}

}