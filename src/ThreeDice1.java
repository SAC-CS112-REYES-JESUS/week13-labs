
public class ThreeDice1 {

	private Dice D1;
	private Dice D2;
	private Dice D3;
	public int Throw()
		{
			Dice D1 = new Dice();
			D1=D1;
			Dice D2 = new Dice();
			Dice D3 = new Dice();

			return (D1.Throw() + D2.Throw() + D3.Throw()) / 3;
			
		}
	
	
	@Override
	public String toString()
	{
		return String.format("The ave roll was %d",Throw());
		
	}
	

	
}
