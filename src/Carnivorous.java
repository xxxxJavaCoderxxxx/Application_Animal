import Foodpackage.*;
public class Carnivorous extends Animal {
	public Carnivorous(String name, String voice) {
		super(name, voice);
	}
	public Carnivorous(String name) {
		super(name);
	}
	@Override
	public void eat(Food food)
	{
		if (food instanceof Grass) {
			System.out.println("This is not meat!");
		} else {
			System.out.println("OmNomNom");
		}
	}	
}