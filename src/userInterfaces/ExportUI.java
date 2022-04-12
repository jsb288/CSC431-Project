package userInterfaces;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

import utils.Warning;

@SuppressWarnings("serial")
public class ExportUI extends JFrame implements CSmithUI{

	JButton exitBtn = new JButton("Exit");
	JButton exportBtn = new JButton("Export");
	
	Controls controls = new Controls();
	MainPanel mainPanel = new MainPanel();
	
	@Override
	public void init() {
		exitBtn.addActionListener(this);
		exportBtn.addActionListener(this);
		controls.add(exitBtn);
		controls.add(exportBtn);
		mainPanel.add(controls, "South");
		this.pack();
		this.setSize(800,800);
		this.add(mainPanel);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == exitBtn) {
			this.dispose();
		}
		else if (e.getSource() == exportBtn) {
			
			//Export character
			
			
			Warning.warn("Character Exported Succesfully!");
			HomeUI homeScreen = new HomeUI();
			homeScreen.init();
			this.dispose();
			
		}
	}

}
