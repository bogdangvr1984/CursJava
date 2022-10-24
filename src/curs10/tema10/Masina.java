package curs10.tema10;

public class Masina extends Vehicul {

	public Masina(String brand, String nivelPoluare, int vitezaMedie) {
		super(brand, nivelPoluare, vitezaMedie);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String nume() {
		return "Dacia";
	}
	
	@Override
	public String motorizare() {
		return "Euro 5";
	}
}
