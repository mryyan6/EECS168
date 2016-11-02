import java.util.Scanner;

public class Lab6 {
	public static void main(String[] args)
	{
		int size;
		int sum=0;
		double avg=0;
		int min;
		int max;
		Scanner input =new Scanner(System.in);
		System.out.println("Input an array size:");
		size=input.nextInt();
		while(size<=0)
		{
			System.out.println("Please enter a number greater than 0.");
			size=input.nextInt();
		}
		System.out.println("Now please enter "+size+" numbers");
		int[] number=new int[size];
		for(int i=0; i < number.length; i++)
		{
			System.out.print("Input a number into your array: ");
			number[i]=input.nextInt();
		}
		System.out.println("Here are all the numbers in your array:");
		for(int i=0; i < number.length; i++)
		{
			System.out.println(number[i]);
		}
				
		for(int i=0; i < number.length; i++)
		{
			sum= sum + number[i];
		}
		System.out.println("The sum of all the values is:" +sum);
		for(int i=0; i < number.length; i++)
		{
			avg= (double)sum/number.length;
		}
		System.out.println("The average of all the values is:" +avg);
		max = number[0];
		for(int i=0; i < number.length; i++)
		{
			if(max<number[i])
			{
				max=number[i];
			}
		}
		System.out.println("The largest value is:" +max);		
		min = number[0];
		for(int i=0; i < number.length; i++)
		{
			if(min>number[i])
			{
				min=number[i];
			}
		}
		System.out.println("The smallest value is:" +min);
	input.close();
	}
	

}