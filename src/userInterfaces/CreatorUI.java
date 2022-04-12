package userInterfaces;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import characterTraits.*;
import main.CharacterCreator;
import utils.*;

@SuppressWarnings("serial")
public class CreatorUI extends JFrame implements CSmithUI {

	//Declaring all components of UI
	
	JButton doneBtn = new JButton("Done");
	JButton exitBtn = new JButton("Exit");
	
	JList<CharacterClass> characterClasses = new JList<CharacterClass>(Classes.classList);
	JScrollPane characterClassesPane = new JScrollPane(characterClasses);
	
	JList<Race> characterRaces = new JList<Race>();
	
	JTextField inputStrScore = new JTextField();
	JLabel strScoreLbl = new JLabel("Strength Score:");
	
	JTextField inputDexScore = new JTextField("");
	JLabel dexScoreLbl = new JLabel("Dexterity Score:");
	
	JTextField inputConScore = new JTextField("");
	JLabel conScoreLbl = new JLabel("Constitution Score:");
	
	JTextField inputIntScore = new JTextField("");
	JLabel intScoreLbl = new JLabel("Intellegence Score:");
	
	JTextField inputWisScore = new JTextField("");
	JLabel wisScoreLbl = new JLabel("Wisdom Score:");
	
	JTextField inputChaScore = new JTextField("");
	JLabel chaScoreLbl = new JLabel("Charisma Score:");
	
	MainPanel mainPanel = new MainPanel();
	Controls controls = new Controls();
	
	
	CharacterClass characterClass;
	int level;
	Race race;
	AbilityScore abilityScores[];
	
	//TODO need to break this apart into different methods
	/**Initialize and launch CharacterCreationUI**/
	@Override
	public void init() {
		exitBtn.addActionListener(this);
		doneBtn.addActionListener(this);
		
		controls.add(exitBtn);
		controls.add(doneBtn);
		
		
		
		characterClassesPane.setBounds(200,50,150,40);
		characterClassesPane.add(characterClasses);
		mainPanel.add(characterClassesPane);
		
		inputStrScore.setBounds(200,100,150,40);
		inputDexScore.setBounds(200,150,150,40);
		inputConScore.setBounds(200,200,150,40);
		inputIntScore.setBounds(200,250,150,40);
		inputWisScore.setBounds(200,300,150,40);
		inputChaScore.setBounds(200,350,150,40);
		
		inputStrScore.addActionListener(this);
		inputDexScore.addActionListener(this);
		inputConScore.addActionListener(this);
		inputIntScore.addActionListener(this);
		inputWisScore.addActionListener(this);
		inputChaScore.addActionListener(this);
		
		strScoreLbl.setBounds(50,100,150,40);
		dexScoreLbl.setBounds(50,150,150,40);
		conScoreLbl.setBounds(50,200,150,40);
		intScoreLbl.setBounds(50,250,150,40);
		wisScoreLbl.setBounds(50,300,150,40);
		chaScoreLbl.setBounds(50,350,150,40);
		
		
		
		mainPanel.add(inputStrScore);
		mainPanel.add(inputDexScore);
		mainPanel.add(inputConScore);
		mainPanel.add(inputIntScore);
		mainPanel.add(inputWisScore);
		mainPanel.add(inputChaScore);
		
		mainPanel.add(strScoreLbl);
		mainPanel.add(dexScoreLbl);
		mainPanel.add(conScoreLbl);
		mainPanel.add(dexScoreLbl);
		mainPanel.add(intScoreLbl);
		mainPanel.add(wisScoreLbl);
		mainPanel.add(chaScoreLbl);
		
		mainPanel.add(controls, "South");
	
		
		this.pack();
		this.setSize(1200, 800);
		this.add(mainPanel);
		this.setVisible(true);

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Exit the UI and return to home UI.
		//TODO add exit warning "You will lose all progress. Are you sure you want to continue?"
		if(e.getSource() == exitBtn) {
			HomeUI homeScreen = new HomeUI();
			homeScreen.init();
			this.dispose();
		}
		
		/* End character creation, 
		 * ---Flow---
		 * Get input from UI
		 * check all parameters have been given
		 * --False: give warning and return to UI
		 * --True: save data to characterCreator and initialize export UI, DO NOT EXIT THIS UI
		 * 
		 * (If export UI is called, and character is exported, then this UI will also close, otherwise user will return here)
		*/
		else if(e.getSource() == doneBtn) {
			
			//TODO move data from input fields to variables
			
			//Taking input from text fields used to assign ability scores, and put them into abilityscore array
			
			try {
			AbilityScore str = new AbilityScore("Strength", Integer.parseInt(inputStrScore.getText()));
			AbilityScore dex = new AbilityScore("Dexterity",Integer.parseInt(inputDexScore.getText()));
			AbilityScore con = new AbilityScore("Constitution",Integer.parseInt(inputConScore.getText()));
			AbilityScore intel = new AbilityScore("Intellegence",Integer.parseInt(inputIntScore.getText()));
			AbilityScore wis = new AbilityScore("Wisdom",Integer.parseInt(inputWisScore.getText()));
			AbilityScore cha = new AbilityScore("Charisma",Integer.parseInt(inputChaScore.getText()));
			AbilityScore tempScores[] = {str, dex, con, intel, wis, cha};
			abilityScores = tempScores;
			}
			catch(NumberFormatException oof) {
				
			}
			
			
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
				
				ExportUI export = new ExportUI();
				export.init();
				
				
			}
		}

	}



}
