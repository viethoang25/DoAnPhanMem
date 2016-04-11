package client.view.staff;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class ManagamentStaff extends JPanel {
	private JTextField txtNameStaff;
	private JTextField txtBdayStaff;
	private JTextField txtCodeStaff;
	private JTextField txtSexStaff;
	private JTable tableStaff;
	private JTextField txtSearchStaff;
	private JTextField txtSearchSalary;
	private JTextField txtSum;
	private JTextField txtSumMoney;
	private JTable tableSalary;

	/**
	 * Create the panel.
	 */
	public ManagamentStaff() {
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 20));
		tabbedPane.setBounds(24, 13, 1135, 648);
		add(tabbedPane);
		
		JPanel panelStaff = new JPanel();
		tabbedPane.addTab("Nh\u00E2n S\u1EF1", null, panelStaff, null);
		panelStaff.setLayout(null);
		
		JLabel lblNhnS = new JLabel("Nh\u00E2n S\u1EF1");
		lblNhnS.setBounds(576, 0, 56, 16);
		panelStaff.add(lblNhnS);
		
		JLabel lblNewLabel = new JLabel("H\u1ECD T\u00EAn:");
		lblNewLabel.setBounds(378, 34, 56, 16);
		panelStaff.add(lblNewLabel);
		
		txtNameStaff = new JTextField();
		txtNameStaff.setBounds(446, 31, 116, 22);
		panelStaff.add(txtNameStaff);
		txtNameStaff.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ng\u00E0y Sinh");
		lblNewLabel_1.setBounds(378, 77, 57, 16);
		panelStaff.add(lblNewLabel_1);
		
		txtBdayStaff = new JTextField();
		txtBdayStaff.setBounds(446, 74, 116, 22);
		panelStaff.add(txtBdayStaff);
		txtBdayStaff.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("M\u00E3 S\u1ED1");
		lblNewLabel_2.setBounds(604, 34, 56, 16);
		panelStaff.add(lblNewLabel_2);
		
		txtCodeStaff = new JTextField();
		txtCodeStaff.setBounds(682, 31, 116, 22);
		panelStaff.add(txtCodeStaff);
		txtCodeStaff.setColumns(10);
		
		JLabel lblGiiTnh = new JLabel("Gi\u1EDBi t\u00EDnh");
		lblGiiTnh.setBounds(604, 77, 56, 16);
		panelStaff.add(lblGiiTnh);
		
		txtSexStaff = new JTextField();
		txtSexStaff.setBounds(682, 74, 116, 22);
		panelStaff.add(txtSexStaff);
		txtSexStaff.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 178, 1130, 359);
		panelStaff.add(scrollPane);
		
		tableStaff = new JTable();
		tableStaff.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Stt", "M\u00E3 S\u1ED1", "H\u1ECD T\u00EAn", "Gi\u1EDBi T\u00EDnh", "Ng\u00E0y Sinh", "Ch\u1EE9c V\u1EE5", "Khoa", "Tr\u1EA1ng Th\u00E1i"
			}
		));
		scrollPane.setViewportView(tableStaff);
		
		JButton btnAddStaff = new JButton("Th\u00EAm");
		btnAddStaff.setBounds(712, 571, 97, 25);
		panelStaff.add(btnAddStaff);
		
		JButton btnDeleteStaff = new JButton("X\u00F3a");
		btnDeleteStaff.setBounds(821, 571, 97, 25);
		panelStaff.add(btnDeleteStaff);
		
		JButton btnUpdateStaff = new JButton("C\u1EADp Nh\u1EADt");
		btnUpdateStaff.setBounds(1021, 571, 97, 25);
		panelStaff.add(btnUpdateStaff);
		
		txtSearchStaff = new JTextField();
		txtSearchStaff.setBounds(431, 138, 348, 33);
		panelStaff.add(txtSearchStaff);
		txtSearchStaff.setColumns(10);
		
		JButton btnSearchStaff = new JButton("T\u00ECm");
		btnSearchStaff.setBounds(803, 142, 97, 25);
		panelStaff.add(btnSearchStaff);
		
		JPanel panelStaffMoney = new JPanel();
		tabbedPane.addTab("Ti\u1EC1n L\u01B0\u01A1ng", null, panelStaffMoney, null);
		panelStaffMoney.setLayout(null);
		
		JLabel lblThngKTin = new JLabel("Th\u1ED1ng k\u00EA ti\u1EC1n l\u01B0\u01A1ng nh\u00E2n s\u1EF1");
		lblThngKTin.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblThngKTin.setBounds(12, 19, 233, 20);
		panelStaffMoney.add(lblThngKTin);
		
		txtSearchSalary = new JTextField();
		txtSearchSalary.setBounds(476, 13, 359, 35);
		panelStaffMoney.add(txtSearchSalary);
		txtSearchSalary.setColumns(10);
		
		JButton btnSearchSalary = new JButton("T\u00ECm");
		btnSearchSalary.setBounds(867, 18, 97, 25);
		panelStaffMoney.add(btnSearchSalary);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 82, 1106, 468);
		panelStaffMoney.add(scrollPane_1);
		
		tableSalary = new JTable();
		tableSalary.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Stt", "M\u00E3 S\u1ED1", "H\u1ECD T\u00EAn", "Ch\u1EE9c V\u1EE5", "Ti\u1EC1n L\u01B0\u01A1ng($/Th\u00E1ng)", "Ti\u1EC1n Th\u01B0\u1EDFng", "Ph\u00ED b\u1EA3o hi\u1EC3m", "Th\u1EF1c L\u0129nh"
			}
		));
		scrollPane_1.setViewportView(tableSalary);
		
		JLabel lblTngS = new JLabel("T\u1ED5ng S\u1ED1:");
		lblTngS.setBounds(12, 580, 56, 16);
		panelStaffMoney.add(lblTngS);
		
		txtSum = new JTextField();
		txtSum.setText("100");
		txtSum.setBounds(78, 577, 56, 22);
		panelStaffMoney.add(txtSum);
		txtSum.setColumns(10);
		
		JLabel lblTngTin = new JLabel("T\u1ED5ng Ti\u1EC1n:");
		lblTngTin.setBounds(189, 580, 63, 16);
		panelStaffMoney.add(lblTngTin);
		
		txtSumMoney = new JTextField();
		txtSumMoney.setText("10000$");
		txtSumMoney.setBounds(278, 577, 116, 22);
		panelStaffMoney.add(txtSumMoney);
		txtSumMoney.setColumns(10);
		
		JLabel lblGiaion = new JLabel("Giai \u0111o\u1EA1n:");
		lblGiaion.setBounds(476, 580, 58, 16);
		panelStaffMoney.add(lblGiaion);
		
		JComboBox cboxStart = new JComboBox();
		cboxStart.setBounds(560, 577, 78, 22);
		panelStaffMoney.add(cboxStart);
		
		JLabel lbln = new JLabel("\u0110\u1EBFn");
		lbln.setBounds(667, 580, 56, 16);
		panelStaffMoney.add(lbln);
		
		JComboBox cboxEnd = new JComboBox();
		cboxEnd.setBounds(735, 577, 72, 22);
		panelStaffMoney.add(cboxEnd);
		
		JButton btnUpdateSalary = new JButton("C\u1EADp Nh\u1EADt");
		btnUpdateSalary.setBounds(987, 576, 97, 25);
		panelStaffMoney.add(btnUpdateSalary);

	}
}
