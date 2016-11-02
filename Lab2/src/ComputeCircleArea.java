/*Zack Mryyan
ComputeCirlceArea.java
EECS-169 Lab 2
This program will compute the area of the circle, where the radius is received from the user */
import java.util.Scanner;

public class ComputeCircleArea
{
	public static void main(String[] args)
	{
	final double PI = 3.141592;
	double radius;
	double area;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number for radius:");
	radius= input.nextDouble();
	area = PI*radius*radius;
	System.out.println("The area for the circle of radius "+radius+" is " +area+"");	
	}

}