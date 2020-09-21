//************************************************************************************************
// ScheduleGenerator.java		Author: Prakash Acharya
//
// This is an interface. 
//
// Demonstrates an idea of  strategy pattern. Contains one method that 
// its child classes FullTimeScheduleGenerator and PartTimeScheduleGenerator class will implement.
//*************************************************************************************************
public interface ScheduleGenerator {
	
	public String generateSchedule();
}
