import java.text.DecimalFormat;

//*******************************************************
// NonResidentStudent.java		Author: Prakash Acharya
//
// Inherits from ResidentStudent class. 
//*******************************************************


public class NonResidentStudent extends ResidentStudent{
	
	public NonResidentStudent(String name, int id, String major, String faculty,
		int numOfUnitsEnrolled, boolean appliedForFinAid) {
		super(name, id, major, faculty, numOfUnitsEnrolled, appliedForFinAid);
	}
	
	public NonResidentStudent(String name, int id, String major, String faculty, int numOfUnitsEnrolled) {
		super(name, id, major, faculty, numOfUnitsEnrolled);
	}
	
	public NonResidentStudent(String name, String major, String faculty) {
		super(name, major, faculty);

	}
	
	@Override
	public String generateTutionCost() {
		DecimalFormat df = new DecimalFormat("#.00");
		Double tutionCost = Student.perUnitCost * getNumOfUnitsEnrolled() - getFinAidAmount();
		return "$" + df.format(tutionCost);
	}


}
