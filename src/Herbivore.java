import Foodpackage.*;

public abstract class Herbivore extends Animal {
	public Herbivore (String name, String voice) {
		super(name, voice);
	}
	public Herbivore (String name) {
		super(name);
	}
	@Override
	public void eat(Food food)
	{
		if (food instanceof Meat) {
			System.out.println("This is not grass!");
		}
		else {
			System.out.println("OmNomNom");
		}
	}
}