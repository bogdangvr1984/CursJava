package curs4;

public class LogicalExample {

	public static void main(String[] args) {
		/*
		 *  && --> AND --> short circuit
		 * (x!=0) && (1/x>5) -->evalueaza (x!=0) si daca asta este true evalueaza condita (1/x>5)
		 *  
		 *  & --> AND
		 *  (x!=0) & (1/x>5)--> evalueaza (x!=0) dupa evalueaza (1/x>5)
		 * 
		 *  || --> se aplica acelasi reguli ca la AND
		 *  
		 *  | --> la fel ca mai sus la &
		 * 
		 */
		
		int x  = 0;
		
		if( (x!=0) & (1/x>5)  ) {
			
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		
		
	}

}
