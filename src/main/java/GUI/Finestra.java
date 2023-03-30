package GUI;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;


public class Finestra extends JFrame {
	
	private JPanel finestra;
	private JLabel lblTitolo;
	private JComboBox comboBox;

	public Finestra() {
		setTitle("Music Watcher");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);

		
		finestra = new JPanel();
		finestra.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(finestra);
		finestra.setLayout(null);
		
		String[] valori = {"1","2","3","4","5","6","7","8","9"};
		
		comboBox = new JComboBox(valori);
		comboBox.setToolTipText("");
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setBackground(new Color(176, 224, 230));
		comboBox.setBounds(111, 77, 107, 31);
		finestra.add(comboBox);
		
		/*lblTitolo = new JLabel("");
		lblTitolo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitolo.setFont(new Font("Impact", Font.BOLD, 30));
		lblTitolo.setBounds(104, 43, 220, 50);
		lblTitolo.setIcon(getMap().getImg("logo"));
		StartWindow.add(lblTitolo);
		
		btnStartGame = new JButton("Play");
		btnStartGame.setBounds(185, 152, 83, 29);
		StartWindow.add(btnStartGame);*/
		
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public void setAscoltatore(Controller c){
		comboBox.addActionListener(c);
	}

	
	public JComboBox getComboBox() {
		return comboBox;
	}
}
