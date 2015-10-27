package polymorphism;

public class TestShapes {
	
	public static void main(String[] args) {
		PlayerPiece player = new PlayerPiece();
		TilePiece tile = new TilePiece();
		doShapes(player);
		doShapes(tile);
		animateShapes(tile);
	}
	public static void doShapes(Gameshape shape) {
		shape.displayShape();
		shape.setShape();
	}
	public static void animateShapes(Animateable animateable) {
		animateable.animate();
	}
}
