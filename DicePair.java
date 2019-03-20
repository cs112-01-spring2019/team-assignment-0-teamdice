import java.util.*;

public class DicePair {

	private Die die1;
	private Die die2;

	public DicePair()
	{
		die1 = new Die();
		die2 = new Die();
	}

	public int roll(){
		return die1.roll() + die2.roll();
	}

	// public static void main(String[] args)
	// {
		

	// 	public DicePair()
	// 	{
	// 		faceValue = 1;
	// 	}

	// 	Die die1, die2;
	// 	int sum;

	// 	die1 = new die();
	// 	die2 = new die();

	// 	die1Value = die1.roll();
	// 	die2Value = die2.roll();

	// 	System.out.println(die1 + die2);
	// }
}