package curs11.package1;

class DefaultAccessModifier {
	
	/*
	 * Default inseamna atunci cand nu specificam nimic
	 * Scopul este limitat la pachetul in care se afla
	 * 
	 * Same class : yes
	 * Sub class same package : yes
	 * Other class same package : yes
	 * 
	 * Subt class other package : no
	 * Other class other package : no
	 * 
	 * 
	 */
	
	String mesaj = "Default access modifier";
	
	void prinMesaj() {
		System.out.println(mesaj);
	}
	
	public static void main(String[] args) {
		DefaultAccessModifier obj = new DefaultAccessModifier();
		obj.prinMesaj();
	}

}
