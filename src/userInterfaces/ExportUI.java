package userInterfaces;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import main.CharacterCreator;
import utils.Warning;

@SuppressWarnings("serial")
public class ExportUI extends JFrame implements CSmithUI{

	JButton exitBtn = new JButton("Exit");
	JButton exportBtn = new JButton("Export");
	
	JLabel classLbl = new JLabel("Class:");
	JTextField className = new JTextField(CharacterCreator.characterClass.getName());
	
	JTextField raceName = new JTextField(CharacterCreator.race.getName());
	JLabel raceLbl = new JLabel("Race: ");

	JTextField  strScore= new JTextField(Integer.toString(CharacterCreator.abilityScores[0].getScore()) + " | " + Integer.toString(CharacterCreator.abilityScores[0].getModifier()));
	JLabel strLbl = new JLabel("Strength: ");

	JTextField  dexScore= new JTextField(Integer.toString(CharacterCreator.abilityScores[1].getScore()) + " | " + Integer.toString(CharacterCreator.abilityScores[1].getModifier()));
	JLabel dexLbl = new JLabel("Dexterity: ");

	JTextField  conScore= new JTextField(Integer.toString(CharacterCreator.abilityScores[2].getScore()) + " | " + Integer.toString(CharacterCreator.abilityScores[2].getModifier()));
	JLabel conLbl = new JLabel("Constitution: ");

	JTextField  intScore= new JTextField(Integer.toString(CharacterCreator.abilityScores[3].getScore()) + " | " + Integer.toString(CharacterCreator.abilityScores[3].getModifier()));
	JLabel intLbl = new JLabel("Intellegence: ");

	JTextField  wisScore= new JTextField(Integer.toString(CharacterCreator.abilityScores[4].getScore()) + " | " + Integer.toString(CharacterCreator.abilityScores[4].getModifier()));
	JLabel wisLbl = new JLabel("Wisdom: ");

	JTextField  chaScore= new JTextField(Integer.toString(CharacterCreator.abilityScores[5].getScore()) + " | " + Integer.toString(CharacterCreator.abilityScores[5].getModifier()));
	JLabel chaLbl = new JLabel("Charisma: ");

	JTextField placeholder = new JTextField(".");
	
	Controls controls = new Controls();
	MainPanel mainPanel = new MainPanel();
	
	@Override
	public void init() {
		exitBtn.addActionListener(this);
		exportBtn.addActionListener(this);
		controls.add(exitBtn);
		controls.add(exportBtn);
		mainPanel.add(controls, "South");
		
		
		raceName.setEditable(false);
		className.setEditable(false);
		strScore.setEditable(false);
		dexScore.setEditable(false);
		conScore.setEditable(false);
		intScore.setEditable(false);
		wisScore.setEditable(false);
		chaScore.setEditable(false);
		placeholder.setEditable(false);
		
		
		raceLbl.setBounds(150, 50, 150, 40);
		classLbl.setBounds(150, 100, 150, 40);
		strLbl.setBounds(150, 150, 150, 40);
		dexLbl.setBounds(150, 200, 150, 40);
		conLbl.setBounds(150, 250, 150, 40);
		intLbl.setBounds(150, 300, 150, 40);
		wisLbl.setBounds(150, 350, 150, 40);
		chaLbl.setBounds(150, 400, 150, 40);
		
		raceName.setBounds(310, 50, 150, 40);
		className.setBounds(310, 100, 150, 40);
		strScore.setBounds(310, 150, 150, 40);
		dexScore.setBounds(310, 200, 150, 40);
		conScore.setBounds(310, 250, 150, 40);
		intScore.setBounds(310, 300, 150, 40);
		wisScore.setBounds(310, 350, 150, 40);
		chaScore.setBounds(310, 400, 150, 40);
		placeholder.setBounds(310, 450, 150, 40);
		
		
		/*
		raceName
		className
		strScore
		dexScore
		conScore
		intScore
		wisScore
		chaScore
		
		*/
		
		mainPanel.add(classLbl);
		mainPanel.add(className);
		mainPanel.add(raceLbl);
		mainPanel.add(raceName);
		mainPanel.add(strLbl);
		mainPanel.add(strScore);
		mainPanel.add(dexLbl);
		mainPanel.add(dexScore);
		mainPanel.add(conLbl);
		mainPanel.add(conScore);
		mainPanel.add(intLbl);
		mainPanel.add(intScore);
		mainPanel.add(wisLbl);
		mainPanel.add(wisScore);
		mainPanel.add(chaLbl);
		mainPanel.add(chaScore);
		mainPanel.add(placeholder);
		
		
		
		
		
		
		
		
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
			this.dispose();
			
			
		}
	}

}
