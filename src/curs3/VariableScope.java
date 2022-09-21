package curs3;

public class VariableScope {

//instance variables
	public String prenume;
	
//local variables
	
//static varibles	
	
	
	
	public  void main(String[] args) {
		prenume = "da";
	}
	
	
	public void printeazaSalut(String nume) {	
		int age = 2;
		System.out.println("Salut " + nume + prenume);	
	}
	

}
