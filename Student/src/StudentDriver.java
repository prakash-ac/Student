//*******************************************************
// StudentDriver.java		Author: Prakash Acharya
//
// Tests the Student and its sub-classes
//*******************************************************

public class StudentDriver {

	public static void main(String[] args) {
		
		
		ResidentStudent rs01 = new ResidentStudent("Ranjana", 1, "Microbiology", "Science and Engineering", 12, true);
		System.out.println(rs01);
		System.out.println(rs01.generateTutionCost());
		
		
		NonResidentStudent nrs01 = new NonResidentStudent("Bijay Acharya", 2, "Accounting", "Accounting and Business", 12, true);
		System.out.println(nrs01);
		System.out.println(nrs01.generateTutionCost());
		
		
		
		System.out.println(Student.count);
	}

}