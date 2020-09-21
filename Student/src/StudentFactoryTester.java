//*************************************************************
// StudentFactoryTester.java		Author: Prakash Acharya
//
// Test Student objects creation from StudentFactory class.
//*************************************************************
import java.util.ArrayList;
//import java.util.Scanner;
public class StudentFactoryTester {

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		//String type, name, major, degree, countryApplyingFrom = null;
		
	  ArrayList<Student> students = new ArrayList<Student>();
		
	  // M3 USING FACTORY
	  Student s01 = StudentFactory.newStudent("Resident", "Prakash Acharya", "Computer Science", "Undergraduate", null);
	  students.add(s01);
	  Student s02 = StudentFactory.newStudent("Non-Resident", "I'm Non-Resident", "Accounting", "Undergraduate", null);
	  students.add(s02);
	  Student s03 = StudentFactory.newStudent("International", "I'm International", "Microbiology", "Graduate", "Nepal");
	  students.add(s03);
	  
	  
	/*for(int i=0;i<3;i++) {
		System.out.println("Enter the name of Student:");
		name = scan.nextLine();
		System.out.println("Enter the type of Student (International, Resident, or Non-Resident): ");
		type = scan.nextLine();
		if(type.equalsIgnoreCase("International")) {
			System.out.println("Enter the country applying from:");
			countryApplyingFrom = scan.nextLine();
		}
		System.out.println("Enter the major (e.g. Accounting, Microbiology, Computer Science): ");
		major = scan.nextLine();
		
		System.out.println("Enter the degree path (Graduate, or Undergraduate)");
		degree = scan.nextLine();
		// M3 USING FACTORY
		Student s = StudentFactory.newStudent(type, name, major, degree, countryApplyingFrom);
		students.add(s);
	 }*/
	  
    for(Student s: students) {
	  System.out.println(s + "\n");
    }	
		

	}
}

