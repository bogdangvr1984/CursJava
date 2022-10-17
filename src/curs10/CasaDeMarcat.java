package curs10;

/*
 * Produse de tip dulciuri
 * Nume produs
 * Pret de vanzare + tva
 * Stim ca unele produse se vand la bucata
 * Stim ca altele se vand la kg
 * Si altele se vand la bax 
 * 
 */

public class CasaDeMarcat {
	
	public int nrItem = 0;
	public static Dulciuri[] produseDulce = new Dulciuri[3];
	
	
	public void enterItems(Dulciuri produs) {
		produseDulce[nrItem] = produs;
		nrItem++;
	}
	
	public double costTotal() {
		double sum = 0;
		
		for(Dulciuri produs : produseDulce) {
			sum = sum + produs.pret();
			//sum += produs.pret();
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		CasaDeMarcat casaMarcat = new CasaDeMarcat();
		
		casaMarcat.enterItems(new Inghetata("Napoca", 8));
		casaMarcat.enterItems(new Jeleuri("Haribo", 500, 0.250));
		casaMarcat.enterItems(new Napolitane("Joe", 12, 4));
		
		System.out.println("Ai un total de :" + produseDulce.length + " produse!");
		System.out.println("Ai de platit :" + casaMarcat.costTotal() + " lei");
	}

}
