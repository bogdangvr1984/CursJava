package curs14;

import java.text.ParseException;

public class TestJsonProcessor {

	public static void main(String[] args) throws ParseException, org.json.simple.parser.ParseException {
		
		JsonFileProcessor jsonFile = new JsonFileProcessor();
		
		//jsonFile.writeJsonFile();
		
		jsonFile.readJsonFile("name");
		jsonFile.readJsonFile("email");
		jsonFile.readJsonFile("listaObiecte");

	}

}
