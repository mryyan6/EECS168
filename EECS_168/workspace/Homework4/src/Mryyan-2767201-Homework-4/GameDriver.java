/*File Name: Homework4.java 
	Author: Zack Mryyan
	Description: The code lets the user play a hangman game. 
	Last Changed: 12/08/2014
	*/ 

import java.util.Scanner;

public class GameDriver 
{
	public static void main(String[] args)
	{
		//initializes
		Scanner scanner = new Scanner(System.in);
		String newWord = "big bang";
		Hangman hangman = new Hangman(newWord);
		char c;
		String keepGoing = "yes";
		System.out.println("Welcome to the Hangman Game!");
		System.out.println("----------------------------");

			do
			{
				//starts the game
				System.out.println("Guess this: " + hangman.getDisguisedWord());
				System.out.println("Guesses so far: " + hangman.getGuessCount());
				System.out.println("Misses: " + hangman.getMissedMarker());
				System.out.println("Enter your guess character: ");
				c = (scanner.nextLine()).charAt(0);
				//checks to see if the letter is in the word
				if(hangman.guessCharacter(c))
				{
					System.out.println(c + " is in the secret word!");
				}
				else
				{
					System.out.println(c + " is not in the secret word. Death draws closer.");
				}
			//checks to see if game is over
			if(hangman.isGameOver())
			{
				System.out.println("Game Over!");
				if(hangman.isFound())
				{
					System.out.println("Congratulations! You guessed the secret word: " +hangman.getDisguisedWord()+" in "+hangman.getGuessCount()+" guesses!");
				}
				else if(!hangman.isFound())
				{
					System.out.println("You died. Next time, guess as if your life depended on it.");

				}	
				System.out.println("Do you want to play again? (yes/no)");
				keepGoing= scanner.next();
				keepGoing= keepGoing.toLowerCase();
				
				if(keepGoing.equals("yes"))
				{
					System.out.println("Input a new secret word! ");
					newWord = scanner.next();
					Hangman hangman2 = new Hangman(newWord);
					for(int x=0; x<101; x++)
					{
						System.out.println(" ");
					}
					
				}
				else
				{
					System.out.println(" ");
					System.out.println("Thanks for playing " + hangman.getGamesPlayed() + " game(s) of HangMan!");
				}
				
			}			
	}while(keepGoing.equals("yes"));	
		scanner.close();
	}
}

