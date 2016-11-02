/*File Name: Homework4.java 
	Author: Zack Mryyan
	Description: The code lets the user play a hangman game. 
	Last Changed: 12/08/2014
	*/ 
public class Hangman 
{
	private final String secretWord;
	private char[] disguisedWord;
	private int guessCount;
	private int missCount;
	private static final int maxMissesAllowed = 7;
	private char[] missedMarkers = new char [maxMissesAllowed];
	private static int gamesPlayed=0;
	//Preconditions: none
	//PostConditions: Counts the games played as well displays the question marks for the word.
	public Hangman(String s)
	{
		
		secretWord=s;
		disguisedWord = new char[secretWord.length()];
		guessCount=0;
		missCount=0;
		for(int x=0; x<secretWord.length(); x++)
		{
			if(secretWord.charAt(x)==' ')
			{
				disguisedWord[x]=' ';
			}
			else
			{	
				disguisedWord[x]='?';
			}
		}
		for(int x=0; x<maxMissesAllowed; x++)
		{
			missedMarkers[x]= '0';
		}
		gamesPlayed++;
	}
	
	
	//Preconditions: The guess must be a lower case letter
	//Post Condition: This allows the disguised word to be checked to see if the character is part of the word. Also counts the misses and reveals letters.
	public boolean guessCharacter(char c)
	{
		
		boolean temp = true;
		char temp_array[]= disguisedWord.clone();
		String str1 = "";
		String str2 = "";
		for(int x=0; x<secretWord.length();x++)
		{
			if(c == secretWord.charAt(x))
			{
				disguisedWord[x]=c;
			}
		}
		for(int x=0; x<temp_array.length;x++)
		{
			str1+=temp_array[x];
		}
		for(int x=0; x<disguisedWord.length;x++)
		{
			str2+=disguisedWord[x];
		}
		if(str1.equals(str2))
		{
			temp=false;
			
		}
		else
		{
			temp=true;
		}
		guessCount++;

		if(temp)
		{
			return true;
		}
		else
		{
			missedMarkers[missCount] = 'X';
			missCount++;
			return false;
		}
	}

	
	
	//Preconditions:none
	//Post Conditions: Tells whether the game is over dependent upon the the number of incorrect guesses	
	public boolean isGameOver()
	{
		boolean gameOver = false;
		String disguised = new String(disguisedWord);
		if(missCount == maxMissesAllowed || secretWord.equals(disguised))
		{
			gameOver = true;
		}
		
		else if(secretWord != disguised)
		{
			gameOver =  false;
		}
		return gameOver;
	}
	//Preconditions:none
	//Postconditions: Tells whether or not the word is found or not 
	public boolean isFound()
	{
		boolean isFound;
		String disguised = new String(disguisedWord);
		if(secretWord.equals(disguised))
		{
			isFound = true;
		}
		else
		{
			isFound=false;
		}
		return isFound;
	}
	
	
	//Preconditions:none
	//Postconditions: returns disguisedWord
	public String getDisguisedWord()
	{
		String temp = "";
		for(int x=0; x<disguisedWord.length; x++)
		{
			temp+=disguisedWord[x];
		}
		return temp;
	}
	//Preconditions:none
	//Postconditions: returns guessCount
	public int getGuessCount()
	{
		return guessCount;
	}
	//Preconditions:none
	//Postconditions: returns missCount
	public int getMissCount()
	{
		return missCount;
	}
	//Preconditions:none
	//Postconditions: returns missedMarkers
	public String getMissedMarker()
	{
		String temp = "";
		for(int x=0; x<missedMarkers.length; x++)
		{
			temp+=missedMarkers[x];
		}
		return temp;
	}
	//Preconditions:none
	//Postconditions: returns gamesPlayed
	public int getGamesPlayed()
	{
		return gamesPlayed;
	}
}