package sourceCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


public class PlayerCreation extends Setup {
	Scanner askUser;
	Random rando;
	String Class;
	String Race;
	int hp;
	ArrayList<Integer> AbilityScores;
	HashMap<String, Integer> Abilities;
	HashMap<String, Integer> AbilityMod;
	
	
	public String chooseClass() {
	System.out.println("Choose a class:");
	
	for(int i = 0; i < Classes.size(); i++) {
		System.out.println(i + 1 + ". " + Classes.get(i));
	}
	
	askUser = new Scanner(System.in);
	Class = Classes.get(askUser.nextInt() - 1);
	return Class;
	}
	
	public String chooseRace() {
	System.out.println("Choose a Race:");
	
	for(int i = 0; i < Races.size(); i++) {
		System.out.println(i + 1 + ". " + Races.get(i));
	}
	askUser = new Scanner(System.in);
	Race = Races.get(askUser.nextInt() - 1);
	return Race;
	}
	
	public HashMap<String, Integer> rollAbilities() {
		
		AbilityScores = new ArrayList<Integer>();
		rando = new Random();
		int checkStats = 0;
		boolean repeat = true;
		while(repeat == true) {
			for(int i = 0; i < 6; i++) {
			
				ArrayList<Integer> diceRolls = new ArrayList<Integer>();
			
				diceRolls.add(rando.nextInt(6) + 1);
				diceRolls.add(rando.nextInt(6) + 1);
				diceRolls.add(rando.nextInt(6) + 1);
				diceRolls.add(rando.nextInt(6) + 1);
			
				int min = 7;
				for(int roll = 0; roll <= 3; roll++) {
				if(min > diceRolls.get(roll)) {
					min = diceRolls.get(roll);
					}
				}
			
				int score = diceRolls.get(0) + diceRolls.get(1) + diceRolls.get(2) + diceRolls.get(3);
				score -= min;
				AbilityScores.add(score);
				checkStats += ((AbilityScores.get(i) - 10)/2);
			}
			repeat = false;
			//change this number to determine the overall ability modifier for your players, can switch to a range
			if(checkStats != 5) {
				repeat = true;
				AbilityScores.clear();
				checkStats = 0;
			}
		}
			System.out.println(AbilityScores.clone());
		
			//Bellow is for assigning ability scores
		askUser = new Scanner(System.in);
		boolean isValid = false;
		Abilities = new HashMap<String, Integer>();
		ArrayList<String> abilityNames = new ArrayList<String>();
		abilityNames.add("Str");
		abilityNames.add("Dex");
		abilityNames.add("Con");
		abilityNames.add("Int");
		abilityNames.add("Wis");
		abilityNames.add("Cha");
		
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Assign your " + abilityNames.get(i) + "  score:");
			int input = askUser.nextInt();
			for(int x = 5 - i; x >= 0; x--) {
				if(input == AbilityScores.get(x)) {
					Abilities.put(abilityNames.get(i), AbilityScores.get(x));
					AbilityScores.remove(x);
					isValid = true;
					x = 0;
				}
			}
			
			while(isValid == false) {
				System.out.println("That is not a valid score, try again.");
				input = askUser.nextInt();
				for(int x = 5 - i; x >= 0; x--) {
					System.out.println(AbilityScores.get(x));
					if(input == AbilityScores.get(x)) {
						Abilities.put(abilityNames.get(i), AbilityScores.get(x));
						AbilityScores.remove(x);
						isValid = true;
						x = 0;
					}
				}
			}
		isValid = false;
			}
		
		AbilityMod = new HashMap<String, Integer>();
		for(int i = 0; i < 6; i++) {
			AbilityMod.put(abilityNames.get(i), ((Abilities.get(abilityNames.get(i)) - 10)/2));
		}
		
		return Abilities;
	}
	
	public HashMap<String, Integer> racialMod() {
		AbilityScores.clear();
		ArrayList<Integer> racialMod= new ArrayList<Integer>();
		racialMod = RaceModifiers.get(Race);
		
		AbilityScores.add(Abilities.get("Str") + racialMod.get(0));
		AbilityScores.add(Abilities.get("Dex") + racialMod.get(1));
		AbilityScores.add(Abilities.get("Con") + racialMod.get(2));
		AbilityScores.add(Abilities.get("Int") + racialMod.get(3));
		AbilityScores.add(Abilities.get("Wis") + racialMod.get(4));
		AbilityScores.add(Abilities.get("Cha") + racialMod.get(5));
		
		Abilities.clear();
		Abilities.put("Str", AbilityScores.get(0));
		Abilities.put("Dex", AbilityScores.get(1));
		Abilities.put("Con", AbilityScores.get(2));
		Abilities.put("Int", AbilityScores.get(3));
		Abilities.put("Wis", AbilityScores.get(4));
		Abilities.put("Cha", AbilityScores.get(5));
		
		return Abilities;
	}
	
	public int HP() {
		hp = HitDice.get(Class) + AbilityMod.get("Con");
		System.out.println("HP = " + hp);
		return hp;
	}
	
}
