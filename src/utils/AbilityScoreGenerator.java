package utils;

import java.util.Random;

public class AbilityScoreGenerator {

	
	public static int[] rollScores() {
		
		int scores[] = new int[6];
		int diceRolls[] = new int[4];
		
		Random genScore = new Random();
		
		for (int i = 0; i < scores.length; i++) {
			int sumRolls = 0;
			
			for (int j = 0; j < diceRolls.length; j++) {
				diceRolls[j] = genScore.nextInt(7);
				sumRolls += diceRolls[j];
			}
			
			int lowest = diceRolls[0];
			
			for (int j = 0; j < diceRolls.length; j++) {
				if(diceRolls[j] < lowest) lowest = diceRolls[j];
			}
			
			sumRolls -= lowest;
			
			scores[i] = sumRolls;
		}
		
		return scores;
	}
	
}
