package curs13.package1;

public class TestTxtFile {
	
	public static void main(String[] args) {
		TextFileProcessor txtFile = new TextFileProcessor();
		//txtFile.writeFile("Ceva text\n");
		txtFile.readTxtFile();
		txtFile.updateTxtFile("Masina\n");
		txtFile.readTxtFile();
		txtFile.deleteFile();
	}

}
