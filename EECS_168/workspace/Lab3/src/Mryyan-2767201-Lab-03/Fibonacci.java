import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args)
{
		double sum = 1;
		double first;
		Scanner input = new Scanner(System.in);
		System.out.println("How many fibonacci numbers would you like to see?");
		first= input.nextDouble();
		System.out.println("Here is your fibonacci sequence:");
		double n = first;
		double fib1 = 0;
		double fib2 = 1;
		if (first==1)
		{
			System.out.println("0");
		}
		else if (first==2)
		{
			System.out.println("0");
			System.out.println("1");
		}
		else
		{
		System.out.println("0");
		for( int x=1; x<n; x=x+1)
		{
			System.out.println(sum);
			sum=fib1+fib2;
			fib1=fib2;
			fib2=sum;
			
			}
		}
input.close();
}
}


