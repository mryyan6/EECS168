/*Zack Mryyan
CirlceArea.java
EECS-169 Lab 2
This program will compute the area of a circle with a hard-coded radius.*/
public class CircleArea 
{
	public static void main(String[] args)
	{
		final double PI = 3.141592;
		double radius;
		double area;
		radius = 20.0;
		area = PI*radius*radius;
		System.out.println("The area for the circle of radius "+radius+" is "+area+"");			
	
	}
}
