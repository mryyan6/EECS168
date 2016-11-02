/*NumberGuessingGame.java
 * Zack Mryyan
 * EECS-169 Lab 3
 * This program will play a guessing game with the user.
 * 9/22/14
 */
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		double guess;
		System.out.println("Welcome to the guessing game.");
		do
		{
			System.out.println("Guess a number:");
			guess= input.nextDouble();
			if(guess<73)
			{
				System.out.println("Sorry your guess is too low.");
								
						}
			else if(guess>73)
			{
				System.out.println("Sorry your guess is too high.");
								
						}
			else if(guess==73)
			{
				System.out.println("You win");
			}
			
		} while (guess != 73);
input.close();	
}

}
