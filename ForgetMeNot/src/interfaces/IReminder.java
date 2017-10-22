package interfaces;

public class IReminder {
	
	private String reminderHeading, reminderDue, remindeReminder;
	
	

	public String getReminderDue() {
		
		return reminderDue;
	}

	public void setReminderDue(String reminderDue) {
		this.reminderDue = reminderDue;
	}

	public String getRemindeReminder() {
		return remindeReminder;
	}

	public void setRemindereminder(String remindeReminder) {
		this.remindeReminder = remindeReminder;
	}
	
	public String getReminderHeading(){
		return remindeReminder;
	}

	public void setReminderHeading(String reminderHeading) {
		this.reminderHeading = reminderHeading;
	}
	
	public String toString(){
		return "Reminder Heading: " + getReminderHeading() + ", Reminder Due: " + getReminderDue() + ", Reminder Reminder: " + getRemindeReminder();
	}

}
