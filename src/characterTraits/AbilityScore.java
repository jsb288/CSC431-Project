package characterTraits;

public class AbilityScore {
	String name;
	int score;
	int modifier;
	
	public AbilityScore(String name, int score) {
		
		this.name = name;
		this.score = score;
		
		if(score > 10) this.modifier = (score - 10 ) / 2;
		else this.modifier = (score - 11 ) / 2;
		
		
	}
	
	public int getModifier() {
		return modifier;
	}
	public int getScore() {
		return score;
	}
	public String getName() {
		return name;
	}
}
