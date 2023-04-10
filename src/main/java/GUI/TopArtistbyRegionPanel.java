package GUI;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.swing.JTextField;

public class TopArtistbyRegionPanel extends JPanel{
	
	private JTextField textField;
	private JButton BTNHome;
	
	public TopArtistbyRegionPanel() {
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		textField = new JTextField();
		textField.setText("top artista di una regione");
		textField.setColumns(10);
		textField.setBounds(102, 183, 152, 19);
		add(textField);
		
		try {
			BTNHome = new JButton(new ImageIcon(ImageIO.read(new File("assets/homebtn.png"))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BTNHome.setBounds(248, 10, 85, 51);
		add(BTNHome);
	}

	public JButton getBTNHome() {
		return BTNHome;
	}
	
}
