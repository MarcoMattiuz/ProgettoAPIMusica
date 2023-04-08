package GUI;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;

public class TopArtistbyRegionPanel extends JPanel{
	private JTextField textField;
	public TopArtistbyRegionPanel() {
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		textField = new JTextField();
		textField.setText("top artista di una regione");
		textField.setColumns(10);
		textField.setBounds(102, 183, 152, 19);
		add(textField);
	}

}
