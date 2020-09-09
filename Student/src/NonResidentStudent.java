import java.text.DecimalFormat;

//*******************************************************
// NonResidentStudent.java		Author: Prakash Acharya
//
// Inherits from ResidentStudent class. 
//
// Defines a NonResidentStudent object
//*******************************************************


public class NonResidentStudent extends ResidentStudent{
	
	public NonResidentStudent(String name, String major, String faculty,
		int numOfUnitsEnrolled, boolean appliedForFinAid) {
		super(name, major, faculty, numOfUnitsEnrolled, appliedForFinAid);
	}
	
	// this constructor is invoked if number units enrolled is not provided
	public NonResidentStudent(String name, String major, String faculty, boolean appliedForFinAid) {
		super(name, major, faculty, appliedForFinAid);
	}
	
	// this constructor is invoked if only name, major, and faculty is provided
	public NonResidentStudent(String name, String major, String faculty) {
		super(name, major, faculty);
	}
	
	// class specific method 1
	public void describeState() {
		System.out.println(getName() + " is from Demo State");
	}
	
	// class specific method 2
	public void printHello() {
		System.out.println("Hello!");
	}
	
	// class specific method 3
	public boolean isNonResident() {
		return true;
	}
	
	@Override
	public String toString() {
		String rs = super.toString();
		rs += "\nFull-time Student: " + isFullTime() +
				"\nState: Demo State";
		return rs;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof NonResidentStudent){
			NonResidentStudent univStu = (NonResidentStudent) obj;
			return getId()==univStu.getId() && getName().equalsIgnoreCase(univStu.getName()) && 
					getFaculty().equals(univStu.getFaculty()) && getMajor().equals(univStu.getMajor());
		}else {
			return false;
		}
	}
	
	@Override
	public String generateTutionCost() {
		DecimalFormat df = new DecimalFormat("0.00");
		Double tutionCost = PER_UNIT_COST * getNumOfUnitsEnrolled() - getFinAidAmount();
		return "$" + df.format(tutionCost);
	}


}
