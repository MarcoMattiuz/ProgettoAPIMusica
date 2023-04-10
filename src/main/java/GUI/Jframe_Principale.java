package GUI;

import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;



import javax.swing.JComboBox;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import javax.swing.Icon;


public class Jframe_Principale extends JFrame {
	
	private JPanel finestra;
	private JLabel lblTitolo;
	private JComboBox comboBox;
	private DifferenceAlbumPanel diffTraAlbum;
	private DifferenceTracksPanel diffTraTracce;
	private TopArtistbyRegionPanel topArtRegione;
	private TopTracksbyRegionPanel topTrackRegione;
	private JButton topArtistBTN;
	private JButton diffBetweenAlbumBTN;
	private JButton diffBetweenSongsBTN;
	private JLabel lblDrake;
	private JLabel lblPostMalone = null;
	private JLabel lblBoh;
	private JButton topSongsBTN;
	private JLabel lblSubtitle;


	public Jframe_Principale() {
		
//		try {
//		    final BufferedImage backgroundImage = javax.imageio.ImageIO.read(new File("assets/gradient.png"));
//		    setContentPane(new JPanel(new BorderLayout()) {
//		        @Override public void paintComponent(Graphics g) {
//		            g.drawImage(backgroundImage, 0, 0, null);
//		        }
//		    });
//		} catch (IOException e) {
//		    throw new RuntimeException(e);
//		}
//		

	    
	    
		setTitle("Music Watcher");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);

		
		finestra = new JPanel() {
	        @Override
	        protected void paintComponent(Graphics grphcs) {
	            super.paintComponent(grphcs);
	            Graphics2D g2d = (Graphics2D) grphcs;
	            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	                    RenderingHints.VALUE_ANTIALIAS_ON);
	            GradientPaint gp = new GradientPaint(0, 0,
	                    getBackground().brighter().brighter(), 0, getHeight(),
	                    getBackground().darker().darker());
	            g2d.setPaint(gp);
	            g2d.fillRect(0, 0, getWidth(), getHeight()); 

	        }

	    };
		finestra.setBackground(Color.DARK_GRAY);
		finestra.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(finestra);
		finestra.setLayout(null);
		
		topArtistBTN = new JButton("Top artists by country");
		topArtistBTN.setForeground(Color.WHITE);
		topArtistBTN.setBackground(Color.BLACK);
		topArtistBTN.setBounds(189, 331, 160, 160);
		finestra.add(topArtistBTN);
		
		topSongsBTN = new JButton("Top songs by country");
		topSongsBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		topSongsBTN.setForeground(Color.WHITE);
		topSongsBTN.setBackground(Color.BLACK);
		topSongsBTN.setBounds(189, 170, 160, 160);
		finestra.add(topSongsBTN);
		
		diffBetweenAlbumBTN = new JButton("Diff. between Album");
		diffBetweenAlbumBTN.setForeground(Color.WHITE);
		diffBetweenAlbumBTN.setBackground(Color.BLACK);
		diffBetweenAlbumBTN.setBounds(353, 170, 160, 160);
		finestra.add(diffBetweenAlbumBTN);
		
		diffBetweenSongsBTN = new JButton("Diff. between Songs");
		diffBetweenSongsBTN.setForeground(Color.WHITE);
		diffBetweenSongsBTN.setBackground(Color.BLACK);
		diffBetweenSongsBTN.setBounds(353, 331, 160, 160);
		finestra.add(diffBetweenSongsBTN);
		
		lblTitolo = new JLabel();
		lblTitolo.setFont(new Font("Segoe UI Black", Font.PLAIN, 90));
		lblTitolo.setForeground(Color.WHITE);
		lblTitolo.setText("last.FM");
		lblTitolo.setBounds(189, 11, 343, 74);
		finestra.add(lblTitolo);
		
		try {
			lblDrake = new JLabel(new ImageIcon(ImageIO.read(new File("assets/drake2_1_70.png"))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lblDrake.setBounds(0, 154, 343, 440);
		finestra.add(lblDrake);
		
		
		try {
			lblPostMalone = new JLabel(new ImageIcon(ImageIO.read(new File("assets/postmalone_3_25.png"))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lblPostMalone.setBounds(386, 170, 348, 405);
		finestra.add(lblPostMalone);
		
		lblSubtitle = new JLabel();
		lblSubtitle.setText("Music Watcher");
		lblSubtitle.setForeground(Color.WHITE);
		lblSubtitle.setFont(new Font("Segoe UI Black", Font.PLAIN, 35));
		lblSubtitle.setBounds(231, 85, 266, 74);
		finestra.add(lblSubtitle);
		
	
		
		diffTraAlbum = new DifferenceAlbumPanel();
		diffTraTracce = new DifferenceTracksPanel();
		topArtRegione = new TopArtistbyRegionPanel();
		topTrackRegione = new TopTracksbyRegionPanel();
		
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public void setAscoltatore(Controller c){
		topArtistBTN.addActionListener(c);
		topSongsBTN.addActionListener(c);
		diffBetweenAlbumBTN.addActionListener(c);
		diffBetweenSongsBTN.addActionListener(c);
		diffTraAlbum.getBTNHome().addActionListener(c);
		diffTraTracce.getBTNHome().addActionListener(c);
		topArtRegione.getBTNHome().addActionListener(c);
		topTrackRegione.getBTNHome().addActionListener(c);
		topArtRegione.getButtonSearch().addActionListener(c);
		topTrackRegione.getButtonSearch().addActionListener(c);
		diffTraAlbum.getButtonSearch().addActionListener(c);
		diffTraAlbum.getBtnCompare().addActionListener(c);
		diffTraTracce.getButtonSearch().addActionListener(c);
		diffTraTracce.getBtnCompare().addActionListener(c);
	}

	
	public JComboBox getComboBox() {
		return comboBox;
	}

	public JButton getTopArtistBTN() {
		return topArtistBTN;
	}

	public JButton getDiffBetweenAlbumBTN() {
		return diffBetweenAlbumBTN;
	}

	public JButton getDiffBetweenSongsBTN() {
		return diffBetweenSongsBTN;
	}

	public JButton getTopSongsBTN() {
		return topSongsBTN;
	}
	
	public void setAlbumDiff() {
		finestra.setVisible(false);
		diffTraAlbum.setVisible(true);
		this.setMinimumSize(new Dimension(800, 400));
		setContentPane(diffTraAlbum);
	}
	
	public void setSongsDiff() {
		finestra.setVisible(false);
		diffTraTracce.setVisible(true);
		setContentPane(diffTraTracce);
	}
	
	public void setTopArtista() {
		finestra.setVisible(false);
		topArtRegione.setVisible(true);
		setContentPane(topArtRegione);
	}
	
	public void setTopSongs() {
		finestra.setVisible(false);
		topTrackRegione.setVisible(true);
		setContentPane(topTrackRegione);
	}
	
	public void setHome() {
		finestra.setVisible(true);
		setContentPane(finestra);
	}
	
	public DifferenceAlbumPanel getDiffTraAlbum() {
		return diffTraAlbum;
	}

	public DifferenceTracksPanel getDiffTraTracce() {
		return diffTraTracce;
	}

	public TopArtistbyRegionPanel getTopArtRegione() {
		return topArtRegione;
	}

	public TopTracksbyRegionPanel getTopTrackRegione() {
		return topTrackRegione;
	}
}
