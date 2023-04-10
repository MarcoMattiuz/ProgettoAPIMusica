package GUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
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

import com.prova.ProgettoAPI.Topalbums;
import com.prova.ProgettoAPI.Topalbums.Album;
import com.prova.ProgettoAPI.Toptracks;
import com.prova.ProgettoAPI.Toptracks.Track;
import com.prova.ProgettoAPI.classes.ApiRequests;
import com.prova.ProgettoAPI.classes.Statistics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class DifferenceTracksPanel extends JPanel {
	private JButton BTNHome;
	private JTextField artistSX;
	private JTextField artistDX;
	private JComboBox comboBoxDX;
	private JTextArea textArea;
	private JLabel lblSelectTwoSongs;
	private JButton ButtonSearch;
	private JButton btnCompare;
	private JComboBox comboBoxSX;
	private JScrollPane scroll;
	
	public DifferenceTracksPanel() {
		setBackground(Color.DARK_GRAY);
		
		
        
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{60, 70, 121, 70,60};
		gridBagLayout.rowHeights = new int[]{51, 57, 22,20,60,100 };
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
		lblTitlePanel_1.setText("Info About Songs");
		lblTitlePanel_1.setForeground(Color.WHITE);
		lblTitlePanel_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		GridBagConstraints gbc_lblTitlePanel_1 = new GridBagConstraints();
		gbc_lblTitlePanel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblTitlePanel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitlePanel_1.gridwidth = 3;
		gbc_lblTitlePanel_1.gridx = 1;
		gbc_lblTitlePanel_1.gridy = 0;
		add(lblTitlePanel_1, gbc_lblTitlePanel_1);
		
		artistSX = new JTextField();
		artistSX.setToolTipText("Insert Artist here...");
		artistSX.setForeground(Color.WHITE);
		artistSX.setBackground(Color.BLACK);
		GridBagConstraints gbc_artistSX = new GridBagConstraints();
		gbc_artistSX.fill = GridBagConstraints.HORIZONTAL;
		gbc_artistSX.anchor = GridBagConstraints.SOUTH;
		gbc_artistSX.insets = new Insets(0, 0, 5, 5);
		gbc_artistSX.gridx = 1;
		gbc_artistSX.gridy = 1;
		add(artistSX, gbc_artistSX);
		artistSX.setColumns(10);
		
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
		
		artistDX = new JTextField();
		artistDX.setToolTipText("Insert Artist here...");
		artistDX.setForeground(Color.WHITE);
		artistDX.setBackground(Color.BLACK);
		artistDX.setHorizontalAlignment(SwingConstants.LEFT);
		artistDX.setColumns(10);
		GridBagConstraints gbc_artistDX = new GridBagConstraints();
		gbc_artistDX.fill = GridBagConstraints.HORIZONTAL;
		gbc_artistDX.anchor = GridBagConstraints.SOUTHWEST;
		gbc_artistDX.insets = new Insets(0, 0, 5, 5);
		gbc_artistDX.gridx = 3;
		gbc_artistDX.gridy = 1;
		add(artistDX, gbc_artistDX);
		
		comboBoxSX = new JComboBox();
		GridBagConstraints gbc_comboBoxSX = new GridBagConstraints();
		gbc_comboBoxSX.anchor = GridBagConstraints.NORTHWEST;
		gbc_comboBoxSX.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxSX.gridx = 1;
		gbc_comboBoxSX.gridy = 2;
		comboBoxSX.setPreferredSize(new Dimension(120,20));
		comboBoxSX.setPrototypeDisplayValue("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		//setMaximumSize(new Dimension(100,comboBoxSX.getPreferredSize().height));
		//(100,comboBoxSX.getPreferredSize().height);
		add(comboBoxSX, gbc_comboBoxSX);
		
		ButtonSearch = new JButton("Search");
		ButtonSearch.setBackground(Color.BLACK);
		ButtonSearch.setForeground(Color.WHITE);
		GridBagConstraints gbc_ButtonSearch = new GridBagConstraints();
		gbc_ButtonSearch.insets = new Insets(0, 0, 5, 5);
		gbc_ButtonSearch.gridx = 2;
		gbc_ButtonSearch.gridy = 2;
		add(ButtonSearch, gbc_ButtonSearch);
		
		comboBoxDX = new JComboBox();
		GridBagConstraints gbc_comboBoxDX = new GridBagConstraints();
		gbc_comboBoxDX.anchor = GridBagConstraints.WEST;
		gbc_comboBoxDX.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxDX.gridx = 3;
		gbc_comboBoxDX.gridy = 2;
		comboBoxDX.setPreferredSize(new Dimension(120,20));
		comboBoxDX.setPrototypeDisplayValue("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		add(comboBoxDX, gbc_comboBoxDX);
		
		lblSelectTwoSongs = new JLabel();
		lblSelectTwoSongs.setText("select two songs and compare");
		lblSelectTwoSongs.setForeground(Color.WHITE);
		lblSelectTwoSongs.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		GridBagConstraints gbc_lblSelectTwoSongs = new GridBagConstraints();
		gbc_lblSelectTwoSongs.insets = new Insets(0, 0, 5, 5);
		gbc_lblSelectTwoSongs.gridx = 2;
		gbc_lblSelectTwoSongs.gridy = 3;
		add(lblSelectTwoSongs, gbc_lblSelectTwoSongs);
		
		textArea = new JTextArea();
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.BLACK);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		
		scroll = new JScrollPane(textArea);
		GridBagConstraints gbc_Scroll = new GridBagConstraints();
		gbc_Scroll.gridwidth = 3;
		gbc_Scroll.gridheight = 2;
		gbc_Scroll.insets = new Insets(0, 0, 5, 5);
		gbc_Scroll.fill = GridBagConstraints.BOTH;
		gbc_Scroll.gridx = 1;
		gbc_Scroll.gridy = 4;
		add(scroll, gbc_Scroll);
		
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
	
	public JButton getButtonSearch() {
		return ButtonSearch;
	}
	
	public JTextField getArtistSX() {
		return artistSX;
	}

	public JTextField getArtistDX() {
		return artistDX;
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

	public JComboBox getComboBoxDX() {
		return comboBoxDX;
	}

	public JComboBox getComboBoxSX() {
		return comboBoxSX;
	}

	public void setComboBoxDX(String nome) {
		comboBoxDX.removeAllItems();
		Toptracks traccie = ApiRequests.GETArtistTopTracks(nome);
		
		
		for (Track iteratore : traccie.getTrack()) {
			comboBoxDX.addItem(iteratore.getName());
		}
	}

	public void setComboBoxSX(String nome) {
		comboBoxSX.removeAllItems();
		Toptracks traccie = ApiRequests.GETArtistTopTracks(nome);
		
		
		for (Track iteratore : traccie.getTrack()) {
			comboBoxSX.addItem(iteratore.getName());
		}
	}

	public JButton getBtnCompare() {
		return btnCompare;
	}

	public JTextArea getTextArea() {
		return textArea;
	}
	
	public void comparazione(String nomeSX, String canzoneSX, String nomeDX, String canzoneDX) {
		com.prova.ProgettoAPI.Track tracciaDestra = ApiRequests.GETTrackInfo(nomeDX, canzoneDX);
		com.prova.ProgettoAPI.Track TracciaSinistra = ApiRequests.GETTrackInfo(nomeSX, canzoneSX);
		System.out.print(Statistics.DifferenceTracks(TracciaSinistra, tracciaDestra));
		textArea.setText(Statistics.DifferenceTracks(TracciaSinistra, tracciaDestra));
	}
}
