package curs14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonFileProcessor {
	
	public void writeJsonFile() {
		
		JSONObject obj = new JSONObject();
		obj.put("name", "TestUser");
		obj.put("email", "email@testuser.com");
		
		JSONArray list = new JSONArray();
		list.add("Object 1");
		list.add("Object 2");
		list.add("Object 3");
		list.add("Object 4");
		list.add("Object 5");
		
		obj.put("listaObiecte", list);
		
		try(FileWriter file = new FileWriter("test.json")){
			
			file.write(obj.toJSONString());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void readJsonFile(String key) throws ParseException, org.json.simple.parser.ParseException {
		JSONParser parser = new JSONParser();
		try {
			FileReader reader =  new FileReader("test.json");
			JSONObject jsonObj = (JSONObject) parser.parse(reader);
			System.out.println(jsonObj);
			
			String obiect = (String) jsonObj.get(key);
			System.out.println("Key :" + obiect);
			
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}

}
