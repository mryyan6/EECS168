/*
 * File Name: WordSort.java
 * Zack Mryyan
 * EECS-169 Lab 11
 * This program will sort strings based upon the length and display it in ascending order as well as timing the sort.
 * 11/17/14
 */
import java.util.Scanner;

public class WordSort {
	public static void main(String[] args)
	{
		long start, stop, elapsed;
		int size;
		Scanner input= new Scanner(System.in);
		System.out.println("How many words would you like to enter into the array?");
		size=input.nextInt();
		String words[]= new String[size];
		for(int i=0; i<words.length; i++)
		{
			System.out.println("Please enter a word into the array: ");
			words[i]=input.next();			
		}
		System.out.println("Unsorted string: ");
		for(int i=0; i<size; i++)
		{
			System.out.print(words[i]+" ");
		}
		System.out.println("");
		System.out.println("");
		start = System.nanoTime();
		System.out.println("Starting sort at " +start);
		BubbleSort sort= new BubbleSort();
		sort.ascendingWord(words);
		stop = System.nanoTime();
		elapsed=stop-start;
		System.out.println("Stopping sort at "+stop);
		System.out.println("");
		System.out.println("Sorted Array: ");
		for(int i=0; i<size; i++)
		{
			System.out.print(words[i]+" ");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("This sort took a total of "+elapsed+" nano seconds, or " +elapsed/1000000000.0+" seconds");
		
	}
}
