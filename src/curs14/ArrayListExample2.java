package curs14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("zero", "unu", "doi", "trei", "patru"));

		System.out.println(list.size());
		list.add("cinci");
		
		for(String nr : list) {
			System.out.println(nr);
		}
		
		System.out.println("---------------------");
		
		//remove range
		list.subList(1, 4).clear();
		
		System.out.println(list);
		
		//contains
		String element = "opt";
		if(list.contains(element)) {
			System.out.println(element +  " se afla in lista!");
		}else {
			System.out.println(element +  " NU se afla in lista!");

		}
		
		System.out.println("---------------------------------");
		
		//update
		System.out.println("Before update :" + list);
		
		list.set(0, "noua");
		
		System.out.println("After update :" + list);

	}

}
