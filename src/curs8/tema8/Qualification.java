package curs8.tema8;

import java.util.Scanner;

public class Qualification extends Teacher {

	public Qualification(String course, int experience, String schedule) {
		super(course, experience, schedule);
		
	}
	
	
	public void askForQualifications() {
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Introduceti experienta :");
		experienceYears = scan.nextInt();
		System.out.println("Introduceti cursul :");
		course = scan.next();
		System.out.println("Introduceti programul :");
		schedule = scan.next();
	}
	
	public void Verify() {
		
		 if(experienceYears > 3 && course.equals("Java")  && schedule.equals("Afternoon")) {
				
				System.out.println("You qualify to teach at this school!");
				
			}else {
				
				System.out.println("You do not qualify!");

	     }

	}	
	
}

