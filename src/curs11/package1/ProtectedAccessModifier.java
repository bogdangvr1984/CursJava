package curs11.package1;

public class ProtectedAccessModifier {

	/*
	 * Scopul lui protected este in acelasi pachet si sub-clase din pachete diferite
	 * 
	 * Clasele NU pot fi declarate ca protected
	 * 
	 * Aceeasi clasa :yes
	 * 
	 * Alta clasa din acelasi pachet : yes
	 * 
	 * Subclasa in acelasi pachet : yes
	 * 
	 * Subclasa in alt pachet : yes
	 * 
	 * Alta clasa in alt pachet : no
	 * 
	 */
	
	protected  String mesaj = "Protected Accses";
	
	protected void prinMesaj() {
		System.out.println(mesaj);
	}
	
	public static void main(String[] args) {
		
		
	}
	
}
