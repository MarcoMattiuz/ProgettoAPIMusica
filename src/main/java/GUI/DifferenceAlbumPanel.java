package GUI;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class DifferenceAlbumPanel extends JPanel {
	
	private JTextField textField;
	private JButton btnHome;

	public DifferenceAlbumPanel() {
		setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(47, 93, 113, 21);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(287, 93, 113, 21);
		add(comboBox_1);
		
		btnHome = new JButton("HOME");
		btnHome.setBounds(355, 269, 85, 21);
		add(btnHome);
		
		JButton btnNewButton_1 = new JButton("Show Result");
		btnNewButton_1.setBounds(47, 196, 85, 21);
		add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(180, 173, 152, 44);
		add(textField);
		textField.setColumns(10);
	}
	
	
	public JButton getBtnHome() {
		return btnHome;
	}

	
}
