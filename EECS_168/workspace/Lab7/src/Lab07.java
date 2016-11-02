import java.util.Scanner;

public class Lab07 {
	public static void main(String[] args)
	{
		double find=0;
		double size;
		double second;
		double value;
		Scanner input= new Scanner(System.in);
		System.out.println("Input an array size: ");
		size=input.nextInt();
		while(size<=0)
		{
			System.out.println("Please enter a number greater than 0.");
			size=input.nextInt();
		}
		System.out.println("Now please enter "+(int)size+" numbers");
		double[] number= new double[(int) size];
		for(int i=0; i < number.length; i++)
		{
			System.out.print("Input a number into your array: ");
			number[i]=input.nextDouble();
		}
		printArray(number);		
		System.out.println("");
		System.out.println("\n"+"Input a new size: ");
		second=input.nextDouble();
		while(second<=size)
		{
			System.out.println("Please insert a number greater than your original array.");
			second=input.nextDouble();
		}
		value=second-size;
		System.out.println("You need to add "+(int)value+" values");
		double [] resize= arrayResize(number,(int) second);
		for(int i=(int) size; i<resize.length; i++)
		{
			System.out.println("Input a number to add to your array: ");
			resize[i]=input.nextDouble();
		}
		printArray(resize);
		System.out.println("");
		System.out.println("\n"+"Enter a value to count:");
		find=input.nextDouble();
		int x= count(resize, find);
		System.out.println(find+" occurs "+x+" times in the array.");
		
	}
	public static void printArray(double[] arr)
	{
		System.out.println("Here are all the numbers in your array:");
		System.out.print("[");
		for(int i=0; i< arr.length; i++)
		{
			if(arr.length==1)
			{
				System.out.print(+arr[i]);
			}
			if(arr.length>1)
			{
				System.out.print(+arr[i]+",");
			}
		}
		System.out.print("]");
	}
	public static double[] arrayResize(double[] oldArray, int newSize)
	{
		double [] temp= oldArray;
		oldArray= new double[newSize];
		for(int i=0; i< temp.length; i++)
		{
			oldArray[i]=temp[i];
		}
		return(oldArray);
	}
	public static int count(double[] arr, double value)
	{
		int count = 0;
		for (int i=0; i< arr.length; i++)
		{
			if(arr[i] == value)
			{
				count++;
			}
		}
		return count;
	}
}
