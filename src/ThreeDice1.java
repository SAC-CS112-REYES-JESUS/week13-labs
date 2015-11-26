
public class ThreeDice1 extends Dice {

	
	
	@Override
	public int Throw()
		{
			/*Dice D1 = new Dice();
			D1=D1;
			Dice D2 = new Dice();
			Dice D3 = new Dice();

			return (D1.Throw() + D2.Throw() + D3.Throw()) / 3;
			*/
		
	
		int one =super.Throw();
		int two=super.Throw();
		int three=super.Throw();
		
		return(one+two+three/3);
		
	
			
			
		
		
		}
	
	
	
	public String toString()
	{
		return String.format("The ave roll was %d",Throw());
		
	}
	

	
}
