import java.text.DecimalFormat;

public class InternationalStudent extends Student {
	
	private String countryApplyingFrom;
	
	public InternationalStudent(String name, int id, String major, 
			String faculty, int numOfUnitsEnrolled, String countryApplyingFrom) {
		
		super(name, id, major, faculty, numOfUnitsEnrolled);
		this.countryApplyingFrom = countryApplyingFrom;
	
	}
	
	// this constructor will be invoked if no number of units enrolled specified
	public InternationalStudent(String name, int id, String major, String faculty, String countryApplyingFrom) {
		super(name,id, major, faculty);
		this.countryApplyingFrom = countryApplyingFrom;
	}
	
	// this constructor will be invoked if no id is provided.
	public InternationalStudent(String name, String major, String faculty, int numOfUnitsEnrolled) {
			super(name, major, faculty, numOfUnitsEnrolled);
		}
	// this constructor will be invoked if no id and numOfUnitsEnrolled
	public InternationalStudent(String name, String major, String faculty, String countryApplyingFrom) {
		super(name, major, faculty);
		this.countryApplyingFrom = countryApplyingFrom;
	}
	

	public String getCountryApplyingFrom() {
		return countryApplyingFrom;
	}

	public void setCountryApplyingFrom(String countryApplyingFrom) {
		this.countryApplyingFrom = countryApplyingFrom;
	}

	@Override
	public String generateTutionCost() {
		DecimalFormat df = new DecimalFormat("#.00");
		Double tutionCost = Student.perUnitCost * getNumOfUnitsEnrolled();
		return "$" + df.format(tutionCost);
	}

	@Override
	public String generateSchedule() {
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
	
	@Override
	public String toString() {
		return super.toString() + "\nApplying From: " + countryApplyingFrom;
	}

	
}