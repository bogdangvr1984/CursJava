package curs10;

public class Dulciuri {

	private String nume;
	private double pretVanzare;
	
	public Dulciuri(String nume) {
		this.nume = nume;
	}
	
	
	
	public double getPretVanzare() {
		return pretVanzare;
	}



	public void setPretVanzare(double pretVanzare) {
		this.pretVanzare = pretVanzare;
	}



	public double pret() {
		
		return pretVanzare*1.19;
	}
}
