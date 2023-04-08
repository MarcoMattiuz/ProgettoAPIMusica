package GUI;

import java.awt.Font;
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

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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
	private JButton topSongsBTN;


	public Jframe_Principale() {
		setTitle("Music Watcher");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 600);

		
		finestra = new JPanel();
		finestra.setBackground(Color.DARK_GRAY);
		finestra.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(finestra);
		finestra.setLayout(null);
		
		topArtistBTN = new JButton("Top 3 artists by region");
		topArtistBTN.setForeground(Color.GREEN);
		topArtistBTN.setBackground(Color.BLACK);
		topArtistBTN.setBounds(189, 331, 160, 160);
		finestra.add(topArtistBTN);
		
		topSongsBTN = new JButton("Top 3 songs by region");
		topSongsBTN.setForeground(Color.GREEN);
		topSongsBTN.setBackground(Color.BLACK);
		topSongsBTN.setBounds(189, 170, 160, 160);
		finestra.add(topSongsBTN);
		
		diffBetweenAlbumBTN = new JButton("Diff. between Album");
		diffBetweenAlbumBTN.setForeground(Color.GREEN);
		diffBetweenAlbumBTN.setBackground(Color.BLACK);
		diffBetweenAlbumBTN.setBounds(353, 170, 160, 160);
		finestra.add(diffBetweenAlbumBTN);
		
		diffBetweenSongsBTN = new JButton("Diff. between Songs");
		diffBetweenSongsBTN.setForeground(Color.GREEN);
		diffBetweenSongsBTN.setBackground(Color.BLACK);
		diffBetweenSongsBTN.setBounds(353, 331, 160, 160);
		finestra.add(diffBetweenSongsBTN);
		
		lblTitolo = new JLabel();
		lblTitolo.setFont(new Font("Segoe UI Black", Font.PLAIN, 33));
		lblTitolo.setForeground(Color.GREEN);
		lblTitolo.setText("LastFM");
		lblTitolo.setBounds(287, 84, 159, 59);
		finestra.add(lblTitolo);
		
		try {
			lblDrake = new JLabel(new ImageIcon(ImageIO.read(new File("assets/drake.png"))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lblDrake.setBounds(544, 377, 192, 186);
		finestra.add(lblDrake);
		
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
		setContentPane(diffTraAlbum);
	}
	
	public void setSongsDiff() {
		finestra.setVisible(false);
		setContentPane(diffTraTracce);
	}
	
	public void setTopArtista() {
		finestra.setVisible(false);
		setContentPane(topArtRegione);
	}
	
	public void setTopSongs() {
		finestra.setVisible(false);
		setContentPane(topTrackRegione);
	}
	
}
