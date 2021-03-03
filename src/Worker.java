import Foodpackage.*;
import Interfaces.Voice;
public class Worker {
	public void feed(Food food, Animal animal) {
		animal.eat(food);
	}
	
	public String getVoice(Animal animal) {
			return animal.voice();
}
}
