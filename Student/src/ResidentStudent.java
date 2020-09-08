//*******************************************************
// ResidentStudent.java		Author: Prakash Acharya
//
// Inherits from Student class. 
//*******************************************************

import java.text.DecimalFormat;

public class ResidentStudent extends Student {
	private boolean appliedForFinAid;
	private double finAidAmount = 0.0;
	private static final boolean DEFAULT_APPLIED_FOR_FINAID = false;
	private static final double perUnitCost = 326.00;
	
	
	public ResidentStudent(String name, int id, String major, String faculty,
		int numOfUnitsEnrolled, boolean appliedForFinAid){
		super(name, id, major, faculty, numOfUnitsEnrolled);
		this.appliedForFinAid = appliedForFinAid;
	}
	
	public ResidentStudent(String name, int id, String major, String faculty, int numOfUnitsEnrolled) {
		super(name, id, major, faculty, numOfUnitsEnrolled);
		this.appliedForFinAid = DEFAULT_APPLIED_FOR_FINAID;
	}
	
	public ResidentStudent(String name, String major, String faculty) {
		super(name, major, faculty);
		this.appliedForFinAid = DEFAULT_APPLIED_FOR_FINAID;
	}


	public boolean hasAppliedForFinAid() {
		return appliedForFinAid;
	}

	public void setAppliedForFinAid(boolean appliedForFinAid) {
		this.appliedForFinAid = appliedForFinAid;
	}

	protected double getFinAidAmount() {
		if(appliedForFinAid && isFullTime())
			finAidAmount = 3000.0;
		return finAidAmount;
	}

	protected boolean isFullTime() {
		if(getNumOfUnitsEnrolled() >= 12)
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		String rs = super.toString();
		rs += "\nFull-time Student: " + isFullTime() + 
				"\nApplied For Financial Aid: " + appliedForFinAid + 
				"\nFinancial Aid Amount: " + getFinAidAmount() +
				"\nPlease pay the following amount: " + generateTutionCost();
		return rs;
	}
	
	@Override
	public String generateTutionCost() {
		DecimalFormat df = new DecimalFormat("#.00");
		Double tutionCost = perUnitCost * getNumOfUnitsEnrolled() - getFinAidAmount();
		return "$" + df.format(tutionCost);
	}
	
	@Override
	public String generateSchedule(){
		String sch = "";
		if(getNumOfUnitsEnrolled() > 0 && getNumOfUnitsEnrolled() <= 9) {
			sch += getName() + ", your schedule is as follows: "
					+ "\nMonday 08:00 - 15:00" +
					"\nTuesday 08:00 - 15:00" +
					"\nWednesday 08:00 - 15:00";
			}
		else if(getNumOfUnitsEnrolled() > 9 && getNumOfUnitsEnrolled() <= 12) {
			sch += getName() + ", your schedule is as follows: "
					+ "\nMonday 08:00 - 15:00" +
					"\nTuesday 08:00 - 15:00" +
					"\nWednesday 08:00 - 15:00" +
					"\nThursday 08:00 - 15:00 ";
		}
		else if(getNumOfUnitsEnrolled() > 12 && getNumOfUnitsEnrolled() <= maxUnitsAllowed){
			sch += getName() + ", your schedule is as follows: "
					+ "\nMonday 08:00 - 17:00" +
					"\nTuesday 08:00 - 17:00" +
					"\nWednesday 08:00 - 17:00" +
					"\nThursday 08:00 - 17:00 "+
					"\nFriday 08:00 - 13:00";
		}
		return sch;
		
	}
}