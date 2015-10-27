package casting;

public class CastTestDog {
	public static void main(String[] args) {
		Animal [] a = {new Animal(), new Dog(), new Animal() };
		for(Animal animal:a)  {
			if(animal instanceof Dog) {
				Dog d = (Dog) animal;
				d.playDead();
			}
		}
	}
}

class Animal {
	void makeNoise() {
		System.out.println("generic noise");
	}
}

class Dog extends Animal {
	void makeNoise() {
		System.out.println("wuff");
	}
	void playDead() {
		System.out.println("roll over");
	}
}