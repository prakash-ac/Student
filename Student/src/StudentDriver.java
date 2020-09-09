import java.util.*;


//*******************************************************
// StudentDriver.java		Author: Prakash Acharya
//
// To test the Student and its sub-classes
//*******************************************************

public class StudentDriver {

	public static void main(String[] args) {
		
		
		// This map contains the major and faculty as key value pair
		Map<String, String> majorAndFaculty = new HashMap<String, String>();
		
		majorAndFaculty.put("Microbiology", "Science and Engeering");
		majorAndFaculty.put("Accounting", "Accounting and Business");
		majorAndFaculty.put("Computer Science", "Science and Engeering");
		
		// ArrayList of Student type contains all the students(Resident, NonResident, International)
		ArrayList<Student> students = new ArrayList<Student>();
		
		
		
		
		// Create 3 Resident, 3 Non-Resident, and 3 International students
		int i = 0;
		for(String str: majorAndFaculty.keySet()) {
			String rsDemo = "Demo Resident" + i;
			ResidentStudent rs01 = new ResidentStudent(rsDemo, str, majorAndFaculty.get(str), 12, true);
			students.add(rs01);
			
			String nrsDemo = "Demo Non-Resident" + i;
			NonResidentStudent nrs01 = new NonResidentStudent(nrsDemo, str, majorAndFaculty.get(str), 12, true);
			students.add(nrs01);
			
			String isDemo = "Demo International" + i;
			InternationalStudent is01 = new InternationalStudent(isDemo, str, majorAndFaculty.get(str), 12, "Demo Country");
			students.add(is01);
			
			i++;
			
		}
		
		// print each student, and call class specific methods
		for(Student s: students) {
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
					System.out.println("Total financial aid provided: " + rs.getFinAidAmount());
					} 

				} 
			else if(s instanceof InternationalStudent) {
				InternationalStudent is = (InternationalStudent) s;
				System.out.println(is);
				System.out.println("\nCalling wo InternationalStudent class specific methods:");
				System.out.println(is.describeCountry());
				System.out.println(is.welcomeMessage());
			}
			
			System.out.println();
		
		}
		System.out.println("\nThere should be 9 students, there are " + students.size() + " students.");
	}

}