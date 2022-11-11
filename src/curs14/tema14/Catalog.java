package curs14.tema14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import curs15.CodPostalException;

public class Catalog {

	
public static void main (String[] args) {

		
	Map<String, Integer> map = new HashMap<>();
		
		map.put("Ion", 5);
		map.put("Alex", 10);
		map.put("Maria", 7);
		map.put("Razvan", 8);
		map.put("Elena", 9);
		
	
     Scanner scan = new Scanner(System.in);  
	        System.out.println("Cum te cheama si ce nota ai luat?");

	        String nume = scan.next();
	        int nota = scan.nextInt();
	        
	        if (map.containsKey(nume) && map.containsValue(nota)) {
	        	System.out.println("Nu ai nevoie de alta nota");
	        	
	        } else {
	        	map.put(nume, nota);
	    }
	        System.out.println(map);
	}


}
