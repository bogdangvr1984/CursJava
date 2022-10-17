package curs10;

public class Jeleuri extends Dulciuri {
	
	private double pretPeKg;
	private double cantitate;

	public Jeleuri(String nume, double pretPeKg, double cantitate) {
		super(nume);
		this.pretPeKg = pretPeKg;
		this.cantitate = cantitate;
	}

	@Override
	public double pret() {
		return pretPeKg/cantitate*1.19;
	}
}
