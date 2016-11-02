/*
 * File Name: Multiples.java
 * Zack Mryyan
 * EECS-169 Lab 3
 * This program will print the multiples of a number for the user.
 * 9/15/14
 */
import java.util.Scanner;

public class Multiples {
	public static void main(String[] args)
	{
		double multiple;
		Scanner input = new Scanner(System.in);
		System.out.println("What number do you wish to see multiples of?");
		multiple= input.nextDouble();
		System.out.println("How many multiples?");
		double times;
		times= input.nextDouble();
	    if(times<=0)
		{
			System.out.println("Error: The amount of multiples to display must be greater than zero");
		}
		else if(times>0)
		{	System.out.println("Here are the first "+times+" multiples of the number "+multiple+":");
		double n = times;
		for(int x=1; x<=n; x=x+1)
		{
			System.out.println(x*multiple);
		}
		}
		input.close();
	}
}
