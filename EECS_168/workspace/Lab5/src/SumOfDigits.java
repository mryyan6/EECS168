/*MethodPractice.java
 * Zack Mryyan
 * EECS-169 Lab 5
 * This program will add up the digits in a number.
 * 9/29/14
 */
import java.util.Scanner;



public class SumOfDigits {
	public static void main(String[] args)
		{
			int x,y;
	        Scanner input= new Scanner(System.in);
	        System.out.println("Please enter a No:");
	        x=input.nextInt();
	        System.out.println("The sum of the digits is:" + SumOfTheDigits(x));
	        System.out.println("Want to try again?(y=1/n=0):");
	        y=input.nextInt();
	            while (y == 1)
                {           		
	            		System.out.println("Please enter a No:");
                        x=input.nextInt();
                        System.out.println("The sum of the digits is:" + SumOfTheDigits(x));
                        System.out.println("Want to try again?(y=1/n=0):");
            	        y=input.nextInt();
               }
                System.out.println("Thank you!");
         
		}

        public static int SumOfTheDigits(int a)
        {
        	int Sum=0;
        	while (a!=0)
        	{
        		Sum= (a%10)+Sum;
        		a=a/10;
        	}
        	return Sum;
        	
        }
}
