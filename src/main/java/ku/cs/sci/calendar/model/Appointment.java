package ku.cs.sci.calendar.model;

public class Appointment {
	private People[] appoint;
	private String time;
	private String day;

	public Appointment(People p1, People p2, String day, String time) {
		appoint = new People[2];
		appoint[0] = p1;
		appoint[1] = p2;
		this.day = day;
		this.time = time;
	}

	public People[] getAppoint() {
		return appoint;
	}

	public void setAppoint(People[] appoint) {
		this.appoint = appoint;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	

}
