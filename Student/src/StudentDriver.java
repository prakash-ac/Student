import java.util.*;
import java.text.DecimalFormat;

//*******************************************************
// StudentDriver.java		Author: Prakash Acharya
//
// To test the Student and its sub-classes
//*******************************************************

public class StudentDriver {

	public static void main(String[] args) {
		
		// List of majors
	    ArrayList<String> majors = new ArrayList<String>( 
	               Arrays.asList("Microbiology", 
	                             "Accounting", 
	                             "Computer Science",
	                             "Poetry"));
	    DecimalFormat df = new DecimalFormat("0.00");
		
		// Create 3 Resident, 3 Non-Resident, and 3 International students
		int i = 0;
		for(String major: majors) {
			String rsDemo = "Demo Resident" + i;
			new ResidentStudent(rsDemo, major, "Graduate", 12, true);
			
			String nrsDemo = "Demo Non-Resident" + i;
			new NonResidentStudent(nrsDemo, major, "Graduate", 12, true);
			
			String isDemo = "Demo International" + i;
			new InternationalStudent(isDemo, major, "Undergraduate", 12, "Demo Country");
			
			i++;
			
		}
		
		// Create a Resident Student with same name as "Demo Resident2"
		// Since two Resident Students will have same names, sort will be based on their id's.
		new ResidentStudent("Demo Resident2", "Microbiology", "Undergraduate", 9, true);
		
		// An ArrayList that holds all student objects
		ArrayList<Student> allStudents = Student.getAllStudents();
		
		//Sort all student objects based on the name, if two names are equal perform sort on id
		Collections.sort(allStudents);
		
		// Display each student, and call class specific methods
		for(Student s: allStudents) {
			if(s instanceof ResidentStudent) {
				if(s instanceof NonResidentStudent) {
					NonResidentStudent nrs = (NonResidentStudent) s;
					System.out.println(nrs);
					System.out.println("\nCalling two NonResidentStudent class specific methods:");
					nrs.describeState();
					nrs.printHello();
				}
				else {
					ResidentStudent rs = (ResidentStudent) s;
					System.out.println(rs);
					System.out.println("\nCalling two ResidentStudent class specific methods:");
					rs.displayHomeState();
					System.out.println("Financial Aid Amount: " + 
								(rs.getFinAidAmount() > 0.0 ? "$" +  df.format(rs.getFinAidAmount()): "Not Availabe"));
					} 
				} 
			else if(s instanceof InternationalStudent) {
				InternationalStudent is = (InternationalStudent) s;
				System.out.println(is);
				System.out.println("\nCalling two InternationalStudent class specific methods:");
				System.out.println(is.describeCountry());
				System.out.println(is.welcomeMessage());
			}
			
			System.out.println();
		}
		
		System.out.println("\n****** Testing a method on an Enum varible *******.\nShould print 'School of Business': " + Faculty.BUSINESS.getSchool());
		
		System.out.println("\n******* Testing equals method ******** ");
		
		ResidentStudent rs01 = new ResidentStudent("Test One", "Microbiology", "Undergraduate", 9, true);
		ResidentStudent rs02 = new ResidentStudent("Test One", "Microbiology", "Undergraduate", 9, true);
		System.out.println("Since each student has a unique id, it should print false: " + rs01.equals(rs02));
		
		InternationalStudent is01 = new InternationalStudent("Test Two", "Computer Science", "Undergraduate", 12, "Test Country");
		InternationalStudent is02 = new InternationalStudent("Test Two", "Computer Science", "Undergraduate", 12, "Test Country");
		System.out.println("Since each student has a unique id, it should print false: " + is01.equals(is02));
		
		NonResidentStudent nrs01 = new NonResidentStudent("Test Three", "Accounting", "Graduate", 12, true);
		NonResidentStudent nrs02 = new NonResidentStudent("Test Three", "Accounting", "Graduate", 12, true);
	    System.out.println("Since each student has a unique id, it should print false: " + nrs01.equals(nrs02));
	    
	    // I also tested for positive cases by removing the id comparison part of
	    // the Student class's equals method. It prints true.
	 
		System.out.println("\nThere should be 19 student objects created. There are " + allStudents.size() + " student objects.\n");
		
	}

}