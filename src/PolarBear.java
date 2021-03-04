import Interfaces.*;
public class PolarBear extends Carnivorous implements Swim, Run, Voice  {
	private static String name ="PolarBear";
	private static String voice = "Roar+Growl";
	public PolarBear() {
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
