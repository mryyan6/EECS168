
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{
		int num;
	    int fact=1;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter the number to compute factorial");
	    do
	    {
	    num = input.nextInt();	
	    if(num>0)
	    {
	    	for (int x=2;x<=num; x++){
	        fact=fact*x;
	    	}System.out.println("Factorial: "+fact);
	    	}
	    else
	    {
	    	System.out.println("Enter a non-negative number");
	    	num= input.nextInt();
	    	for (int x=2;x<=num; x++){
		        fact=fact*x;
	    	
	    }System.out.println("Factorial: "+fact);
	    }}while(num < 0);

	input.close();
	    
	    }
}

