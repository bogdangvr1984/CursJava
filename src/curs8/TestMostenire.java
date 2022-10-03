package curs8;

public class TestMostenire {

	public static void main(String[] args) {
		
		//Angajat ---> Tester ---> TesterAutomat
		
		TesterAutomat tester = new TesterAutomat();
		
		tester.setProgramingLanguage("Java");//clasa TesterAutomat()
		tester.setDepartament("QA");//clasa Tester()
		tester.setSeniority("Junior");//clasa Tester()
		tester.setEmail("oana@oana.ro");//clasa Angajat()
		tester.setNume("Oana");//clasa Angajat()
		
		System.out.println(" Numele angajatului este " + tester.getNume() + " este de senioritate :" + tester.getSeniority()
		 + " si scrie cod :" + tester.getProgramingLanguage());

	}

}
