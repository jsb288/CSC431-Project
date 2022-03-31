package userInterfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public interface CSmithUI extends ActionListener{

	
	class MainPanel extends JPanel {
		public MainPanel() {
			super(new BorderLayout());
			setBackground(Color.white);
		}
	}
	
	
	public class Controls extends JPanel {
		public Controls() {
			setBackground(Color.blue);
		}
	}
	
	
	void init();
	
	@Override
	public void actionPerformed(ActionEvent e);
	
	

}
