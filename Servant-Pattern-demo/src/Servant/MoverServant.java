package Servant;


public class MoverServant {

	public MoverServant() {

	}

	public void MoveTo(Movable movingObj, Point pt) {
		Point previousPosition = movingObj.getPosition();
		  System.out.printf("Moving smoothly from position x=%d,y=%d to position x=%d,y=%d \n",
				    previousPosition.getX(),
				    previousPosition.getY(),
				    pt.getX(),
				    pt.getY());
		  movingObj.setPosition(pt);
	}
}
