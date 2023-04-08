package GUI;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;

public class TopTracksbyRegionPanel extends JPanel{
	private JTextField txtTopCanzoneDi;
	public TopTracksbyRegionPanel() {
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		txtTopCanzoneDi = new JTextField();
		txtTopCanzoneDi.setText("top canzone di una regione");
		txtTopCanzoneDi.setColumns(10);
		txtTopCanzoneDi.setBounds(130, 134, 152, 19);
		add(txtTopCanzoneDi);
	}

}
