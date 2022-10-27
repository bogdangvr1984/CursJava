package curs15;

public class GenericsExample {

	public static void main(String[] args) {
		
         printCeva("text");
         
         printGeneric("Text");
         printGeneric(123);
         printGeneric('x');
        // System.out.println("text");
        // System.out.println(123);
	}
	
	public static <T> void printGeneric(T obj) {
		System.out.println(obj);
		System.out.println("Data type-ul obiectului meu este " + obj.getClass().getName());
	}
	
	public static void printCeva(String text) {
		System.out.println(text);
	}

}
