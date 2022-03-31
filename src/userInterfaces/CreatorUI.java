package userInterfaces;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

import characterTraits.*;
import main.CharacterCreator;
import utils.*;

public class CreatorUI extends JFrame implements CSmithUI {

	JButton doneBtn = new JButton("Done");
	JButton exitBtn = new JButton("Exit");
	MainPanel mainPanel = new MainPanel();
	Controls controls = new Controls();
	
	CharacterClass characterClass;
	int level;
	Race race;
	AbilityScores abilityScores;
	
	@Override
	public void init() {
		exitBtn.addActionListener(this);
		doneBtn.addActionListener(this);
		controls.add(exitBtn);
		controls.add(doneBtn);
		mainPanel.add(controls, "South");
	
		this.pack();
		this.setSize(800, 800);
		this.add(mainPanel);
		this.setVisible(true);

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == exitBtn) {
			HomeUI homeScreen = new HomeUI();
			homeScreen.init();
			this.dispose();
		}
		else if(e.getSource() == doneBtn) {
			if(characterClass == null) {
				Warning.warn("Class Not Selected");
			}
			else if(level == 0) {
				Warning.warn("Level Not Selected");
			}
			else if(race == null) {
				Warning.warn("Race Not Selected");
			}
			else if(abilityScores == null) {
				Warning.warn("Abilities Not Assigned");
			}
			else {
				CharacterCreator.characterClass = characterClass;
				CharacterCreator.level = level;
				CharacterCreator.race = race;
				CharacterCreator.abilityScores = abilityScores;
				
				//Open ExportUI
				
				this.dispose();
				
			}
		}

	}



}
