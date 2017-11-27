package non_servant;

public class Triangle {
	 private int sideA;
	 private int sideB;
	 private int sideC;
	 
	 Point position = null;
	 
	 public Triangle(int sideA,int sideB,int sideC,Point p){
	  this.sideA = sideA;
	  this.sideB = sideB;
	  this.sideC = sideC;
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
	 
	 public String toString(){
		return "side A: " + getSideA() + " side B: " + getSideB() + " side C: " + getSideC() 
		+ " Position: " + getPosition(); 
	}

	 public void MoveTo(Point position){
		 Point previousPosition = getPosition();
		  System.out.printf("Moving smoothly from position x=%d,y=%d to position x=%d,y=%d \n",
		    previousPosition.getX(),
		    previousPosition.getY(),
		    position.getX(),
		    position.getY());
		  this.setPosition(position);
	}
}
