public class Lion extends Carnivorous{
	private static String name ="Lion";
	private static String voice = "Roar";
	public Lion() {
		super(name, voice);
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
