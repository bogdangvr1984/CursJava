package curs15;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "negru");
		map.put(33, "alb");
		map.put(88, "verde");
		map.put(5, "rosu");
		
		map.put(44, "rosu");
		map.put(5, "mov");
		
		System.out.println(map);
		
		Map<Integer, String> map2 = new HashMap<>();
		
		map2.put(11, "negru");
		map2.put(45, "portocaliu");
		map2.put(100, "gri");
		
		System.out.println(map2);
		
		map.putAll(map2);
		System.out.println("+ " + map);
		
	}

}
