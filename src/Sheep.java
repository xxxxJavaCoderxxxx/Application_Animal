public class Sheep extends Herbivore {
	private static String name ="Sheep";
	private static String voice ="baa-baa";
	public Sheep() {
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
