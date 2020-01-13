package task.manager.models;

public class TaskDataModel {
	String dateEvent;
	
	public void setDateEvent(String dateEvent) {
		this.dateEvent = dateEvent;
	}
	public String getDateEvent() {
		return dateEvent;
	}
	@Override
	public String toString() {
		return "TaskDataModel [dateEvent=" + dateEvent + "]";
	}
}
