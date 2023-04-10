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
			fin.setSongsDiff();
		}else if(e.getSource() == fin.getTopArtistBTN()) {
			fin.setTopArtista();
		}else if(e.getSource() == fin.getTopSongsBTN()) {
			fin.setTopSongs();
		}else if(e.getSource() == fin.getDiffTraAlbum().getBTNHome()) {
			fin.getDiffTraAlbum().setVisible(false);
			fin.setHome();
		}else if(e.getSource() == fin.getDiffTraTracce().getBTNHome()) {
			fin.getDiffTraTracce().setVisible(false);
			fin.setHome();
		}else if(e.getSource() == fin.getTopArtRegione().getBTNHome()) {
			fin.getTopArtRegione().setVisible(false);
			fin.setHome();
		}else if(e.getSource() == fin.getTopTrackRegione().getBTNHome()) {
			fin.getTopTrackRegione().setVisible(false);
			fin.setHome();
		}else if(e.getSource() == fin.getTopArtRegione().getButtonSearch()) {
			fin.getTopArtRegione().addClassifica();
		}else if(e.getSource() == fin.getTopTrackRegione().getButtonSearch()) {
			fin.getTopTrackRegione().addClassifica();
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
