package ku.cs.sci.calendar.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
	PreparedStatement statement;
	Connection conn;
	int maxId;

	ResultSet resultSet;

	public Database() {
		maxId = 1;
		try {
			// setup
			Class.forName("org.sqlite.JDBC");
			String dbURL = "jdbc:sqlite:calendarDB.db";
			conn = DriverManager.getConnection(dbURL);
			if (conn != null) {
				System.out.println("Connected to the database....");
				// execute SQL statements
				System.out.println("----- Data in calendar table -----");
				String query = "Select * from calendar";
				statement = (PreparedStatement) conn.prepareStatement(query);
				resultSet = statement.executeQuery();
				while (resultSet.next()) {
					int id = resultSet.getInt(1);
					String name1 = resultSet.getString(2);
					String name2 = resultSet.getString(3);
					String date = resultSet.getString(4);
					String time = resultSet.getString(5);
					String place = resultSet.getString(6);
					System.out.println("id:" + id + " name: " + name1 + " name2: " + name2 + " date: " + date + " time: "
							+ time + " place: " + place);
					maxId++;
				}
			}
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	public void addCalendar(int id, String name1, String name2, String date, String time, String place)
			throws SQLException {
		statement = (PreparedStatement) conn.prepareStatement("insert into calendar values(?,?,?,?,?,?)");
		statement.setInt(1, id);
		statement.setString(2, name1);
		statement.setString(3, name2);
		statement.setString(4, date);
		statement.setString(5, time);
		statement.setString(6, place);
		statement.executeUpdate();
		maxId++;
	}

	public int getMaxId() {
		return maxId;
	}
}
