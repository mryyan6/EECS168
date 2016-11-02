/*Letter_Counter.java
 * Zack Mryyan
 * EECS-169 Lab 12
 * This program will take a text file and tell you how many times a number occurs in a separate text file.
 * 12/1/14
 */

import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.util.Scanner;

public class Letter_Counter {
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		String input_text = null;
		String output_text = null;
		int type;
		int counter[] = new int[256];
		FileReader myFileReader = null;
		BufferedReader myBufferedReader= null;
		Boolean bool = false;
		int max=0;
		int letter = 0;
		do
			{
		try
		{
			System.out.println("Input a file name:");
			input_text=input.next();
			myFileReader = new FileReader(input_text);
			myBufferedReader = new BufferedReader(myFileReader);
			bool = false;
		}
		catch (Exception e)
		{
			System.out.println("Invalid filename given. Input another.");
			bool = true;
		}
			}while(bool);
		
		System.out.println("Input an out file name:");
		output_text=input.next();
		System.out.println("Do you want to sort by case? 1 for yes/ 0 for no.");
		type=input.nextInt();
		System.out.println("Reading from "+ input_text);
			
		
		if(type==1)//sorts by case
		{
			try
			{
				FileWriter myFileWriter = new FileWriter(output_text);
				BufferedWriter myBufferedWriter = new BufferedWriter(myFileWriter);
				String line = myBufferedReader.readLine();
				while(line != null)
				{
					System.out.println(line);
					for(int i=0; i<line.length(); i++)
					{
						for(int j=0; j<256; j++)
						{
							int ascii = (int) line.charAt(i);
							if(ascii==j)
							{
								counter[j]+=1;  
							}
						}
					}
					line = myBufferedReader.readLine();
				}
				for(int x=65;x<90;x++)
				{
					myBufferedWriter.write(Character.toString((char)x)+"="+counter[x]+"\n");
				}
				for(int x=97;x<122;x++)
				{
					myBufferedWriter.write(Character.toString((char)x)+"="+counter[x]+"\n");
				}
				for(int x=65;x<122;x++)//displays in console most frequent letter
				{
					
					if(max<counter[x])
					{
						max=counter[x];
						letter = x;
					}				

				}
				System.out.println("Letter(s) that appeared the most: "+((char)letter));
				
				myBufferedWriter.close();
				myBufferedReader.close();
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("Results stored in "+ output_text);
		}
		else if(type==0)//doesnt sort by case
		{
			try
			{
				FileWriter myFileWriter = new FileWriter(output_text);
				BufferedWriter myBufferedWriter = new BufferedWriter(myFileWriter);
				String line = myBufferedReader.readLine().toLowerCase();	
				while(line != null)
				{
					System.out.println(line);
					for(int i=0; i<line.length(); i++)
					{
						for(int j=0; j<256; j++)
						{
							int ascii = (int) line.charAt(i);
							if(ascii==j)
							{
								counter[j]+=1;  
							}
						}
					}
					line = myBufferedReader.readLine();
				}
				for(int x=97;x<122;x++)
				{
					myBufferedWriter.write(Character.toString((char)x)+"="+counter[x]+"\n");
				}
				
				for(int x=97;x<122;x++)
				{
					
					if(max<counter[x])
					{
						max=counter[x];
						letter = x;
					}				

				}
				System.out.println("Letter(s) that appeared the most: "+((char)letter));//displays in console most frequent letter
				myBufferedWriter.close();
				myBufferedReader.close();
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("Results stored in "+ output_text);
		}
		
	}
}