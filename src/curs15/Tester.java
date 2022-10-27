package curs15;

public class Tester <T>{

	//String age
	//int age
	//double age
	T age;
	
	public Tester(T age) {
		this.age = age;
	}
	
	public void printAge() {
		System.out.println("Data type-ul obiectului meu este " + age.getClass().getName());
	}
}
