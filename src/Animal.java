import Foodpackage.*;
public abstract class  Animal{
	protected String name;
	protected String voice;
	public Animal(String name, String voice) {
		this.name = name;
		this.voice = voice;
	}
	public Animal(String name) {
		this.name = name;
	}
	public abstract void eat(Food food);

			
}
