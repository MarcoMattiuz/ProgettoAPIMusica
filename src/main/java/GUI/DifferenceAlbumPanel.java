package GUI;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class DifferenceAlbumPanel extends JPanel {
	private JButton BTNHome;
	private JTextField txtInsertArtistHere;
	private JTextField txtInsertArtistHere_1;
	private JComboBox comboBox_1;
	private JTextArea textArea;
	private JLabel lblSelectTwoSongs;
	private JButton btnNewButton;
	private JButton btnCompare;
	
	public DifferenceAlbumPanel() {
		setBackground(Color.DARK_GRAY);
		
		
        
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{60, 70, 121, 70,60};
		gridBagLayout.rowHeights = new int[]{51, 57, 22,20,60,100,20 };
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0};
		setLayout(gridBagLayout);
		try {
			BTNHome = new JButton(new ImageIcon(ImageIO.read(new File("assets/icoHouse.png"))));
			BTNHome.setForeground(Color.WHITE);
			BTNHome.setBackground(Color.BLACK);
			BTNHome.setBorder(null);
			BTNHome.setBorderPainted(false);
			BTNHome.setContentAreaFilled(false);
			BTNHome.setOpaque(false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GridBagConstraints gbc_BTNHome = new GridBagConstraints();
		gbc_BTNHome.fill = GridBagConstraints.BOTH;
		gbc_BTNHome.insets = new Insets(0, 0, 5, 5);
		gbc_BTNHome.gridx = 0;
		gbc_BTNHome.gridy = 0;
		add(BTNHome, gbc_BTNHome);
		
		JLabel lblTitlePanel_1 = new JLabel();
		lblTitlePanel_1.setText("Info About Albums");
		lblTitlePanel_1.setForeground(Color.WHITE);
		lblTitlePanel_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		GridBagConstraints gbc_lblTitlePanel_1 = new GridBagConstraints();
		gbc_lblTitlePanel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblTitlePanel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitlePanel_1.gridwidth = 3;
		gbc_lblTitlePanel_1.gridx = 1;
		gbc_lblTitlePanel_1.gridy = 0;
		add(lblTitlePanel_1, gbc_lblTitlePanel_1);
		
		txtInsertArtistHere = new JTextField();
		txtInsertArtistHere.setToolTipText("Insert Artist here...");
		txtInsertArtistHere.setForeground(Color.WHITE);
		txtInsertArtistHere.setBackground(Color.BLACK);
		GridBagConstraints gbc_txtInsertArtistHere = new GridBagConstraints();
		gbc_txtInsertArtistHere.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInsertArtistHere.anchor = GridBagConstraints.SOUTH;
		gbc_txtInsertArtistHere.insets = new Insets(0, 0, 5, 5);
		gbc_txtInsertArtistHere.gridx = 1;
		gbc_txtInsertArtistHere.gridy = 1;
		add(txtInsertArtistHere, gbc_txtInsertArtistHere);
		txtInsertArtistHere.setColumns(10);
		
		JLabel lblSearch = new JLabel();
		lblSearch.setText("search by Artist");
		lblSearch.setForeground(Color.WHITE);
		lblSearch.setFont(new Font("Segoe UI Black", Font.PLAIN, 15
				));
		GridBagConstraints gbc_lblSearch = new GridBagConstraints();
		gbc_lblSearch.fill = GridBagConstraints.VERTICAL;
		gbc_lblSearch.insets = new Insets(0, 0, 5, 5);
		gbc_lblSearch.gridx = 2;
		gbc_lblSearch.gridy = 1;
		add(lblSearch, gbc_lblSearch);
		
		txtInsertArtistHere_1 = new JTextField();
		txtInsertArtistHere_1.setToolTipText("Insert Artist here...");
		txtInsertArtistHere_1.setForeground(Color.WHITE);
		txtInsertArtistHere_1.setBackground(Color.BLACK);
		txtInsertArtistHere_1.setHorizontalAlignment(SwingConstants.LEFT);
		txtInsertArtistHere_1.setColumns(10);
		GridBagConstraints gbc_txtInsertArtistHere_1 = new GridBagConstraints();
		gbc_txtInsertArtistHere_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_txtInsertArtistHere_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtInsertArtistHere_1.gridx = 3;
		gbc_txtInsertArtistHere_1.gridy = 1;
		add(txtInsertArtistHere_1, gbc_txtInsertArtistHere_1);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.anchor = GridBagConstraints.NORTH;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 2;
		add(comboBox, gbc_comboBox);
		
		btnNewButton = new JButton("Search");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 2;
		add(btnNewButton, gbc_btnNewButton);
		
		comboBox_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 3;
		gbc_comboBox_1.gridy = 2;
		add(comboBox_1, gbc_comboBox_1);
		
		lblSelectTwoSongs = new JLabel();
		lblSelectTwoSongs.setText("select two albums and compare");
		lblSelectTwoSongs.setForeground(Color.WHITE);
		lblSelectTwoSongs.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		GridBagConstraints gbc_lblSelectTwoSongs = new GridBagConstraints();
		gbc_lblSelectTwoSongs.insets = new Insets(0, 0, 5, 5);
		gbc_lblSelectTwoSongs.gridx = 2;
		gbc_lblSelectTwoSongs.gridy = 4;
		add(lblSelectTwoSongs, gbc_lblSelectTwoSongs);
		
		textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 2;
		gbc_textArea.gridy = 5;
		add(textArea, gbc_textArea);
		
		btnCompare = new JButton("Compare");
		btnCompare.setForeground(Color.WHITE);
		btnCompare.setBackground(Color.BLACK);
		GridBagConstraints gbc_btnCompare = new GridBagConstraints();
		gbc_btnCompare.insets = new Insets(0, 0, 0, 5);
		gbc_btnCompare.gridx = 2;
		gbc_btnCompare.gridy = 6;
		add(btnCompare, gbc_btnCompare);
		
	}

	public JButton getBTNHome() {
		return BTNHome;
	}
	
	   @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D g2d = (Graphics2D) g;
	        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	        int w = getWidth(), h = getHeight();
	        Color color1 = Color.RED;
	        Color color2 = Color.GREEN;
	        GradientPaint gp = new GradientPaint(100, 50,
                    getBackground().brighter().brighter(), 0, getHeight(),
                    getBackground().darker().darker());
	        g2d.setPaint(gp);
	        g2d.fillRect(0, 0, w, h);
	    }
}
