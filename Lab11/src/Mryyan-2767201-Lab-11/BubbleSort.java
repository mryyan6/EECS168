/*
 * File Name: BubbleSort.java
 * Zack Mryyan
 * EECS-169 Lab 11
 * This program is the basis of the sorting. It sorts ascending numbers, descending numbers, and ascending word length.
 * 11/17/14
 */

public class BubbleSort {
	public void ascending(int[] a)
	{
		int temp;
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-1; j++)
			{
				if(a[j] > a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	}
	
	public void descending(int[] a)
	{
		int temp;
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-1; j++)
			{
				if(a[j] < a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	}
	
	public void ascendingWord(String[] a)
	{
		String temp;
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-1; j++)
			{
				if(a[j].length() > a[j+1].length())
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	}
	
}
