package curs14;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		System.out.println(list.size());
		
		
		//add elements
		
		list.add("Oana");
		list.add("Ion");
		list.add("Gabriel");
		list.add("Maria");
		
		System.out.println(list.size());
		
		for(String nume : list) {
			System.out.println(nume);
		}
		
		System.out.println("-----------------------");
		
		list.add("Carmen");
		
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + " : " + nume);
		}
		
		//get element via index
		System.out.println(" get element : " + list.get(2));
		
		//remove from list
		list.remove(4);
		System.out.println(list);
		list.remove("Ion");
		System.out.println(list);
		
		//remove all list
		list.clear();
		
		System.out.println(list.size());

	}

}
