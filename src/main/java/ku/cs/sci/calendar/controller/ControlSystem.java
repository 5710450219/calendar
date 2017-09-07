package ku.cs.sci.calendar.controller;

import java.util.ArrayList;

import ku.cs.sci.calendar.model.Appointment;
import ku.cs.sci.calendar.model.Database;
import ku.cs.sci.calendar.view.GuiCalendar;

public class ControlSystem {
	ArrayList<Appointment> arr;
	Database d;

	public void startApplication() {
		d = new Database();
		arr = new ArrayList<Appointment>();
		GuiCalendar view = new GuiCalendar(this);

	}

	public Database getDatabase() {
		return d;
	}

	public ArrayList<Appointment> getArray() {
		return arr;
	}
}
