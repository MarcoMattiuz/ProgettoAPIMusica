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
