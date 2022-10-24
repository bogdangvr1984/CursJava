package curs14;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		//get map size
		System.out.println(map.size());
		
		map.put("T", "Tester");
		map.put("D", "Developer");
		map.put("M", "Manager");
		map.put("P", "ProductOwner");
		
		System.out.println(map);
		
		System.out.println(map.get("M"));
		
		System.out.println("----------------");
		
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("----------------");
		
		for(String value : map.values()) {
			System.out.println(value);
		}
		
		map.remove("M");
		
		boolean checkKey = map.containsKey("M");
	    System.out.println("Cntains key :" + checkKey);
	    
	    boolean checkValue = map.containsValue("Developer");
	    System.out.println("Contains value :" + checkValue);
		

	}

}
