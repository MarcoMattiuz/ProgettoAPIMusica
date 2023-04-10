package GUI;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;

import javax.swing.JTextField;

import com.prova.ProgettoAPI.Topartists;
import com.prova.ProgettoAPI.Topartists.Artist;
import com.prova.ProgettoAPI.classes.ApiRequests;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;

public class TopArtistbyRegionPanel extends JPanel{
	private JButton BTNHome;
	private JButton ButtonSearch;
	private JTextField txtInsertRegiontHere;
	private JTextArea textArea;
	private JScrollPane scroll;
	private JPanel panel;
	
	public TopArtistbyRegionPanel() {
		setBackground(Color.DARK_GRAY);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{60, 70, 121, 70,60};
		gridBagLayout.rowHeights = new int[]{51, 57, 10, 134,47,20 };
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0};
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
		lblTitlePanel_1.setText("Artists Ranking By Country");
		lblTitlePanel_1.setForeground(Color.WHITE);
		lblTitlePanel_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		GridBagConstraints gbc_lblTitlePanel_1 = new GridBagConstraints();
		gbc_lblTitlePanel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblTitlePanel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitlePanel_1.gridwidth = 3;
		gbc_lblTitlePanel_1.gridx = 1;
		gbc_lblTitlePanel_1.gridy = 0;
		add(lblTitlePanel_1, gbc_lblTitlePanel_1);
		
		panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.DARK_GRAY);
		panel.setOpaque(false);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 3;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0 };
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblSearch = new JLabel();
		GridBagConstraints gbc_lblSearch = new GridBagConstraints();
		gbc_lblSearch.insets = new Insets(0, 0, 5, 0);
		gbc_lblSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblSearch.gridwidth = 2;
		gbc_lblSearch.gridx = 1;
		gbc_lblSearch.gridy = 0;
		panel.add(lblSearch, gbc_lblSearch);
		lblSearch.setText("insert the Country");
		lblSearch.setForeground(Color.WHITE);
		lblSearch.setFont(new Font("Segoe UI Black", Font.PLAIN, 15
				));
		
		txtInsertRegiontHere = new JTextField();
		GridBagConstraints gbc_txtInsertRegiontHere = new GridBagConstraints();
		gbc_txtInsertRegiontHere.insets = new Insets(0, 0, 5, 0);
		gbc_txtInsertRegiontHere.gridx = 2;
		gbc_txtInsertRegiontHere.gridy = 1;
		panel.add(txtInsertRegiontHere, gbc_txtInsertRegiontHere);
		txtInsertRegiontHere.setToolTipText("Insert Artist here...");
		txtInsertRegiontHere.setForeground(Color.WHITE);
		txtInsertRegiontHere.setBackground(Color.BLACK);
		txtInsertRegiontHere.setColumns(10);
		
		ButtonSearch = new JButton("Search");
		GridBagConstraints gbc_ButtonSearch = new GridBagConstraints();
		gbc_ButtonSearch.insets = new Insets(0, 0, 5, 0);
		gbc_ButtonSearch.gridx = 2;
		gbc_ButtonSearch.gridy = 2;
		panel.add(ButtonSearch, gbc_ButtonSearch);
		ButtonSearch.setBackground(Color.BLACK);
		ButtonSearch.setForeground(Color.WHITE);
		

		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBackground(Color.BLACK);
		textArea.setForeground(Color.WHITE);


		scroll = new JScrollPane(textArea);
		GridBagConstraints gbc_Scroll = new GridBagConstraints();
		gbc_Scroll.insets = new Insets(0, 0, 5, 5);
		gbc_Scroll.fill = GridBagConstraints.BOTH;
		gbc_Scroll.gridx = 2;
		gbc_Scroll.gridy = 3;
		add(scroll, gbc_Scroll);
		
		
	}

	public JButton getBTNHome() {
		return BTNHome;
	}
	
	public JButton getButtonSearch() {
		return ButtonSearch;
	}

	public void addClassifica() {
		String classifica = "";
		Topartists artists =  ApiRequests.GETCountryTopArtist(txtInsertRegiontHere.getText());
		int i=1;
		
		for (Artist iteratore : artists.getArtist()) {
			if(i<=50) {
				classifica += i+" "+iteratore.getName()+"\n";
				i++;
			}	
		}
		
		//System.out.println(classifica);
		
		textArea.setText(classifica);
		
	}
	
	  @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D g2d = (Graphics2D) g;
	        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	        int w = getWidth(), h = getHeight();
	        Color color1 = Color.RED;
	        Color color2 = Color.GREEN;
	        GradientPaint gp = new GradientPaint(0, 0,
                  getBackground().brighter().brighter(), 0, getHeight(),
                  getBackground().darker().darker());
	        g2d.setPaint(gp);
	        g2d.fillRect(0, 0, w, h);
	    }
	
}
