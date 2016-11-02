/*Palindrome.java
 * Zack Mryyan
 * EECS-169 Lab 5
 * This program will find the palindrome of an integer.
 * 9/29/14
 */
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		int response;
		do
		{
		System.out.println("Please enter a No:");
		int number= input.nextInt();
		System.out.println("The Length of the Number is:" + lengthOfNumber(number));
		System.out.println("The Reverse of the Number is:" + reverse(number));
		if (isPalindrome(number)==1){
			System.out.println("This number is a palindrome");
		}else{
			System.out.println("This number is not a palindrome");
		}
		System.out.println("Want to try again?(y=1/n=0):");
		response= input.nextInt();
		
	
		}while(response==1);
	System.out.println("Thank you!");
	input.close();
	}

	public static int isPalindrome(int x)
	{
		String back = "";
		String pal = "";
		pal=String.valueOf(x);
		for(int i=pal.length()-1; i>=0; i--)
		{
			back=back+pal.charAt(i);
		}if (back.equals(pal)){
			return 1;
		}else{
			return 0;
		}
	}
	
	public static int reverse(int x)
	{
		String back = "";
		String pal;
		pal=String.valueOf(x);
		for(int i=pal.length()-1; i>=0; i--)
		{
			back=back+pal.charAt(i);
		}return Integer.parseInt(back);
	}
	
	public static int lengthOfNumber(int x)
	{
		String pal;
		pal=String.valueOf(x);
		return pal.length();
	}
}