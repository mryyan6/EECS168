public class HangMan
{
	private String secret_word = "terminator";
	private char[] disguised_word = {'?', '?', '?', '?', '?', '?', '?', '?', '?', '?'};
	private int guessCount=0;
	private int missesCount=0;
	private int max_misses_allowed=7;
	private char[] missMarkers = {'O', 'O','O','O','O','O','O'};
	private int gamesPlayed = 1;
	
	//i was unable to call the class without using this
	public HangMan()
	{
		
	}
	public HangMan(String secret_word, char[] disguised_word, char[] missMarkers,
			int guessCount, int missesCount, int max_misses_allowed, int gamesPlayed)
	{
		secret_word = "terminator";
		disguised_word = new char[]{'?', '?', '?', '?', '?', '?', '?', '?', '?', '?'};
		missMarkers= new char[]{'O', 'O','O','O','O','O','O'};
		guessCount = 0;
		missesCount = 0;
		max_misses_allowed = 7;
		gamesPlayed = gamesPlayed+1;
	}
	//this will start a new game with a new word
	public void resetGame(String newWord)
	{
		secret_word = newWord;
		disguised_word = new char[newWord.length()];
		for(int i=0; i<newWord.length(); i++)
		{
			disguised_word[i] = '?';
		}
		for(int j=0; j<max_misses_allowed; j++)
		{
			missMarkers[j]='O';
		}
		guessCount = 0;
		missesCount = 0;
		gamesPlayed = gamesPlayed+1;
	}
	//this is what checks if the user input character matches any in the secret word
	public boolean guessCharacter(char c)
	{
		boolean guess = false;
		for(int i=0; i<secret_word.length(); i++)
		{
			if(c == secret_word.charAt(i))
			{
				disguised_word[i] = c;
				guess = true;
			}
		}
		if(guess!=true)
		{
			missMarkers[missesCount] = 'X';
			missesCount+=1;
			guess = false;
		}
		guessCount=guessCount+1;
		return guess;

	}
	//this decides if the game is over or not and returns a boolean value
	public boolean isGameOver()
	{
		boolean gameOver = false;
		String disguised = new String(disguised_word);
		if(missesCount == max_misses_allowed || secret_word.equals(disguised))
		{
			gameOver = true;
		}
		//need to find out how to make if statement for disguised word==secret word
		else if(secret_word != disguised)
		{
			gameOver =  false;
		}
		return gameOver;
	}
	//this checks if the characters of the array match the secret word
	public boolean isFound()
	{
		boolean isFound;
		String disguised = new String(disguised_word);
		if(secret_word.equals(disguised))
		{
			isFound = true;
		}
		else
		{
			isFound=false;
		}
		return isFound;
	}
	//this simply returns the array as a string
	public String getDisguisedWord()
	{
		String disguised = new String(disguised_word);
		return disguised;
	}
	//counts guesses
	public int guessCount()
	{
		return guessCount;
	}
	//counts misses
	public int getMissesCount()
	{
		return missesCount;
	}
	//displays misses as X's and O's
	public String getMissedMarker()
	{
		String missedMarker = new String(missMarkers);
		return missedMarker;
	}
	//returns how many games have been played
	public int getGamesPlayed()
	{
		return gamesPlayed;
	}
}