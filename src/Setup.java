package sourceCode;

import java.util.ArrayList;
import java.util.HashMap;

public class Setup{
	ArrayList<String> Races;
	ArrayList<String> Classes;
	HashMap<String, ArrayList<Integer>> RaceModifiers;
	HashMap<String, Integer> HitDice;

	public ArrayList<String> loadClasses() {
		Classes = new ArrayList<String>();
		Classes.add("Barbarian");
		Classes.add("Bard");
		Classes.add("Cleric");
		Classes.add("Druid");
		Classes.add("Fighter");
		Classes.add("Monk");
		Classes.add("Paladin");
		Classes.add("Psion");
		Classes.add("Ranger");
		Classes.add("Rogue");
		Classes.add("Sorceror");
		Classes.add("Soulknife");
		Classes.add("Wilder");
		Classes.add("Wizard");
		return Classes;
	}
	
	public ArrayList<String> loadRaces() {
		Races = new ArrayList<String>();
		Races.add("Hill Dwarf");
		Races.add("Mountain Dwarf");
		Races.add("High Elf");
		Races.add("Grey Elf");
		Races.add("Wild Elf");
		Races.add("Wood Elf");
		Races.add("City Elf");
		Races.add("Half-Elf");
		Races.add("Half-Orc");
		Races.add("Lightfoot Halfling");
		Races.add("Human");
		Races.add("Elan");
		Races.add("Goblin");
		return Races;
	}

	public HashMap<String, ArrayList<Integer>> loadRaceModifiers() {
		RaceModifiers = new HashMap<String, ArrayList<Integer>>();
		
		ArrayList<Integer> dwarf = new ArrayList<Integer>();
		dwarf.add(0);
		dwarf.add(0);
		dwarf.add(2);
		dwarf.add(0);
		dwarf.add(0);
		dwarf.add(-2);
		
		ArrayList<Integer> highElf = new ArrayList<Integer>();
		highElf.add(0);
		highElf.add(+2);
		highElf.add(-2);
		highElf.add(0);
		highElf.add(0);
		highElf.add(0);
		
		ArrayList<Integer> greyElf = new ArrayList<Integer>();
		greyElf.add(-2);
		greyElf.add(+2);
		greyElf.add(-2);
		greyElf.add(+2);
		greyElf.add(0);
		greyElf.add(0);
		
		ArrayList<Integer> woodElf = new ArrayList<Integer>();
		woodElf.add(+2);
		woodElf.add(+2);
		woodElf.add(-2);
		woodElf.add(-2);
		woodElf.add(0);
		woodElf.add(0);
		
		ArrayList<Integer> wildElf = new ArrayList<Integer>();
		wildElf.add(0);
		wildElf.add(+2);
		wildElf.add(0);
		wildElf.add(-2);
		wildElf.add(0);
		wildElf.add(0);
		
		ArrayList<Integer> cityElf = new ArrayList<Integer>();
		cityElf.add(0);
		cityElf.add(+2);
		cityElf.add(-2);
		cityElf.add(0);
		cityElf.add(0);
		cityElf.add(0);
		
		ArrayList<Integer> halfOrc = new ArrayList<Integer>();
		halfOrc.add(+2);
		halfOrc.add(0);
		halfOrc.add(0);
		halfOrc.add(-2);
		halfOrc.add(0);
		halfOrc.add(-2);
		
		ArrayList<Integer> halfling = new ArrayList<Integer>();
		halfling.add(-2);
		halfling.add(+2);
		halfling.add(0);
		halfling.add(0);
		halfling.add(0);
		halfling.add(0);
		
		ArrayList<Integer> elan = new ArrayList<Integer>();
		elan.add(0);
		elan.add(0);
		elan.add(0);
		elan.add(0);
		elan.add(0);
		elan.add(-2);
		
		ArrayList<Integer> goblin = new ArrayList<Integer>();
		goblin.add(-2);
		goblin.add(+2);
		goblin.add(0);
		goblin.add(0);
		goblin.add(0);
		goblin.add(-2);
		
		ArrayList<Integer> human = new ArrayList<Integer>();
		human.add(0);
		human.add(0);
		human.add(0);
		human.add(0);
		human.add(0);
		human.add(0);
		
		RaceModifiers.put("Hill Dwarf", dwarf);
		RaceModifiers.put("Mountain Dwarf", dwarf);
		RaceModifiers.put("High Elf", dwarf);
		RaceModifiers.put("Grey Elf", greyElf);
		RaceModifiers.put("Wild Elf", wildElf);
		RaceModifiers.put("Wood Elf", woodElf);
		RaceModifiers.put("City Elf", cityElf);
		RaceModifiers.put("Half-Elf", human);
		RaceModifiers.put("Half-Orc", halfOrc);
		RaceModifiers.put("Lightfoot Halfling", halfling);
		RaceModifiers.put("Human", human);
		RaceModifiers.put("Elan", elan);
		RaceModifiers.put("Goblin", goblin);
		
		return RaceModifiers;
	}
	
	public HashMap<String, Integer> loadHitDice() {
		
		HitDice = new HashMap<String, Integer>();
		
		HitDice.put(Classes.get(0), 12);
		HitDice.put(Classes.get(1), 6);
		HitDice.put(Classes.get(2), 8);
		HitDice.put(Classes.get(3), 8);
		HitDice.put(Classes.get(4), 10);
		HitDice.put(Classes.get(5), 8);
		HitDice.put(Classes.get(6), 10);
		HitDice.put(Classes.get(7), 4);
		HitDice.put(Classes.get(8), 8);
		HitDice.put(Classes.get(9), 6);
		HitDice.put(Classes.get(10), 4);
		HitDice.put(Classes.get(11), 10);
		HitDice.put(Classes.get(12), 6);
		HitDice.put(Classes.get(13), 4);
		
		return HitDice;
	}
	
	public static void main(String[] args) {

		
		
	}
}
