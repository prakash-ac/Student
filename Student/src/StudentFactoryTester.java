import java.util.ArrayList;
import java.util.Scanner;
public class StudentFactoryTester {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String type, name, major, degree, countryApplyingFrom = null;
		ArrayList<Student> students = new ArrayList<Student>();
		
		for(int i=0;i<3;i++) {
			System.out.println("Enter the name of Student:");
			name = scan.nextLine();
			System.out.println("Enter the type of Student:");
			type = scan.nextLine();
			if(type.equalsIgnoreCase("International")) {
				System.out.println("Enter the country applying from:");
				countryApplyingFrom = scan.nextLine();
			}
			System.out.println("Enter the major:");
			major = scan.nextLine();
			
			System.out.println("Enter the degree path:");
			degree = scan.nextLine();
			// M3 USING FACTORY
			Student s = StudentFactory.newStudent(type, name, major, degree, countryApplyingFrom);
			students.add(s);
		}
	  
	  for(Student s: students) {
		  System.out.println(s);
	  }
		
		

		}
	}

