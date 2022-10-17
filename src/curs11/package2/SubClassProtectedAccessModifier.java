package curs11.package2;

import curs11.package1.ProtectedAccessModifier;

public class SubClassProtectedAccessModifier extends ProtectedAccessModifier{
	
	//* Subclasa in alt pachet : yes
	
	public static void main(String[] args) {
		SubClassProtectedAccessModifier obj = new SubClassProtectedAccessModifier();
		obj.prinMesaj();
	}

}
