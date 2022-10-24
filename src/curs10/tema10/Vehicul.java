package curs10.tema10;

public class Vehicul {
	
	private String brand;
	private String nivelPoluare;
	private int vitezaMedie;
	
/*	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getNivelPoluare() {
		return nivelPoluare;
	}
	public void setNivelPoluare(String nivelPoluare) {
		this.nivelPoluare = nivelPoluare;
	}
	public int getVitezaMedie() {
		return vitezaMedie;
	}
	public void setVitezaMedie(int vitezaMedie) {
		this.vitezaMedie = vitezaMedie;
	}
	*/
	
	public Vehicul(String brand, String nivelPoluare, int vitezaMedie) {
		this.brand = brand;
		this.nivelPoluare = nivelPoluare;
		this.vitezaMedie = vitezaMedie;
	}
	
	
	public String nume()
	{
		return brand;
		
	}
	
	public String motorizare() {
		return nivelPoluare;
		
	}
	
	public void detaliiVehicul() {
		
		System.out.println("Nivelul de poluare pentru masina " + brand + " este :" + nivelPoluare + " si viteza medie atinsa este de " + vitezaMedie + " km/h");
	}
	

}
