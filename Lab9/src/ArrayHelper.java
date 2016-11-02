
/*
 * File Name: ArrayHelper.java
 * Zack Mryyan
 * EECS-169 Lab 9
 * This program contains the methods to print the matrix, find the sum and average single
 * line, and sum and average of the whole matrix.
 * 11/3/14
 */
public class ArrayHelper {
	public void print2DArray(int[][] array)
	{
		System.out.println("Here is your array");
		for(int i=0; i< array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				String output=""+array[i][j];
				if(j!=0)
				{
					output="\t"+output;
				}
				if(j<array[i].length-1)
				{
					output+=",";
				}
				System.out.print(output);
			}
			System.out.println("");
		}
	}
	public int arraySum(int[] array)
	{
		int sum=0;
		for(int i=0; i<array.length; i++)
		{
			sum= sum + array[i];
		}
		return(sum);
	}
	public double arrayAvg(int[] array)
	{
		double avg=0;
		int sum=0;
		for(int i=0; i<array.length; i++)
		{
			sum= sum + array[i];
			avg=(double)sum/array.length;
		}
		return(avg);
	}
	public int arraySum2D(int[][] array)
	{
		System.out.println("The sum for the entire array is = ");
		int sum=0;
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				sum= sum + array[i][j];
			}
		}
		return(sum);
	}
	public double arrayAvg2D(int[][] array)
	{
		System.out.println("The average for the entire array is = ");
		int sum=0;
		int total=0;
		double avg=0;
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				sum= sum + array[i][j];
				total=array[i].length*array.length;
				avg=(double)sum/total;
			}
		}
		return(avg);
	}
	public void transpose(int[][] array)
	{
		System.out.println("The transpose array is: ");
		if (array.length > 0) 
		 {
	       for (int i = 0; i < array[0].length; i++)
	         {
	           for (int j = 0; j < array.length; j++) 
	             {
	               System.out.print(array[j][i] + " ");
	             }
	           System.out.print("\n");
	         }
	     }
	}
}
