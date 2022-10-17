package curs11.package1;

public class PrivateAccessModifier {
	
	/*
	 * Scopul lui este limitat la clas in care se afla
	 * 
	 * Same class : yes
	 * 
	 * Subclass same packge : no
	 * Other class same package : no
	 * Subclasa other package : no
	 * Other class other package: no 
	 * 
	 */
	
	private PrivateAccessModifier() {}
	
	
	
	private String mesaj = "Private Access";
	

}
