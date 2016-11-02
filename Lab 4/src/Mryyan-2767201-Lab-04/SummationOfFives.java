/*Multiples.java
 * Zack Mryyan
 * EECS-169 Lab 3
 * This program will give the multiples of 5 added untiil the end value.
 * 9/22/14
 */
import java.util.Scanner;

public class SummationOfFives {
	public static void main(String[] args)
	{
		int value;
		Scanner input= new Scanner(System.in);
		System.out.println("Please input a postive integer as the end value:");
		value= input.nextInt();
		int x = 0;
		int sum = 0;
		while(x<= value)
		{
			sum=sum+x;
			x=x+5;
			
						}
			System.out.println("The summation is:"+ sum);
					input.close();
	}
}
