package characterTraits;

public class Race {
	String name;
	int abilityMods[];
	
	
	public Race(String name, int abilityMods[]) {
		
		this.name = name;
		this.abilityMods = abilityMods;
	}
	
	public String getName() {
		return name;
	}
}
