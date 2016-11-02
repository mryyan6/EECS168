/*Pyramid.java
 * Zack Mryyan
 * EECS-169 Lab 3
 * This program will build a pyramid.
 * 9/22/14
 */
import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args)
	{
		double g;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number of asterisks for the base of the triangle");
		g=input.nextDouble();

			for (double x=0; x<g+1; x++)
		  {
			  for (double y=0; y<x; y++)
			  {
			  System.out.print("*");
			  }
			  System.out.println("");
			  }
	input.close();
	}
}
