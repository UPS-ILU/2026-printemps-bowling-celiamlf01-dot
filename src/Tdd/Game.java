package Tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Game {
	static private int[] rolls = new int[21];
	private int iter=0;
	
	void roll(int nbQuilles)
	{
		rolls[iter]=nbQuilles;
		++iter;
	}
	int score() { 
		int scorep=0;
		for(int i=0;i<20;++i)
		{
			scorep+=rolls[i];
		}
	
		return scorep;
	}

}
