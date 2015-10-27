package polymorphism;


public class Overriding {
	public static void main(String[] args) {
		Animal a = new Animal();
		Horse b = new Horse();
		
		try {
			a.eat();
		} catch (Exception e) {
			e.printStackTrace();
		}
		b.eat();
		b.printYourself();
	}
}

class Animal{
	public void eat() throws Exception {
		System.out.println("Generic Eat Method");
	}
	
	public void printYourself() {
		System.out.println("super. Method");
	}
}

class Horse extends Animal {
	public void eat() {
		System.out.println("Horse Eat Method");
	}
	
	public void printYourself() {
		super.printYourself();
		System.out.println("Horse print Method");
	}
	
	public void buck() {
		System.out.println("should not be accessible");
		
	}
} 
