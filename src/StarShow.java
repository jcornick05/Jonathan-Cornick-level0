import org.jointheleague.graphical.robot.Robot;

public class StarShow {
	
	Robot robot = new Robot("batman");
	
	void makeStars() {
		
		robot.setSpeed(8);
		int x = 10;  
     
		int y = 950;

        int s = 25;

            for (int i = 0; i < 30; i++) {
				
			robot.setPenWidth(i);
            }
			robot.setX(x);
	
			robot.setY(y);
	
			drawStar(s);
	
			x = x + s;
	
			y = y + s;
			
			// 15. decrease the Y position by star size. See Figure 3.
	
			// 16. Increase the star size by 20
	
			// 17. Turn the robot 12 degrees
			
	       for (int i = 0; i < 30; i++) {
			
			// 18. Make each star a different random color like in Figure 4. 

	       }
	}

	private void drawStar(int starSize) {
		robot.penDown();
		robot.setSpeed(10);
		for (int i = 0; i < 5; i++) {
			
		
			robot.move(starSize);	
			robot.turn(144);
		}
			
	}
	
	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}




