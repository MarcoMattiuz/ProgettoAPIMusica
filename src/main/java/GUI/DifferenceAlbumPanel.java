package GUI;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class DifferenceAlbumPanel extends JPanel {
	
	private JTextField txtDifferenzaTraAlbum;
	public DifferenceAlbumPanel() {
		setBackground(new Color(64, 64, 64));
		setLayout(null);
		
		txtDifferenzaTraAlbum = new JTextField();
		txtDifferenzaTraAlbum.setText("differenza tra album");
		txtDifferenzaTraAlbum.setBounds(121, 147, 152, 19);
		add(txtDifferenzaTraAlbum);
		txtDifferenzaTraAlbum.setColumns(10);
	}
	
	
}
