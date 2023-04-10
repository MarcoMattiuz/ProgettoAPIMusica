package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
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
			fin.getDiffTraAlbum().getArtistDX().setText(null);
			fin.getDiffTraAlbum().getArtistSX().setText(null);
			fin.getDiffTraAlbum().getComboBoxDX().removeAllItems();
			fin.getDiffTraAlbum().getComboBoxSX().removeAllItems();
			fin.getDiffTraAlbum().getTextArea().setText(null);
			fin.getDiffTraAlbum().setVisible(false);
			fin.setHome();
		}else if(e.getSource() == fin.getDiffTraTracce().getBTNHome()) {
			fin.getDiffTraTracce().getArtistDX().setText(null);
			fin.getDiffTraTracce().getArtistSX().setText(null);
			fin.getDiffTraTracce().getComboBoxDX().removeAllItems();
			fin.getDiffTraTracce().getComboBoxSX().removeAllItems();
			fin.getDiffTraTracce().getTextArea().setText(null);
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
		}else if(e.getSource() == fin.getDiffTraAlbum().getButtonSearch()) {
			if(!fin.getDiffTraAlbum().getArtistDX().getText().isEmpty() && !fin.getDiffTraAlbum().getArtistSX().getText().isEmpty()) {
				fin.getDiffTraAlbum().setComboBoxDX(fin.getDiffTraAlbum().getArtistDX().getText());
				fin.getDiffTraAlbum().setComboBoxSX(fin.getDiffTraAlbum().getArtistSX().getText());
			}
		}else if(e.getSource() == fin.getDiffTraAlbum().getBtnCompare()) {
			if(!fin.getDiffTraAlbum().getArtistDX().getText().isEmpty() && !fin.getDiffTraAlbum().getArtistSX().getText().isEmpty()) {
				String nomeSX = fin.getDiffTraAlbum().getArtistSX().getText();
				String albumSX = (String) fin.getDiffTraAlbum().getComboBoxSX().getSelectedItem();
				String nomeDX = fin.getDiffTraAlbum().getArtistDX().getText();
				String albumDX = (String) fin.getDiffTraAlbum().getComboBoxDX().getSelectedItem();
				
				fin.getDiffTraAlbum().comparazione(nomeSX, albumSX, nomeDX, albumDX);
				//System.out.println("sx "+nomeSX+" "+albumSX+"\ndx "+nomeDX+" "+albumDX);
			}
		}else if(e.getSource() == fin.getDiffTraTracce().getButtonSearch()) {
			if(!fin.getDiffTraTracce().getArtistDX().getText().isEmpty() && !fin.getDiffTraTracce().getArtistSX().getText().isEmpty()) {
				fin.getDiffTraTracce().setComboBoxDX(fin.getDiffTraTracce().getArtistDX().getText());
				fin.getDiffTraTracce().setComboBoxSX(fin.getDiffTraTracce().getArtistSX().getText());
			}
		}else if(e.getSource() == fin.getDiffTraTracce().getBtnCompare()) {
			if(!fin.getDiffTraTracce().getArtistDX().getText().isEmpty() && !fin.getDiffTraTracce().getArtistSX().getText().isEmpty()) {
				String nomeSX = fin.getDiffTraTracce().getArtistSX().getText();
				String songSX = (String) fin.getDiffTraTracce().getComboBoxSX().getSelectedItem();
				String nomeDX = fin.getDiffTraTracce().getArtistDX().getText();
				String songDX = (String) fin.getDiffTraTracce().getComboBoxDX().getSelectedItem();
				
				fin.getDiffTraTracce().comparazione(nomeSX, songSX, nomeDX, songDX);
				//System.out.println("sx "+nomeSX+" "+albumSX+"\ndx "+nomeDX+" "+albumDX);
			}
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
