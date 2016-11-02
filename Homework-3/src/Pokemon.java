/*Pokemon.java
 * Zack Mryyan
 * EECS-169 Hw 3
 * This program will deal with the variables during the attack. It also lets the user cast spells or decide to attack.
 * 11/6/14
 */
import java.util.Scanner;

public class Pokemon 
{
	private int hp;
	private int attack;
	private int defense;
	private String name;
	private Dice d20 = new Dice();
	private Dice d6 = new Dice();
	int attack2 = 0;
	int defense2 = 0;
	int attackBonus;
	int defenseBonus;
	public void pokemon()
	{
		d20.dice(20);
		d6.dice(6);
		hp = 0;
		attack = 0;
		defense = 0;
		name = " ";
	}
	
	public boolean attack(Pokemon opponent)
	{
		
		int spell;
		int type;
		int attackBonus;
		int defenseBonus;
		System.out.println(name+" is attacking "+opponent.name);
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to cast a physical attack or cast a spell? Enter 1 for physcial attack or 0 for spell.");
		type=input.nextInt();
		if(type==1)
		{	
			attackBonus=d20.roll();
			System.out.println(name+ " rolls an attack bonus of "+attackBonus);
			defenseBonus=d20.roll();
			System.out.println(opponent.name+ " rolls a defense bonus of " +defenseBonus);
			int attackLevel = attack;
			int defenseLevel = defense;
			int damage=0;
			int sub1 = 0;
			int sub2 = 0;
			int sub3 = 0;
			
			if((attackLevel+attackBonus) > (defenseLevel+defenseBonus))
			{
				System.out.println("The attack hits dealing 3-D6 damage!");
				sub1 = d6.roll();
				sub2 = d6.roll();
				sub3 = d6.roll();
				damage = sub1+sub2+sub3;
				System.out.println("The rolls are "+sub1+", "+sub2+", and "+sub3+" totaling: "+damage+" damage!");
				opponent.hp=opponent.hp-damage;
				System.out.println(opponent.name+" has "+opponent.hp+" hit points left");
				if(opponent.hp<=0)
				{
					System.out.println(opponent.name+" has been defeated!");
					return(true);
				}
				else
				{
					return(false);
				}
			}
			else
			{
				System.out.println("The attack missed!");
				return(false);
			}
		}
		else if(type==0)//spell
		{
			for(int x=1; x<2; x++)
			{	
				System.out.println("What type of spell do you want to cast? Enter 0 to raise attack, 1 to raise defense.");
				spell = input.nextInt();
				if(spell==0)
				{
					
					if(attack2 < attack) 
					{
						attack2 = attack+5;
						System.out.println("Your attack has been raised to "+attack2);
					}
					else
					{
						System.out.println("You've already used this spell.");
						
							attackBonus=d20.roll();
							System.out.println(name+ " rolls an attack bonus of "+attackBonus);
							defenseBonus=d20.roll();
							System.out.println(opponent.name+ " rolls a defense bonus of " +defenseBonus);
							int attackLevel = attack;
							int defenseLevel = defense;
							int damage=0;
							int sub1 = 0;
							int sub2 = 0;
							int sub3 = 0;
							
							if((attackLevel+attackBonus) > (defenseLevel+defenseBonus))
							{
								System.out.println("The attack hits dealing 3-D6 damage!");
								sub1 = d6.roll();
								sub2 = d6.roll();
								sub3 = d6.roll();
								damage = sub1+sub2+sub3;
								System.out.println("The rolls are "+sub1+", "+sub2+", and "+sub3+" totaling: "+damage+" damage!");
								opponent.hp=opponent.hp-damage;
								System.out.println(opponent.name+" has "+opponent.hp+" hit points left");
								if(opponent.hp<=0)
								{
									System.out.println(opponent.name+" has been defeated!");
									return(true);
									
								}
								else
								{
									return(false);
								}
							}
							else
							{
								System.out.println("The attack missed!");
								return(false);
							}
					}
				}
			else if(spell==1)
			{
				if(defense2 < defense)
				{
					defense2 = defense+5;
					System.out.println("Your defense has been raised to " +defense2);
				}
				else
				{
					System.out.println("You've already used this spell.");
						
						attackBonus=d20.roll();
						System.out.println(name+ " rolls an attack bonus of "+attackBonus);
						defenseBonus=d20.roll();
						System.out.println(opponent.name+ " rolls a defense bonus of " +defenseBonus);
						int attackLevel = attack;
						int defenseLevel = defense;
						int damage=0;
						int sub1 = 0;
						int sub2 = 0;
						int sub3 = 0;
						
						if((attackLevel+attackBonus) > (defenseLevel+defenseBonus))
						{
							System.out.println("The attack hits dealing 3-D6 damage!");
							sub1 = d6.roll();
							sub2 = d6.roll();
							sub3 = d6.roll();
							damage = sub1+sub2+sub3;
							System.out.println("The rolls are "+sub1+", "+sub2+", and "+sub3+" totaling: "+damage+" damage!");
							opponent.hp=opponent.hp-damage;
							System.out.println(opponent.name+" has "+opponent.hp+" hit points left");
							if(opponent.hp<=0)
							{
								System.out.println(opponent.name+" has been defeated!");
								return(true);
							}
							else
							{
								return(false);
							}
						}
						else
						{
							System.out.println("The attack missed!");
							return(false);
						}
				}
			} 
		}	
	}return(false);
}
	
	public void userBuild()
	{
		Scanner input = new Scanner (System.in);
		int totalD;
		System.out.println("Please name your Pokemon: ");
		name = input.next();
		System.out.println("How many hitpoints will it have? (1-50): ");
		hp = input.nextInt();
		while(hp < 1 || hp > 50)
		{	
			System.out.println("Sorry the hitpoints must be between 1-50:");
			hp = input.nextInt();
		}
		System.out.println("Split fifty points between attack level and defense level.");
		System.out.println("Enter attack level (1-49)");
		attack = input.nextInt();
		while (attack < 1 || attack > 49)
		{	
			System.out.println("Sorry the defense level must be between 1-49:");
			attack = input.nextInt();
		}
		totalD= (50-attack);
		System.out.println("Enter your defense level (1-"+totalD+")");
		defense = input.nextInt();
		while(defense < 1 || defense > totalD)
		{
			System.out.println("Sorry the defense level must be between (1-"+totalD+")");
			defense = input.nextInt();
		}
	}
	public void set_hp(int hp1)
	{
		hp=hp1;
	}
	public void set_attack(int attack1)
	{
		attack=attack1;
		
	}
	public void set_defense(int defense1)
	{
		defense=defense1;	
	}
	public void set_name(String name1)
	{
		name=name1;
	}
	public int get_hp()
	{
		return(hp);
	}
	public int get_attack()
	{
		return(attack);
	}
	public int get_defense()
	{
		return(defense);
	}
	public String get_name()
	{
		return(name);
	}
	
}