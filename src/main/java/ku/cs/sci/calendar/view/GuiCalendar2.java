package ku.cs.sci.calendar.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import ku.cs.sci.calendar.controller.ControlSystem;
import ku.cs.sci.calendar.model.Appointment;
import ku.cs.sci.calendar.model.People;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiCalendar2 {

	private JFrame frame;
	private JTextField name1;
	private JTextField name2;
	private JTextField day;
	private JTextField time;
	private JTextField place;
	ControlSystem control;

	public GuiCalendar2(ControlSystem control) {
		this.control = control;
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 204));
		panel.setBounds(0, 0, 682, 353);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel label = new JLabel("เพิ่มตารางนัดหมาย...");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(12, 13, 220, 40);
		panel.add(label);

		JLabel label_1 = new JLabel("ชื่อ-สกุล ผู้นัด");
		label_1.setBounds(22, 66, 150, 16);
		panel.add(label_1);

		JLabel label_2 = new JLabel("ชื่อ-สกุล ผู้ที่ต้องการนัด");
		label_2.setBounds(383, 66, 150, 16);
		panel.add(label_2);

		name1 = new JTextField();
		name1.setBounds(32, 100, 236, 22);
		panel.add(name1);
		name1.setColumns(10);

		name2 = new JTextField();
		name2.setColumns(10);
		name2.setBounds(393, 95, 236, 22);
		panel.add(name2);

		JLabel label_3 = new JLabel("วัน/เดือน/ปี");
		label_3.setBounds(22, 156, 127, 16);
		panel.add(label_3);

		JLabel label_4 = new JLabel("เวลา ");
		label_4.setBounds(383, 156, 127, 16);
		panel.add(label_4);

		day = new JTextField();
		day.setColumns(10);
		day.setBounds(32, 185, 236, 22);
		panel.add(day);

		time = new JTextField();
		time.setColumns(10);
		time.setBounds(393, 185, 236, 22);
		panel.add(time);

		JLabel label_5 = new JLabel("สถานที่");
		label_5.setBounds(22, 261, 127, 16);
		panel.add(label_5);

		place = new JTextField();
		place.setColumns(10);
		place.setBounds(32, 290, 236, 22);
		panel.add(place);

		JButton button = new JButton("ยืนยัน");
		button.setBounds(383, 289, 97, 25);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!name1.equals("") && !day.equals("") && !time.equals("") && !name2.equals("")
						&& !place.equals("")) {
					People p1 = new People(name1.getText());
					People p2 = new People(name2.getText());
					Appointment ap = new Appointment(p1, p2, day.getText(), time.getText());
					control.getArray().add(ap);
					JOptionPane.showMessageDialog(null, "Add Complete");
					GuiCalendar g = new GuiCalendar(control);
					frame.setVisible(false);
				}
			}
		});
		panel.add(button);

		JButton button_1 = new JButton("ยกเลิก");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuiCalendar g = new GuiCalendar(control);
				frame.setVisible(false);
			}
		});
		button_1.setBounds(519, 289, 97, 25);
		panel.add(button_1);
		frame.setVisible(true);
	}
}
