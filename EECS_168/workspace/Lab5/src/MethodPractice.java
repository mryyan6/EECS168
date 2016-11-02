/*MethodPractice.java
 * Zack Mryyan
 * EECS-169 Lab 5
 * This program will display an array of things based on user input.
 * 9/29/14
 */
import java.util.Scanner;

public class MethodPractice {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Input two numbers:");
		int a=input.nextInt();
		int b=input.nextInt();
		System.out.println("The larger number is:");
		System.out.print(chooseGreater(a,b));
		System.out.println("");
		
		System.out.println("Intput a radius:");
		double radius=input.nextDouble();
		System.out.println("The circumference is:");
		System.out.print(circumference(radius));
		
		System.out.println("");
		System.out.println("Input a string");
		String word= input.next();
		System.out.println("How many times do you want to print it?:");
		int timesToPrint= input.nextInt();
		printWord(word,timesToPrint);
		
	} 
	
	public static int chooseGreater(int a, int b) //returns the bigger integer
	{
		if(a>b)
		{
			return(a);
		}
		else
		{
			return(b);
		}
	
	}
	
	public static void printWord(String word, int timesToPrint) //returns a word the number of times the user says
	{
		for(int x=0; x<timesToPrint; x++)
		{
			System.out.println(word);
		}
	}
	public static double circumference(double radius) //returns the circumference of a circle
	{
		double answer=0;
		answer=(3.14159*(radius*2));
		return(answer);
	}
	
}
