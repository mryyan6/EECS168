/*
 * File Name: Lab11.java
 * Zack Mryyan
 * EECS-169 Lab 11
 * This program will sort integers based upon the length and display it in ascending and descending order as well as timing the sort.
 * 11/17/14
 */
import java.util.Random;
import java.util.Scanner;

public class Lab11 {
	public static void main (String[] args)
	{
		long start, stop, elapsed;
		int size;
		int type;
		Scanner input= new Scanner(System.in);
		Random myRand= new Random();
		System.out.println("How many random numbers do you want to make?");
		size=input.nextInt();
		int numbers[]= new int[size];
		for(int i=0; i<size; i++)
		{
			numbers[i]= myRand.nextInt(256);
		}
		System.out.println("Would you like to sort the array in ascending or descending order? (0 for ascending, 1 for descending) :");
		type=input.nextInt();
		System.out.println("Unsorted Array: ");
		for(int i=0; i<size; i++)
			{
				System.out.print(numbers[i]+" ");
			}
		System.out.println("");
		System.out.println("");
		start = System.nanoTime();
		System.out.println("Starting sort at " +start);
		BubbleSort sort= new BubbleSort();
		if(type==0)
		{	
			sort.ascending(numbers);
		}
		else
		{
			sort.descending(numbers);
		}
		stop = System.nanoTime();
		elapsed=stop-start;
		System.out.println("Stopping sort at "+stop);
		System.out.println("");
		System.out.println("Sorted Array: ");
		for(int i=0; i<size; i++)
		{
			System.out.print(numbers[i]+" ");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("This sort took a total of "+elapsed+" nano seconds, or " +elapsed/1000000000.0+" seconds");
	}

}
