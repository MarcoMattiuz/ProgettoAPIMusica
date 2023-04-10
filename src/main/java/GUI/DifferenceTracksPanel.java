package GUI;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.swing.JTextField;

public class DifferenceTracksPanel extends JPanel {
	private JTextField txtDifferenzaTraTracce;
	private JButton BTNHome;
	
	public DifferenceTracksPanel() {
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		txtDifferenzaTraTracce = new JTextField();
		txtDifferenzaTraTracce.setBounds(114, 136, 135, 19);
		txtDifferenzaTraTracce.setText("differenza tra tracce");
		txtDifferenzaTraTracce.setColumns(10);
		add(txtDifferenzaTraTracce);
		
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
