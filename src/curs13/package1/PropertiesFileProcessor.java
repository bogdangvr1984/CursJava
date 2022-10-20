package curs13.package1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileProcessor {
	
	/*
	 * write properties 
	 */
 public void writePropertiesFile() {
	 try(OutputStream outputStream = new FileOutputStream("test.properties")){
		 
		 Properties propFile = new Properties();
		 propFile.setProperty("user", "TestUser");  //user = TestUser
		 propFile.setProperty("pass", "pass123");
		 propFile.setProperty("email", "testUser@testUser.com");
		 propFile.store(outputStream, "am salvat fisierul!");
		 System.out.println("Inside propFile :" + propFile);
		 
	 }catch(IOException e) {
		 System.out.println("Cannot write properties file!");
		 e.printStackTrace();
	 }
 }
 
 /*
  * read properties file
  */
 
 public void readPropertiesFile(String key) {
	 try(InputStream inputStream = new FileInputStream("test.properties")){
		 
		 Properties propFile = new Properties();
		 propFile.load(inputStream);
		 
		 System.out.println(propFile.getProperty(key));
		 
	 }catch(IOException e ) {
		 System.out.println("Cannot read properties file!");
		 e.printStackTrace();
		 
	 }
 }
 
 /*
  * update properties file
  */
 
 public void updatePropertiesFile(String key, String value) {
	 Properties properties = new Properties();
	 
	 try(InputStream inputStream = new FileInputStream("test.properties")){
		 
		 properties.load(inputStream);
		 
	 }catch(IOException e) {
		 System.out.println("Cannot load properties file!");
		 e.printStackTrace();
	 }
	 
	 try(OutputStream outputStream = new FileOutputStream("test.properties")){
		 
		 properties.setProperty(key, value);
		 properties.store(outputStream, null);
		 
	 }catch(IOException e) {
		 System.out.println("Cannot update properties file!");
		 e.printStackTrace();
   }
 }
 
 /*
  * delete from file
  */
 
 public void deleteFromPropertiesFile(String key) {
	 Properties prop = new Properties();
	 
try(InputStream inputStream = new FileInputStream("test.properties")){
		 
		 prop.load(inputStream);
		 
	 }catch(IOException e) {
		 System.out.println("Cannot load properties file!");
		 e.printStackTrace();
	 }

try(OutputStream outputStream = new FileOutputStream("test.properties")){
	 
	 prop.remove(key);
	 prop.store(outputStream, null);
	 
}catch(IOException e) {
	 System.out.println("Cannot delete properties file!");
	 e.printStackTrace();
}
	 
 }
 
}
