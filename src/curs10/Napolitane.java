package curs10;

public class Napolitane extends Dulciuri{

	
	private double pretPeCutie;
	private double cantitate;
	
	public Napolitane(String nume, double pretPeCutie, double cantitate) {
		super(nume);
		this.pretPeCutie = pretPeCutie;
		this.cantitate = cantitate;
	}
	
	
	@Override
	public double pret() {
		
		return pretPeCutie*cantitate*1.19;
	}

}
