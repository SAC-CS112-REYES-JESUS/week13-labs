
public class ThreeDice {

	
	public static void main(String[] args)
	{
		
		System.out.print("hello\n");
		
		Dice Dice1 = new Dice();
		Dice Dice2 = new Dice();
		Dice Dice3 = new Dice();
		
		
		int one=Dice1.Throw();
		int two=Dice2.Throw();
		int three=Dice3.Throw();
		
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		
		
		int ave= ((one+two+three)/3);
		System.out.printf("Average=%d",ave);
	
		
		
		
	}
}
