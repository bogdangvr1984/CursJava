package curs3;

public class StaticVsNonStatic {

	//Instance area
	public String nume = "Jhonny";
	
	public String printeazaNume() {
		return "Hello " + prenume;
	}
	
	//end of instance area
	
	
	//static area
	public static String prenume = "Bravo";
	
	public static String printeazaMesajStatic() {
		
		return "Hello static " + prenume;
	}
	
	//end of static area
	

	public static void main(String[] args) {
		
		StaticVsNonStatic obj = new StaticVsNonStatic();
		System.out.println(obj.nume);
		System.out.println(obj.printeazaNume());
		
		System.out.println(prenume);
		System.out.println(printeazaMesajStatic());

	}

}
