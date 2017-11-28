package Servant;

public class Square implements Movable{
	private int sideA;
	 private int sideB;
	 private int sideC;
	 private int sideD;
	 
	 Point position = null;
	 public Square(int sideA,int sideB, Point p){
	  this.sideA = sideA;
	  this.sideB = sideB;
	  this.sideC = sideA;
	  this.sideD = sideB;
	  this.position = p;
	 }
	 
	 public void setPosition(Point p) {
	  this.position = p;
	 }

	 public Point getPosition() {
	  return this.position;
	 }

	public int getSideA() {
		return sideA;
	}

	public void setSideA(int sideA) {
		this.sideA = sideA;
	}

	public int getSideB() {
		return sideB;
	}

	public void setSideB(int sideB) {
		this.sideB = sideB;
	}

	public int getSideC() {
		return sideC;
	}

	public void setSideC(int sideC) {
		this.sideC = sideC;
	}

	public int getSideD() {
		return sideD;
	}

	public void setSideD(int sideD) {
		this.sideD = sideD;
	}
	
	public String toString(){
		return "side A: " + getSideA() + " side B: " + getSideB() + " side C: " + getSideC() + " side D: " + getSideD() 
		+ " Position: " + getPosition(); 
	}
	
}
