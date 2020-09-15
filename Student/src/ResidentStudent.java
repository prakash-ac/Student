//*******************************************************
// ResidentStudent.java		Author: Prakash Acharya
//
// Inherits from Student class. 
//
// Defines a ResidentStudentObject
//*******************************************************

import java.text.DecimalFormat;

public class ResidentStudent extends Student {
	private boolean appliedForFinAid;
	private double finAidAmount = 0.0;
	private static final boolean DEFAULT_APPLIED_FOR_FINAID = false;
	public static final double perUnitCost = 326.00;
	
	public ResidentStudent(String name, String major, String degree, 
			int numOfUnitsEnrolled, boolean appliedForFinAid) {
		super(name, major, degree, numOfUnitsEnrolled);
		this.appliedForFinAid = appliedForFinAid;
	}
	
	// this constructor will be invoked if number of units is not provided.
	public ResidentStudent(String name, String major, String degree, 
			boolean finAidApplied) {
		super(name, major, degree);
		this.appliedForFinAid = DEFAULT_APPLIED_FOR_FINAID;
	}
	
	
	// this constructor will be invoked if number of units enrolled is not provided, and 
	// financial aid applied is not provided as true value.
	public ResidentStudent(String name, String major, String degree) {
		this(name, major, degree, DEFAULT_APPLIED_FOR_FINAID);
	}


	public boolean hasAppliedForFinAid() {
		return appliedForFinAid;
	}

	public void setAppliedForFinAid(boolean appliedForFinAid) {
		this.appliedForFinAid = appliedForFinAid;
	}
	
	// class specific method 1
	// Only a full-time student who applies for financial aid gets financial aid.
	public double getFinAidAmount() {
		if(appliedForFinAid && isFullTime())
			finAidAmount = 3000.78;
		return finAidAmount;
	}
	
	// class specific method 2
	public boolean isFullTime() {
		if(getNumOfUnitsEnrolled() >= 12)
			return true;
		return false;
	}
	
	// class specific method 3
	public void displayHomeState() {
		System.out.println("Yay!! We are Californians!");
	}
	
	@Override
	public String toString() {
		String rs = super.toString();
		rs += "\nStatus: " + (isFullTime() ? "Full-Time" : "Part-Time");
		return rs;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ResidentStudent){
			ResidentStudent univStu = (ResidentStudent) obj;
			return super.equals(univStu);

		}else {
			return false;
		}
	}
	
	@Override
	public String generateTutionCost() {
		DecimalFormat df = new DecimalFormat("0.00");
		Double tutionCost = perUnitCost * getNumOfUnitsEnrolled() - getFinAidAmount();
		return "$" + df.format(tutionCost);
	}
	
}