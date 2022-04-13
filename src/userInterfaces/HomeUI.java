package userInterfaces;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import utils.*;

@SuppressWarnings("serial")
public class HomeUI extends JFrame implements CSmithUI{

	JButton createCharBtn = new JButton("Create New Character");
	JButton exitBtn = new JButton("Exit");
	JLabel picLabel = new JLabel(new ImageIcon("./resources/HomeUIBackground.png"));
	MainPanel mainPanel = new MainPanel();
	Controls controls = new Controls();
	
	@Override
	public void init() {
		exitBtn.addActionListener(this);
		createCharBtn.addActionListener(this);
		controls.add(exitBtn);
		controls.add(createCharBtn);
		
		mainPanel.add(picLabel);
		mainPanel.add(controls, "South");
		this.pack();
		this.setSize(1200, 800);
		this.add(mainPanel);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == createCharBtn) {
			CreatorUI charSmith = new CreatorUI();
			charSmith.init();
			this.dispose();
		}
		else if(e.getSource() == exitBtn) {
			System.exit(0);
		}
		
	}

}
