import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		
	 Robot R2D2 = new Robot();
	 
	R2D2.setPenWidth(50);
	R2D2.setRandomPenColor();
	R2D2.setSpeed(100);
	R2D2.penDown();
	R2D2.move(300);
	R2D2.turn(180);
	R2D2.move(300);	
	R2D2.turn(45);
	R2D2.move(50);
	R2D2.turn(45);
	R2D2.move(100);
	R2D2.turn(45);
	R2D2.move(50);
	R2D2.turn(45);
	R2D2.move(50);
	R2D2.hide();
		
		
		
		
	}
}
