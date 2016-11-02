/*
 * File Name: Lab09.java
 * Zack Mryyan
 * EECS-169 Lab 9
 * This program will interact with the user to print the matrix, find the sum and average single
 * line, and sum and average of the whole matrix.
 * 11/3/14
 */
import java.util.Scanner;

public class Lab09 {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int row;
		int column;
		System.out.println("How many rows?: ");
		row=input.nextInt();
		System.out.println("How many columns?: ");
		column=input.nextInt();
		int [][] grid= new int[row][column];
		for(int i=0; i<grid.length; i++)
		{
			for(int j=0; j<grid[i].length; j++)
			{
				System.out.println("Enter a value for position ("+i+","+j+"): ");
				grid[i][j]=input.nextInt();
			}
		}
		ArrayHelper k=new ArrayHelper();
		k.print2DArray(grid);
		for(int i=0; i<grid.length; i++)
		{
			System.out.println("row "+i+" sum= "+k.arraySum(grid[i])+ " avg = "+k.arrayAvg(grid[i]));
		}
		System.out.println(k.arraySum2D(grid));
		System.out.println(k.arrayAvg2D(grid));
		if(row==column)
		{
			k.transpose(grid);			
		}
		else
		{
			System.out.println("Cannot transpose this array");
		}
		input.close();
	}
}
