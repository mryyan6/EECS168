import java.util.Scanner;

public class Lab6_Strings {
	public static void main(String[] args)
	{
		int size;
		String longest;
		String shortest;
		Scanner input= new Scanner(System.in);
		System.out.println("Input an array size for your words array:");
		size=input.nextInt();
		System.out.println("Now please enter " +size+ " words");
		String[] words= new String[size];
		for(int i=0; i< words.length; i++)
		{
			System.out.print("Input a word: ");
			words[i]=input.next();
		}
		longest=words[0];
		for(int i=0; i < words.length; i++)
		{
			if(longest.length()<words[i].length())
			{
				longest=words[i];
			}
		}
		System.out.println("The longest word is: " +longest);
		shortest=words[0];
		for (int i=0; i < words.length; i++)
		{
			if(shortest.length()>words[i].length())
			{
				shortest=words[i];
			}
		}
		System.out.println("The shortest word is: " +shortest);
	input.close();
	}

}
