package non_servant;

public class driver {
	public static void main(String[] args){
		Triangle triangle = new Triangle(1, 3, 2, new Point(-1,0));
		Square square = new Square(2, 4, new Point(2,5));
		Rectangle rec = new Rectangle(4, 3, new Point(-3,6));
		
		triangle.MoveTo(new Point(3,2));
		square.MoveTo(new Point(4,5));
		rec.MoveTo(new Point(6,7));
		
	}
}
