package curs4;

public class IncrementDecrementExample {

	public static void main(String[] args) {

		
		// num++  --> post increment --> num++ = num +1
		// ++num  --> pre increment
		
		// num--  --> post decrement
		//--num   --> pre decrement
		
		System.out.println("---------- POST----------------");
		int num = 10;
		System.out.println("Valoarea lui num inainte de icrement :" + num);
		System.out.println("Valoarea lui num in POST incremenet " + num++);//dupa executie face increment
		System.out.println("Valoarea lui num dupa icrement " + num );
		
		System.out.println("---------- PRE----------------");
		int num2 = 10;
		System.out.println("Valoarea lui num inainte de icrement :" + num2);
		System.out.println("Valoarea lui num in PRE incremenet " + ++num2);
		System.out.println("Valoarea lui num dupa icrement " + num2 );
		
		
		System.out.println("---------- POST----------------");
		int num3 = 10;
		System.out.println("Valoarea lui num inainte de decrement :" + num3);
		System.out.println("Valoarea lui num in POST decremenet " + num3--);//dupa executie face increment
		System.out.println("Valoarea lui num dupa decrement " + num3 );
		
		System.out.println("---------- PRE----------------");
		int num4 = 10;
		System.out.println("Valoarea lui num inainte de decrement :" + num4);
		System.out.println("Valoarea lui num in PRE decremenet " + --num4);
		System.out.println("Valoarea lui num dupa decrement " + num4 );
		
		
	}

}
