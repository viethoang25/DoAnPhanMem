package client.view.staff;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Font;

public class AddStaffForm extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textStaffphoneNumber;

	/**
	 * Create the panel.
	 */
	public AddStaffForm() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Th\u00F4ng tin c\u01A1 b\u1EA3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(23, 27, 796, 230);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblHTn = new JLabel("H\u1ECD t\u00EAn:");
		lblHTn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHTn.setBounds(12, 32, 49, 19);
		panel.add(lblHTn);
		
		JLabel lblNewLabel = new JLabel("Ng\u00E0y Sinh:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(12, 98, 70, 19);
		panel.add(lblNewLabel);
		
		JLabel lblGiiTnh = new JLabel("Gi\u1EDBi T\u00EDnh");
		lblGiiTnh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGiiTnh.setBounds(470, 32, 55, 19);
		panel.add(lblGiiTnh);
		
		JLabel lblQuQun = new JLabel("Qu\u00EA qu\u00E1n");
		lblQuQun.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuQun.setBounds(470, 98, 64, 19);
		panel.add(lblQuQun);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(120, 30, 229, 35);
		panel.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Nam");
		comboBox.addItem("Nữ");
		comboBox.setBounds(575, 31, 95, 34);
		panel.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(120, 96, 166, 35);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Date");
		btnNewButton_2.setBounds(290, 96, 59, 35);
		panel.add(btnNewButton_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem("Nghệ An");
		comboBox_1.addItem("Đà Nẵng");
		comboBox_1.setBounds(575, 97, 95, 34);
		panel.add(comboBox_1);
		
		JLabel lblSinThoi = new JLabel("Số điện thoại:");
		lblSinThoi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSinThoi.setBounds(12, 162, 89, 19);
		panel.add(lblSinThoi);
		
		textStaffphoneNumber = new JTextField();
		textStaffphoneNumber.setBounds(120, 152, 229, 41);
		panel.add(textStaffphoneNumber);
		textStaffphoneNumber.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Th\u00F4ng tin b\u1EC7nh vi\u1EC7n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(27, 288, 792, 314);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Ch\u1EE9c v\u1EE5:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(40, 71, 59, 19);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblHSLng = new JLabel("H\u1EC7 s\u1ED1 l\u01B0\u01A1ng:");
		lblHSLng.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHSLng.setBounds(390, 71, 83, 19);
		panel_1.add(lblHSLng);
		
		JLabel lblKhoa = new JLabel("Khoa:");
		lblKhoa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKhoa.setBounds(43, 144, 38, 19);
		panel_1.add(lblKhoa);
		
		JLabel lblNewLabel_2 = new JLabel("Lương($/tháng)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(390, 144, 131, 19);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblTrngThiHot = new JLabel("Trạng thái:");
		lblTrngThiHot.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTrngThiHot.setBounds(43, 203, 72, 19);
		panel_1.add(lblTrngThiHot);
		
		JLabel lblMTThm = new JLabel("M\u00F4 t\u1EA3 th\u00EAm:");
		lblMTThm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMTThm.setBounds(391, 197, 82, 19);
		panel_1.add(lblMTThm);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(147, 64, 97, 35);
		panel_1.add(comboBox_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setBounds(532, 64, 199, 35);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(147, 137, 97, 35);
		panel_1.add(comboBox_3);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setBounds(532, 137, 199, 35);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setBounds(532, 195, 199, 36);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4 .addItem("Ok");
		comboBox_4 .addItem("No");
		comboBox_4.setBounds(147, 196, 97, 35);
		panel_1.add(comboBox_4);
		
		JButton btnNewButton = new JButton("L\u01B0u");
		btnNewButton.setBounds(564, 621, 97, 40);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("H\u1EE7y");
		btnNewButton_1.setBounds(673, 621, 97, 38);
		add(btnNewButton_1);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel, lblHTn, lblNewLabel, lblGiiTnh, lblQuQun, textField, comboBox, textField_1, btnNewButton_2, comboBox_1, panel_1, lblNewLabel_1, lblHSLng, lblKhoa, lblNewLabel_2, lblTrngThiHot, lblMTThm, comboBox_2, textField_2, comboBox_3, textField_3, textField_4, comboBox_4, btnNewButton, btnNewButton_1}));

	}
}
