/*Dice.java
 * Zack Mryyan
 * EECS-169 HW 3
 * This program will deal with the dice rolled by the user.
 * 11/6/14
 */
import java.util.Random;
	
public class Dice 
{

	private int numSides;
	public void dice(int sides)
	{
		numSides = sides;
	}
	
	public int roll()
	{
		Random myRand = new Random();
		return(myRand.nextInt(numSides));
	}
}