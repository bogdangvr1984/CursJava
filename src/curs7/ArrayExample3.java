package curs7;

public class ArrayExample3 {

	public static void main(String[] args) {
		
		Fructe mar = new Fructe("Mar", 45);
		mar.printDetails();
		
		Fructe[] fructeArray = new Fructe[4];
		//Fructe[] fructeArray = {null, null, null, null};
		fructeArray[0] = mar;
		//Fructe[] fructeArray = {mar, null, null, null};
		fructeArray[1] = new Fructe("Para", 30);
		//Fructe[] fructeArray = {mar, fruct[1], null, null};
		
		System.out.println(mar);
		System.out.println(fructeArray[0]);
		
		mar.printDetails();
		fructeArray[0].printDetails();
		
		fructeArray[1] = new Fructe("Para", 30);
		fructeArray[2] = new Fructe("Pruna", 15);
		fructeArray[3] = new Fructe("Cireasa", 5);
		
		fructeArray[1].printDetails();
		
		for(Fructe obj : fructeArray) {
			obj.printDetails();
		}
		
	}

}
