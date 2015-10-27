import abstractClass.Fruit;

public class Apple extends Fruit{

	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.eat();
	}
	@Override
	public void eat() {
		System.out.println("essen");
	}
	
}
