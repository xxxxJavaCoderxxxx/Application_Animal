import Interfaces.Swim;
public class Fish  extends Carnivorous implements Swim {
	private static String name ="Fish";
	public Fish() {
		super(name);
	}
	@Override
	public void swim() {
		System.out.println("Swim");
	}
}
