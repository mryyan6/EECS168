/*Zack Mryyan
ConvertTemperature.java
EECS-169 Lab 2
This program will convert the input temperature from Fahrenheit to Celsius*/
import java.util.Scanner;

public class ConvertTemperature
{
	public static void main(String[] args)
	{
		double celsius;
		double fahrenheit;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit:");
		fahrenheit= input.nextDouble();
		celsius= ((fahrenheit-32)*(5.0/9.0));
		System.out.println("*Conversion:");
		System.out.println(""+fahrenheit+" degrees Fahrenheit = "+celsius+" degrees Celsius.");
		
	}

}
