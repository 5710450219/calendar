package ku.cs.sci.calendar.controller;

import java.util.ArrayList;

import ku.cs.sci.calendar.model.Appointment;
import ku.cs.sci.calendar.view.GuiCalendar;

public class ControlSystem {
	ArrayList<Appointment> arr;

	public void startApplication() {
		arr = new ArrayList<Appointment>();
		GuiCalendar view = new GuiCalendar(this);
		
	}

	public ArrayList<Appointment> getArray() {
		return arr;
	}
}
