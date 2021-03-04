import Foodpackage.*;
import Interfaces.Voice;
public class Worker {
	public void feed(Food food, Animal animal) {
		animal.eat(food);
	}
	
	public void getVoice(Animal animal) {
			Voice voiceAnimal = (Voice) animal;
			System.out.println(voiceAnimal.voice());
}
}
