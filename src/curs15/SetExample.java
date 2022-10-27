package curs15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		
		Set<String> set = new HashSet<>();
		
		System.out.println(set.size());
		
		set.add("mov");
		set.add("alb");
		set.add("rosu");
		set.add("galben");
		set.add("galben");
		
		System.out.println(set.size());
		
		for(String element : set) {
			
			System.out.println(element);
		}
		
		set.remove("galben");
		
		System.out.println(set.size());
		
		System.out.println("---------------");
		
        for(String element : set) {
			
			System.out.println(element);
		}
        
        System.out.println("---------------");
        
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
        System.out.println("---------------");
        
        System.out.println(set.contains("mov"));
        
        set.clear();
        System.out.println("---------------");
        
        System.out.println(set.isEmpty());

	}

}
