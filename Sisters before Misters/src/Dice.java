
public class Dice
	{
	public static void rollDice()
		{
		int dice1 = (int) (Math.random()* 6)  + 1;
		int dice2 = (int) (Math.random()* 6)  + 1;
		int diceRoll = dice1 + dice2;
		}
	}
