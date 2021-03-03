public class Hippopotamus extends Herbivore{
	private static String name ="Hippopotamus";
	private static String voice ="growl";
	public Hippopotamus() {
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
