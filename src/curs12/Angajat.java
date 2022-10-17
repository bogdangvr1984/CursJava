package curs12;

public interface Angajat {
	
	public static final String salariu = "100";
	
	void setName(String name);
	String getName();
	
	void setEmail(String email);
	String getEmail();
	
	default void printDepartament() {
		System.out.println("QA");
	};

}
