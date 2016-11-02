import java.util.Scanner;

public class SquareMatrix {
	public static void main(String[] args){
		//Variable Declarations
		int size = 0;
		int key = 0;	
		
		//Input Menu and Prompts
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Size of the Square Matrix:");
		size = input.nextInt();
		System.out.println("Square Matrix:");
		
		//Matrix Loop
		for (int x=0; x < size; x++){
			for (int y=0; y < size; y++){
				key++;
				System.out.print(key + " ");
			}
			System.out.println("");
		}
		
		
		//Transpose Loop
		System.out.println("Transpose Matrix:");
		for (int x=0; x < size; x++){
			key = x + 1;
			for (int y=0; y < size; y++){
				System.out.print(key + " ");
				key += size;
			}
			System.out.println("");
		}
		input.close();
	}
	

}