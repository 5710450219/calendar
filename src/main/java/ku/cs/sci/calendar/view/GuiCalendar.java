package ku.cs.sci.calendar.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ku.cs.sci.calendar.controller.ControlSystem;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiCalendar {

	private JFrame frame;
	ControlSystem control;

	public GuiCalendar(ControlSystem control) {
		this.control = control;
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 204));
		panel.setBounds(0, 0, 682, 703);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel label = new JLabel("ตารางนัดหมาย");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(270, 13, 155, 29);
		panel.add(label);

		JButton button = new JButton("เพิ่มตารางนัดหมาย");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuiCalendar2 g = new GuiCalendar2(control);
				frame.setVisible(false);
			}
		});
		button.setBounds(51, 637, 173, 29);
		panel.add(button);

		JButton button_1 = new JButton("ลบตารางนัดหมาย");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(236, 637, 173, 29);
		panel.add(button_1);

		JButton button_2 = new JButton("แก้ไขตารางนัดหมาย");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(421, 637, 173, 29);
		panel.add(button_2);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 255, 204));
		panel_1.setBounds(51, 67, 566, 49);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel label_1 = new JLabel("ว/ด/ป");
		label_1.setBounds(18, 13, 56, 16);
		panel_1.add(label_1);

		JLabel lblNewLabel = new JLabel("เวลา");
		lblNewLabel.setBounds(86, 13, 56, 16);
		panel_1.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ชื่อผู้นัด กับ ชื่อผู้ถูกนัด");
		lblNewLabel_1.setBounds(217, 13, 211, 16);
		panel_1.add(lblNewLabel_1);

		JLabel label_2 = new JLabel("สถานที่");
		label_2.setBounds(471, 13, 56, 16);
		panel_1.add(label_2);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(51, 116, 74, 510);
		panel.add(panel_2);
		
		JLabel day = new JLabel("__________");
		panel_2.add(day);
		
		JLabel lblNewLabel_3 = new JLabel("__________");
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("__________");
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_8 = new JLabel("__________");
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("__________");
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_7 = new JLabel("__________");
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_10 = new JLabel("__________");
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("__________");
		panel_2.add(lblNewLabel_11);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(120, 116, 68, 510);
		panel.add(panel_3);
		
		JLabel lblNewLabel_5 = new JLabel("_________");
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_12 = new JLabel("_________");
		panel_3.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("_________");
		panel_3.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("_________");
		panel_3.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("_________");
		panel_3.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("_________");
		panel_3.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("_________");
		panel_3.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("_________");
		panel_3.add(lblNewLabel_18);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(188, 116, 308, 510);
		panel.add(panel_4);
		
		JLabel lblNewLabel_6 = new JLabel("__________________________________________");
		panel_4.add(lblNewLabel_6);
		
		JLabel label_11 = new JLabel("__________________________________________");
		panel_4.add(label_11);
		
		JLabel label_12 = new JLabel("__________________________________________");
		panel_4.add(label_12);
		
		JLabel label_13 = new JLabel("__________________________________________");
		panel_4.add(label_13);
		
		JLabel label_14 = new JLabel("__________________________________________");
		panel_4.add(label_14);
		
		JLabel label_15 = new JLabel("__________________________________________");
		panel_4.add(label_15);
		
		JLabel label_16 = new JLabel("__________________________________________");
		panel_4.add(label_16);
		
		JLabel label_17 = new JLabel("__________________________________________");
		panel_4.add(label_17);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(491, 116, 126, 510);
		panel.add(panel_5);
		
		JLabel label_3 = new JLabel("______________");
		panel_5.add(label_3);
		
		JLabel label_5 = new JLabel("______________");
		panel_5.add(label_5);
		
		JLabel label_4 = new JLabel("______________");
		panel_5.add(label_4);
		
		JLabel label_6 = new JLabel("______________");
		panel_5.add(label_6);
		
		JLabel label_7 = new JLabel("______________");
		panel_5.add(label_7);
		
		JLabel label_8 = new JLabel("______________");
		panel_5.add(label_8);
		
		JLabel label_9 = new JLabel("______________");
		panel_5.add(label_9);
		
		JLabel label_10 = new JLabel("______________");
		panel_5.add(label_10);
		frame.setVisible(true);
	}

}
