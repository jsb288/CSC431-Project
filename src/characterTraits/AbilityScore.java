package characterTraits;

public class AbilityScore {
	String name;
	int score;
	int modifier;
	
	public AbilityScore(String name, int score) {
		
		this.name = name;
		this.score = score;
		
		this.modifier = (score - 10 ) / 2;
		
	}
	
}
