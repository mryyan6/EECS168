/*Colosseum.java
 * Zack Mryyan
 * EECS-169 HW 3
 * This program will be the main function to the user. It will interact with the user and play the rounds.
 * 11/6/14
 */
import java.util.Scanner;

public class Colosseum 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		Pokemon pokemon1 = new Pokemon();
		Pokemon pokemon2 = new Pokemon();
		Dice d2 = new Dice();
		int turn;
		int round=1;
		int again;
		int health1;
		int health2;
		int attack1;
		int attack2;
		int defense1;
		int defense2;
		do{	
			boolean ender= false;	
			d2.dice(2);
			pokemon1.pokemon();
			pokemon2.pokemon();
			
			System.out.println("Player 1, build your Pokemon!");
			System.out.println("=============================");
			
			pokemon1.userBuild();
			health1=pokemon1.get_hp();
			attack1=pokemon1.get_attack();
			defense1=pokemon1.get_defense();
			
			System.out.println("Player 2, build your Pokemon!");
			System.out.println("=============================");
			
			pokemon2.userBuild();
			health2=pokemon2.get_hp();
			attack2=pokemon2.get_attack();
			defense2=pokemon2.get_defense();
			System.out.println("Player 1 will roll a D2 to see who goes first.");
			turn=d2.roll();
			if(turn==1)
			{
				System.out.println("Player 1 rolls a 1 and will go first");
			}
			else
			{
				System.out.println("Player 1 rolls a 2 and will go second");
			}
			System.out.println(" ");
			for(int x=0; x<10; x++)
			{
				if(turn==1)
				{	
					if(ender==false)
					{
						System.out.println("");
						System.out.println("Round"+ (x+1)+"!");
						System.out.println("");
						ender=pokemon1.attack(pokemon2);
						if(ender==false)
						{
							ender = pokemon2.attack(pokemon1);
						}
						System.out.println("");
					}
				}
				else
				{
					if(ender==false)
					{
						System.out.println("");
						System.out.println("Round"+ (x+1)+"!");
						System.out.println("");
						ender = pokemon2.attack(pokemon1);
						if(ender==false)
						{
							ender=pokemon1.attack(pokemon2);
						}
						System.out.println("");
					}
				}
			}
			if(ender == false)
			{
				System.out.println("Both fighters are still standing! It's a draw!");
			}
			System.out.println("Do you want to play again? Enter 1 for yes or 0 for no.");
			again=input.nextInt();
			
			if(pokemon1.get_hp()>pokemon2.get_hp())//pokemon 1 wins
			{
				ender=false;
				pokemon1.set_hp(health1);
				pokemon1.set_attack(attack1);
				pokemon1.set_defense(defense1);
				System.out.println("Player 2, build your Pokemon!");
				System.out.println("=============================");
				
				pokemon2.userBuild();
				health2=pokemon2.get_hp();
				attack2=pokemon2.get_attack();
				defense2=pokemon2.get_defense();
				System.out.println("Player 1 will roll a D2 to see who goes first.");
				turn=d2.roll();
				if(turn==1)
				{
					System.out.println("Player 1 rolls a 1 and will go first");
				}
				else
				{
					System.out.println("Player 1 rolls a 2 and will go second");
				}
				System.out.println(" ");
				for(int x=0; x<10; x++)
				{
					if(turn==1)
					{	
						if(ender==false)
						{
							System.out.println("");
							System.out.println("Round"+ (x+1)+"!");
							System.out.println("");
							ender=pokemon1.attack(pokemon2);
							if(ender==false)
							{
								ender = pokemon2.attack(pokemon1);
							}
							System.out.println("");
						}
					}
					else
					{
						if(ender==false)
						{
							System.out.println("");
							System.out.println("Round"+ (x+1)+"!");
							System.out.println("");
							ender = pokemon2.attack(pokemon1);
							if(ender==false)
							{
								ender=pokemon1.attack(pokemon2);
							}
							System.out.println("");
						}
					}
				}
				if(ender == false)
				{
					System.out.println("Both fighters are still standing! It's a draw!");
				}
				System.out.println("Do you want to play again? Enter 1 for yes or 0 for no.");
				again=input.nextInt();
				
			}
			else if(pokemon2.get_hp()>pokemon1.get_hp())//pokemon 2 wins
			{
				ender=false;
				pokemon2.set_hp(health2);
				pokemon2.set_attack(attack2);
				pokemon2.set_defense(defense2);
				
				System.out.println("Player 1, build your Pokemon!");
				System.out.println("=============================");
				
				
				pokemon1.userBuild();
				health1=pokemon1.get_hp();
				attack1=pokemon1.get_attack();
				defense1=pokemon1.get_defense();
				System.out.println("Player 1 will roll a D2 to see who goes first.");
				turn=d2.roll();
				if(turn==1)
				{
					System.out.println("Player 1 rolls a 1 and will go first");
				}
				else
				{
					System.out.println("Player 1 rolls a 2 and will go second");
				}
				System.out.println(" ");
				for(int x=0; x<10; x++)
				{
					if(turn==1)
					{	
						if(ender==false)
						{
							System.out.println("");
							System.out.println("Round"+ (x+1)+"!");
							System.out.println("");
							ender=pokemon1.attack(pokemon2);
							if(ender==false)
							{
								ender = pokemon2.attack(pokemon1);
							}
							System.out.println("");
						}
					}
					else
					{
						if(ender==false)
						{
							System.out.println("");
							System.out.println("Round"+ (x+1)+"!");
							System.out.println("");
							ender = pokemon2.attack(pokemon1);
							if(ender==false)
							{
								ender=pokemon1.attack(pokemon2);
							}
							System.out.println("");
						}
					}
				}
				if(ender == false)
				{
					System.out.println("Both fighters are still standing! It's a draw!");
				}
				System.out.println("Do you want to play again? Enter 1 for yes or 0 for no.");
				again=input.nextInt();
				
				
			}
			
	
		}while(again==1);//play again loop

	}
}