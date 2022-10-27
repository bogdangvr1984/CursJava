package curs14;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;


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
		list.add("Carmen");
		//get element via index
		System.out.println(" get element : " + list.get(2));
		
		System.out.println("---------------------");
	
		
		list.add(0, "Mara");
		
		for(String nume : list) {
			
			System.out.println(list.indexOf(nume) + " : "+ nume);
		}
		
		System.out.println("------------------------");
		list.add(3, "Ioana");
		for(String nume : list) {
			
			System.out.println(list.indexOf(nume) + " : "+ nume);
		}
		
		list.add(7, "Bogdan2");
		for(String nume : list) {
			
			System.out.println(list.indexOf(nume) + " : "+ nume);
		}
		
		System.out.println("--------------------");
		
		System.out.println(list);
		
		//remove from list
		list.remove(7);
		System.out.println(list);
		list.remove("Gabriel");
		System.out.println(list);

		//remove all list
		list.clear();
		
		System.out.println(list.size());
	}

}