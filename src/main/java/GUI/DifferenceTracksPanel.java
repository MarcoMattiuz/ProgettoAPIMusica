package GUI;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;

public class DifferenceTracksPanel extends JPanel {
	private JTextField txtDifferenzaTraTracce;
	public DifferenceTracksPanel() {
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		txtDifferenzaTraTracce = new JTextField();
		txtDifferenzaTraTracce.setBounds(114, 136, 135, 19);
		txtDifferenzaTraTracce.setText("differenza tra tracce");
		txtDifferenzaTraTracce.setColumns(10);
		add(txtDifferenzaTraTracce);
	}

}
