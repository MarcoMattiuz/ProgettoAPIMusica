package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Controller implements ActionListener, ListSelectionListener{

	private Jframe_Principale fin;
	
	public Controller(Jframe_Principale fin) {
		this.fin = fin;
		fin.setAscoltatore(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == fin.getDiffBetweenAlbumBTN()) {
			fin.setAlbumDiff();
		}else if(e.getSource() == fin.getDiffBetweenSongsBTN()) {
		}else if(e.getSource() == fin.getTopArtistBTN()) {
		}else if(e.getSource() == fin.getTopSongsBTN()) {
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
