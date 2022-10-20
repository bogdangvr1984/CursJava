package curs13.package1;

public class TestPropertiesFile {

	public static void main(String[] args) {
		
		PropertiesFileProcessor obj = new PropertiesFileProcessor();
		//obj.writePropertiesFile();
		obj.readPropertiesFile("user");
		obj.readPropertiesFile("pass");
		obj.readPropertiesFile("email");
		
		
		//
		//driver.get(obj.readPropertiesFile("dev_url"));
		
		System.out.println("--------------------");
		obj.updatePropertiesFile("pass", "parola4321");
		obj.readPropertiesFile("pass");
		
		System.out.println("--------------------");
		obj.deleteFromPropertiesFile("email");
		

	}

}
