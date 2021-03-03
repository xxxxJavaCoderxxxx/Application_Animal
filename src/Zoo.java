import Foodpackage.*;
public class Zoo {

	public static void main(String[] args) {
		Lion lion = new Lion();
		Hippopotamus hippopotamus = new Hippopotamus();
		Duck duck = new Duck();
		Fish fish = new Fish();
		Worker worker = new Worker();
		
		BeefMeat newMeat = new BeefMeat();
		Grass_Dill newDill = new Grass_Dill();
		
		worker.feed(newDill, lion);
		worker.feed(newMeat, lion);
		System.out.println(worker.getVoice(lion));
		
		worker.feed(newDill, hippopotamus);
		worker.feed(newMeat, hippopotamus);
		System.out.println(worker.getVoice(hippopotamus));
		Animal[] pool = {hippopotamus,duck,fish,fish};
		for(int i=0; i < 4; i++) {
			pool[i].swim();
		}
	}
}
