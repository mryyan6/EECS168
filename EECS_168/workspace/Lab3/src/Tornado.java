/*
 * File Name: Tornado.java
 * Zack Mryyan
 * EECS-169 Lab 3
 * This program will relay to the user what class a tornado is in.
 * 9/15/14
 */
import java.util.Scanner;

public class Tornado {
	public static void main(String[] args)
	{
		double speed;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the windspeed:");
		speed= input.nextDouble();
		if(speed>=40 && speed<72)
		{
			System.out.println("The tornado is an F-0 tornado.");
		}
		else if(speed>=72 && speed<=112)
		{
			System.out.println("The tornado is an F-1 tornado.");
		}
		else if(speed>112 && speed<=157)
		{
			System.out.println("The tornado is an F-2 tornado.");
		}
		else if(speed>157 && speed<=205)
		{
			System.out.println("The tornado is an F-3 tornado.");
		}
		else if(speed>205 && speed<=260)
		{
			System.out.println("The tornado is an F-4 tornado.");
		}
		else if(speed>260 && speed<=318)
		{
			System.out.println("The tornado is an F-5 tornado.");
		}
		else
		{
			System.out.println("ERROR. Please insert a valid number");
		}
		input.close();
	}
}
