//this runs the program allowing user to input
import java.util.Scanner;

public class TestOldMacDonald {
	public static void main(String[] args)
	{
		Animal animalA= new Animal();
		OldMacDonald md = new OldMacDonald();
		Scanner input= new Scanner(System.in);
		System.out.println("Input a animal:");
		String type=input.next();
		System.out.println("What sound does a "+type+ " make?");
		String sound=input.next();
		System.out.println("Let's sing!");
		animalA.setSound(sound);
		animalA.setType(type);
		md.setAnimal(animalA);
		md.sing();
	input.close();
	}

}