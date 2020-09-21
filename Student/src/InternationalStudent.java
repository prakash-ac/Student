//*******************************************************
// InternationalStudent.java		Author: Prakash Acharya
//
// Inherits from Student class
//
// Defines an InternationalStudent object
//*******************************************************

import java.text.DecimalFormat;

public class InternationalStudent extends Student {
	
	private String countryApplyingFrom;
	
	public InternationalStudent(String name, String major, 
			String degree, int numOfUnitsEnrolled, String countryApplyingFrom) {
		
		// An international student is always required to be enrolled into 12 or more units of courses.
		// If numberOfUnitsEnrolled is less than 12, the student is enrolled into default 12 units.
		super(name, major, degree, numOfUnitsEnrolled < 12 ? Student.DEFAULT_NUM_UNITS_ENROLLED : numOfUnitsEnrolled);
		this.countryApplyingFrom = countryApplyingFrom;
		
	}
	
	// this constructor will be invoked if no number of units enrolled specified
	public InternationalStudent(String name, String major, String degree, String countryApplyingFrom) {
		super(name, major, degree);
		this.countryApplyingFrom = countryApplyingFrom;
	}
	

	public String getCountryApplyingFrom() {
		return countryApplyingFrom;
	}

	public void setCountryApplyingFrom(String countryApplyingFrom) {
		this.countryApplyingFrom = countryApplyingFrom;
	}
	
	// class specific method 1
	public boolean isInternationalStudent() {
		if(countryApplyingFrom != null && countryApplyingFrom != "United States")
			return true;
		return false;
	}
	
	// class specific method 2
	public String describeCountry() {
		return countryApplyingFrom + " is very beautiful!";
	}
	
	// class specific method 3
	public String welcomeMessage() {
		return "Welcome to our country, and to our univerisity!";
	}
	@Override
	public String generateTutionCost() {
		DecimalFormat df = new DecimalFormat("0.00");
		Double tutionCost = PER_UNIT_COST * getNumOfUnitsEnrolled();
		return "$" + df.format(tutionCost);
	}

	@Override
	public String toString() {
		String is = super.toString();
		is += "\nApplying From: " + countryApplyingFrom;
		return is;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof InternationalStudent){
			InternationalStudent univStu = (InternationalStudent) obj;
			return super.equals(univStu) && countryApplyingFrom.equalsIgnoreCase(univStu.countryApplyingFrom);

		}else {
			return false;
		}
	}

	
}