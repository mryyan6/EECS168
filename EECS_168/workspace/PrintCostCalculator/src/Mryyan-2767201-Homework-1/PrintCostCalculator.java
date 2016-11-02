

/*File Name: Project_1 
Author: Zackery Mryyan 
    KUID: 2767201
Email Address: zmryyan@gmail.com 
Homework Assignment Number: 1 
Description: This program is supposed to estimate the cost of of a printing project based on a number of different variables.
Last Changed: 9/23/14 
*/
import java.util.Scanner;

public class PrintCostCalculator {
public static void main(String[] args)
{
	Scanner input = new Scanner(System.in);
	double totalInk = 0;  
	double ink = 0;
	double digits, type, inkUsage, printColor, market;
	inkUsage = 0;
	double costPage = 0;
	double totalCost = 0;
	System.out.println("--- Price Estimator Program ---");
	System.out.print("Enter Number of Pages (digits only):\n");
	digits = input.nextDouble();
	System.out.println("---- Select a Print Type ----");
	System.out.println("Enter T or t for Text");
	System.out.println("Enter I or i for Image");
	System.out.println("Enter C or c for Compressed Text");
	System.out.println("Enter S or s for statement");
	System.out.println("---------------------------");
	System.out.print("Enter Print Type: ");
	String tmp_str = input.next();
	type = tmp_str.charAt(0);
    while(type != 't' && type != 'T' && type!= 'i' && type !='I' && type != 'c' && type !='C' && type!= 's' && type!='S')
    {
    	System.out.println("Invalid Entry for Print Type.");
    	System.out.println("---- Select a Print Type ----");
		System.out.println("Enter T or t for Text");
		System.out.println("Enter I or i for Image");
		System.out.println("Enter C or c for Compressed Text");
		System.out.println("Enter S or s for statement");
		System.out.println("---------------------------");
		System.out.print("Enter Print Type: ");
		tmp_str = input.next();
		type = tmp_str.charAt(0);
    }
	System.out.println("\n"+"--- Select a Print Color ---");
	System.out.println("Enter 0 for Grayscale");
	System.out.println("Enter 1 for Color");
	System.out.println("---------------------------");
	System.out.print("Enter Print Color: ");
	printColor = input.nextDouble();
	while(printColor !=0 && printColor !=1)
	{
		System.out.println("Invalid Entry for Print Color.");
		System.out.println("\n"+"--- Select a Print Color ---");
		System.out.println("Enter 0 for Grayscale");
		System.out.println("Enter 1 for Color");
		System.out.println("---------------------------");
		System.out.print("Enter Print Color: ");
		printColor = input.nextDouble();
	}
	System.out.println("---------------------------");
	System.out.println("Is there a sale (y/n):");
	String sale = input.next();
	market = sale.charAt(0);
	System.out.println("---------------------------"+"\n");
	System.out.println("--- Cost Estimate ---");
	
		if(type=='T'||'t'==type)
		{
			inkUsage=4300;
		}
		else if(type=='I'||'i'==type)
		{

			inkUsage=15000;
		}
		else if(type=='C'||'c'==type)
		{
			inkUsage=25000;
		}
		else if(type=='S'||'s'==type)
		{
			inkUsage=27000;
		}
			
		if(printColor==0)
		{
			ink=.03;
		}
		else if(printColor == 1)
		{
			ink=.11;
		}
		
		totalInk = digits * inkUsage;
		costPage = (totalInk*ink)/100000;
		totalCost = costPage* digits;
		

	if(digits<=100)
	{
		//This if statement runs the price without a sale
		System.out.print("Ink Usage Per Page: "+ inkUsage+"\n");
		System.out.printf("Total Ink Usage: %.2e\n", +totalInk);
		System.out.println("");
		System.out.printf("Estimated Cost Per Page: $ %.4f\n", +costPage);
		System.out.printf("Cost Before Tax: $ %.2f\n", +totalCost);
		System.out.println("");
		System.out.printf("Total Cost after Tax: $ %.2f\n", +totalCost*1.0063);
	}
	else if (market=='y'||'Y'==market && digits>100)
	{
		//This else if runs the price with the sale price
		System.out.print("Ink Usage Per Page: "+ inkUsage+"\n");
		System.out.printf("Total Ink Usage: %.2e\n", +totalInk);
		System.out.println("");
		System.out.printf("Estimated Cost Per Page: $ %.4f\n", +costPage/2.0);
		System.out.printf("Total Cost: $ %.2f\n", +totalCost/2.0);
		System.out.println("");
		System.out.printf("SALE Price: $ %.2f\n", +totalCost/4.0);
		System.out.println("");
		System.out.printf("Total Cost after Tax: $ %.2f\n", +(totalCost/4.0)*1.0063);
	}
	else if(market=='n'||'N'==market && digits>100)
	{
		//This else if runs the price without a sale because they dont have knowledge of a sale
	    System.out.print("Ink Usage Per Page: "+ inkUsage+"\n");
	    System.out.printf("Total Ink Usage: %.2e\n", +totalInk);
	    System.out.println("");
		System.out.printf("Estimated Cost Per Page: $ %.4f\n", +costPage/2.0);
		System.out.printf("Total Cost: $ %.2f\n", +totalCost/2.0); 
		System.out.println("");
		System.out.printf("Total Cost after Tax: $ %.2f\n", +(totalCost/2.0)*1.006);
		System.out.println("");
	}
input.close();
}
}