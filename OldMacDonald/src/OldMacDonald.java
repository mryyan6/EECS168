//this sings the song 
public class OldMacDonald {
	private Animal which_animal;
	public void setAnimal(Animal animalA)
	{
		which_animal=animalA;
	}
	public Animal getAnimal()
	{
		return(which_animal);
	}
	public void sing()
	{
		System.out.println("Old MacDonald had a farm, EE-I-EE-I-O");
		System.out.println("And on the farm he had a " + which_animal.getType() +" EE-I-EE-I-O");
		System.out.println("With a "+which_animal.getSound()+"-"+which_animal.getSound()+ " here, and a "+which_animal.getSound()+"-"+which_animal.getSound()+ " there,");
		System.out.println("Here a "+which_animal.getSound()+", there a "+which_animal.getSound()+ " everywhere a " +which_animal.getSound()+"-"+which_animal.getSound()+",");
		System.out.println("Old MacDonald had a farm, EE-I-EE-I-O");
		
	}
}