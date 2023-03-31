package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{

	private FinestraPrima fin;
	private String s;
	
	public Controller(FinestraPrima fin) {
		this.fin = fin;
		fin.setAscoltatore(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		s = (String) fin.getComboBox().getSelectedItem();
		System.out.println(s);
	}
	
	
	
}
