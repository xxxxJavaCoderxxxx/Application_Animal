public class Duck extends Herbivore  {
	private static String name ="Duck";
	private static String voice ="krya-krya";
	public Duck() {
		super(name, voice);
	}
	@Override
	public void fly() {
		System.out.println("Fly");
	}
	@Override
	public void swim() {
		System.out.println("Swim");
	}
	@Override
	public void run() {
		System.out.println("run");
	}
	@Override
	public String voice(){
		return voice;
	}
}
