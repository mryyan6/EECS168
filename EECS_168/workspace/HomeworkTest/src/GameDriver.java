import java.util.Scanner;
public class GameDriver
{
	public static void main(String[] args)
	{
		//this is what calls the other class
		HangMan game = new HangMan();
		Scanner input = new Scanner(System.in);
		//this string is what drives the game
		String runGame = "yes";
		char guess;
		System.out.println("Welcome to the HangMan Game!");
		System.out.println("----------------------------");
		//the do while loop runs the game first before asking the user if they want to go again
		do
		{
			System.out.println(" ");
			//these show the stats in the ongoing game
			System.out.println("Guess this: " + game.getDisguisedWord());
			System.out.println("Guesses so far: " + game.guessCount());
			System.out.println("Misses: " + game.getMissedMarker());
			System.out.println("Enter your guess character: ");
			guess = input.next().charAt(0);
			guess = Character.toLowerCase(guess);
			//this will check if the user input character is part of the secret word
			if(game.guessCharacter(guess)==true)
			{
				System.out.println(guess + " is in the secret word!");
			}
			else
			{
				System.out.println(guess + " is not in the secret word. Death draws closer.");
			}
			//this checks if the game is still  going or not
			if(game.isGameOver() == true)
			{
				System.out.println("Game Over!");
				if(game.isFound() == true)
				{	
					System.out.println("Congratulations! You guessed the secret word:" + game.getDisguisedWord() );
				}
				else if(game.isFound() != true)
				{
					System.out.println("You died. Next time, guess as if your life depended on it.");
				}
				System.out.println("Do you want to play again? (yes/no)");
				runGame = input.next();
				runGame = runGame.toLowerCase();
				//if the user wants to play again, theyll be prompted for a new word and the reset method runs
				if(runGame.equals("yes"))
				{

					System.out.println("Input a new secret word! ");
					String newWord = input.next();
					game.resetGame(newWord);
					for(int j=0; j<101; j++)
					{
						System.out.println("_");
					}
				}
				else
				{
					System.out.println(" ");
					System.out.println("Thanks for playing " + game.getGamesPlayed() + " game(s) of HangMan!");
				}
				
			}			
		}while(runGame.equals("yes"));	
		input.close();
	}
}