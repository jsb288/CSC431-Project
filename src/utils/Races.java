package utils;

import characterTraits.Race;

public class Races {
	
	int i[] = {};
	
	public static final Race[] raceList = {
											//str,dex,con,int,wis,cha
			new Race("Hill Dwarf", new int[] {0,0,2,0,0-2}),
			new Race("Mountain Dwarf", new int[] {0,0,2,0,0,-2}),
			new Race("High Elf", new int[] {0,2,-2,0,0,0}),
			new Race("Wood Elf", new int[] {2,2,-2,-2,0,0}),
			new Race("Dark Elf", new int[] {0,2,-2,2,0,2}),
			new Race("Gray Elf", new int[] {-2,2,-2,2,0,0}),
			new Race("Gnome", new int[] {-2,0,2,0,0,0}),
			new Race("Half-Elf", new int[] {0,0,0,0,0,0}),
			new Race("Half-Orc", new int[] {2,0,0,-2,0,-2}),
			new Race("Halfling", new int[] {-2,2,0,0,0,0}),
			new Race("Human", new int[] {0,0,0,0,0,0}),
			new Race("Tiefling", new int[] {0,0,0,0,0,0}),
			
	};
}
