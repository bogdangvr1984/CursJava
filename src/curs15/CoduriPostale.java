package curs15;
import java.util.HashMap;
import java.util.Map;

public class CoduriPostale {
	
	Map<Integer, String> cp;
	
	public CoduriPostale() {
		
		cp = new HashMap<Integer, String>();
		cp.put(407, "Cluj");
		cp.put(117, "Arges");
		cp.put(707, "Iasi");
		cp.put(127, "Buzau");
		cp.put(517, "Alba");
		cp.put(327, "Caras-Severin");
		
		
	}
	
	public String gasesteOras(int codPostal) throws CodPostalException {
		
		if(cp.containsKey(codPostal)) {
			
			//String oras = cp.get(codPostal);
			//return oras;
			return cp.get(codPostal);
			
			
		}else {
			
			throw new CodPostalException("Codul postal nu exista!");
		}
		
	}

}
