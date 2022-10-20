package curs13.package1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileProcessor {

	/*
	 * write to txt file
	 * 
	 * 
	 * 
	 */
	
	public void writeFile(String txtFile) {
		
		try {
			FileWriter myFIleWriter = new FileWriter("file.txt");
			myFIleWriter.write(txtFile);
			myFIleWriter.close();
			System.out.println("Succesfully wrote to file!");
			
		} catch (IOException e) {
			System.out.println("Cannot write to file!");
			
			e.printStackTrace();
		}
	}
	
	/*
	 * read from txt file
	 * 
	 */
	public void readTxtFile() {
		
		try {
		File objFile = new File("file.txt");
		Scanner scan = new Scanner(objFile);
		   while(scan.hasNext()) {
			   System.out.println("Text in file :" + scan.nextLine());
		   }
		scan.close();
		
		}catch (IOException e) {
			System.out.println("Cannot read file!");
			e.printStackTrace();
		}
	}
	
	/*
	 * append
	 */
	public void updateTxtFile(String txtToUpdate) {
		
		try(FileWriter fileWriter = new FileWriter("file.txt", true)){
			
			fileWriter.append(txtToUpdate);
		
	}catch (IOException e) {
		
		System.out.println("Cannot update file!");
		e.printStackTrace();
	}
		
	}
	
	public void deleteFile() {
		File file = new File("file.txt");
		file.delete();
		System.out.println("Delete file :" + file.getName());
	}
			
}
