package curs13.tema13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class VegetableCalories {
	
	public void writePropertiesFile() {
		 try(OutputStream outputStream = new FileOutputStream("vegetable.properties")){
			 
			 Properties propFile = new Properties();
			 propFile.setProperty("morcov", "58");
			 propFile.setProperty("ardei", "77");
			 propFile.setProperty("cartof", "100");
			 propFile.setProperty("telina", "43");
			 propFile.setProperty("castravete", "30");
			 propFile.store(outputStream, "am salvat fisierul!");
			 System.out.println("Inside propFile :" + propFile);
			 
		 }catch(IOException e) {
			 System.out.println("Cannot write properties file!");
			 e.printStackTrace();
		 }
	 }	
	
	 public void readPropertiesFile(String key) {
		 try(InputStream inputStream = new FileInputStream("vegetable.properties")){
			 
			 Properties propFile = new Properties();
			 propFile.load(inputStream);
			 
			 System.out.println(propFile.getProperty(key));
			 
		 }catch(IOException e ) {
			 System.out.println("Cannot read properties file!");
			 e.printStackTrace();
			 
		 }
	 }
	
	
	

}
