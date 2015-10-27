package polymorphism;

public class TilePiece extends Gameshape implements Animateable {
	public void getAdjecent() {
		System.out.println("getting adjecent tile");
	}

	@Override
	public void animate() {
		System.out.println("animiert");
	}
}
