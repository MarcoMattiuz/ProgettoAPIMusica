package GUI;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;

public class DifferenceAlbumPanel extends JPanel {
	
	private JTextField txtDifferenzaTraAlbum;
	private JButton BTNHome;

	public DifferenceAlbumPanel() {
		setBackground(new Color(64, 64, 64));
		setLayout(null);
		
		txtDifferenzaTraAlbum = new JTextField();
		txtDifferenzaTraAlbum.setText("differenza tra album");
		txtDifferenzaTraAlbum.setBounds(121, 147, 152, 19);
		add(txtDifferenzaTraAlbum);
		txtDifferenzaTraAlbum.setColumns(10);
		
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
