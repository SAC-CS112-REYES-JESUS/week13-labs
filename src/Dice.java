
public class Dice {

	
	private int RandomDice;
	
	
	public int Throw()
	{
		int random = (int) (Math.random()*6);
		RandomDice = random;
		return random;
	}
	
	
	
	
}
