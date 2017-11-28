package Servant;

public class Main {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(1, 3, 2, new Point(-1,0));
		Square square = new Square(2, 4, new Point(2,5));
		Rectangle rec = new Rectangle(4, 3, new Point(-3,6));
		
		MoverServant mover = new MoverServant();
		
		mover.MoveTo(triangle, new Point(3,2));
		mover.MoveTo(square, new Point(4,5));
		mover.MoveTo(rec, new Point(6,7));
	}

}
