import java.util.Scanner;

public class AsciiArt 
{
	public static void main(String[] args)
	{
		int choice = 0;
		int size= 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Choose one of the following patterns by typing the correspsonding number:");
		System.out.println("1) Stripes");
		System.out.println("2) Checker Board");
		System.out.println("3) Double Diagonal (aka the X)");
		choice = input.nextInt();
		
		if (choice < 1 || choice > 3)
		{
			System.out.println("\nError.");
			System.exit(0);
		}
		System.out.println("\nInput a size (must be larger than 1):");
size = input.nextInt();
		
		if (size <=0){
			System.out.println("\nError.");
			System.exit(0);
		}
		
		System.out.println("");
		
		//Call proper function
		if (choice == 1){
			drawStripes(size);
		}else if (choice == 2){
			drawChecker(size);
		}else if (choice == 3){
			drawX(size);
		}
		input.close();
	}
	
	//Draw Stripes
	public static void drawStripes(int dSize)
	{
		//Loop
		for (int x=0; x < dSize; x++){
			System.out.print(x);
			for (int y=0; y < dSize; y++){
				if (y % 2 == 0){
					System.out.print(" *");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
	
	//Draw Checkers
	public static void drawChecker(int dSize)
	{
		//Incremental Number 'Key'
		int key = 0;
		
		//Loop
		for (int x=0; x < dSize; x++){
			System.out.print(x);
			for (int y=0; y < dSize; y++){
				key++;
				if (key % 2 == 0){
					System.out.print("  ");
				}else{
					System.out.print(" *");
				}
			}
			System.out.println("");
		}
	}
	
	//Draw an X (Double Diagonal)
	public static void drawX(int dSize)
	{
		//Incremental Number 'Key'
		int xKey = 0;
		
		//Loop
		for (int x=0; x < dSize; x++){
			System.out.print(x);
			for (int y=0; y < dSize; y++){
				xKey++;
				if (y == x || dSize - y == x + 1){
					System.out.print(" *");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		
	}
}