/*Zack Mryyan
Quadratic.java
EECS-169 Lab 2
This program calculates the roots of the quadratic equation. Assumes valid input*/

import java.math.*;
import java.util.Scanner;
public class Quadratic 
{
	
	public static double quadratic_a (double a, double b, double c){
		return((-1*b)+Math.sqrt((b*b)-(4*a*c)))/(2*a);
		
	}
	public static double quadratic_b (double a, double b, double c){
		return((-1*b)-Math.sqrt((b*b)-(4*a*c)))/(2*a);
	}
	public static void main(String[] args)
	{
		double a;
		double b;
		double c;
		double root_1;
		double root_2;
		Scanner input= new Scanner(System.in);
		System.out.println("Input a:");
		a= input.nextDouble();
		System.out.println("Input b:");
		b= input.nextDouble();
		System.out.println("Input c:");
		c= input.nextDouble();
		System.out.println(quadratic_a(a, b, c));
		System.out.println(quadratic_b(a, b, c)		
		);
	}
}

