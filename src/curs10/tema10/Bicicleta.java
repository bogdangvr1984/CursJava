package curs10.tema10;

public class Bicicleta extends Vehicul{

	public Bicicleta(String brand, String nivelPoluare, int vitezaMedie) {
		super(brand, nivelPoluare, vitezaMedie);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String nume() {
		return "Pegas";
	}
	
	@Override
	public String motorizare() {
		return "inexistent";
	}
	

}
